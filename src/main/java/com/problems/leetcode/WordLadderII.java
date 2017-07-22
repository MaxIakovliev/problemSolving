package com.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maks on 7/21/2017.
 * https://leetcode.com/problems/word-ladder-ii/#/description
 */
public class WordLadderII {
    private class Node {
        private String head;
        private List<Node> childs;
        private boolean visited;

        public Node() {
            this.childs = new ArrayList<>();
            setVisited(false);
        }

        public Node(String item) {
            this.childs = new ArrayList<>();
            head = item;
            setVisited(false);
        }

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public List<Node> getChilds() {
            return childs;
        }

        public void addChild(String str) {
            childs.clear();
            childs.add(new Node(str));
        }

        public boolean add(String word, int level) {
//            if (level > 1)
//                return false;
            if (head == null) {
                head = word;
                return true;
            } else {

                if (matched(word, head)) {
                    childs.add(new Node(word));
                    return true;
                }


                boolean result=false;
                for (int i = 0; i < childs.size(); i++) {
                    boolean res = childs.get(i).add(word, level + 1);
                    if(res)
                        result=res;
                }
                return result;
            }
            //return false;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }
    }

    private Node buildCustomTree(List<String> words, String startWord, String endWord) {
        ArrayList<String> iwords=new ArrayList<String>(words);
        Node res = new Node();
        boolean foundEndWord = false;
        boolean foundStartWord = false;
        int i=0;
        //for (int i = 0; i < words.size(); i++) {
        int lastSize=iwords.size();
        while(iwords.size()>0){
            if(i>=iwords.size()){
                i=0;
                if(lastSize==iwords.size()){
                    break;
                }
                lastSize=iwords.size();
            }
            if(res.add(iwords.get(i), 0)) {
                if (iwords.get(i).equals(endWord))
                    foundEndWord = true;

                if (iwords.get(i).equals(startWord))
                    foundStartWord = true;

                iwords.remove(i);
            }
            else
                i++;
        }
        if (!foundEndWord)
            return null;

        if (foundStartWord && startWord.length() == 1) {
            res = new Node();
            if (matched(startWord, endWord)) {
                res.setHead(startWord);
                res.addChild(endWord);
            } else
                return null;
        }

        return res;
    }


 


    private boolean matched(String s1, String s2) {
        int mismatch = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatch++;
            }
            if (mismatch > 1)
                return false;
        }
        return true;
    }

    private List<String> getBranch(Node node, String startWord, String endWord) {
        List<String> res = new ArrayList<>();

        if (node.getHead().equals(endWord)) {
            res.add(node.getHead());
            if (node.childs.size() == 0)
                node.setVisited(true);
            return res;
        }

        if (matched(startWord, node.getHead())) {
            res.add(node.getHead());
            if (node.childs.size() == 0)
                node.setVisited(true);
        }
        if (node.childs.size() > 0) {
            int countVisited = 0;
            for (int i = 0; i < node.childs.size(); i++) {
                if (!node.childs.get(i).isVisited()) {
                    List<String> tmp = getBranch(node.getChilds().get(i), node.getHead(), endWord);
                    if (tmp.size() > 0) {
                        res.addAll(tmp);
                        // if(node.childs.get(i).childs.size()==0)
                        //    node.childs.remove(i);
                    }
                    break;
                } else {
                    countVisited++;
                }
            }
            if (countVisited == node.childs.size() - 1) {
                node.childs.clear();
                node.setVisited(true);
            }


        }

        return res;
    }

    public List<List<String>> getResult(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        boolean endFound=false;
        boolean startFound=false;
        for(int i=0; i<wordList.size(); i++){
            if(beginWord.equals(wordList.get(i)))
                startFound=true;
            if(endWord.equals(wordList.get(i)))
                endFound=true;

            if(startFound && endFound && matched(beginWord, endWord)){
                List<String> tmp= Arrays.asList(beginWord,endWord);
                res.add(tmp);
                return  res;
            }

        }
        Node tree = buildCustomTree(wordList, beginWord, endWord);
        if (tree == null) {
            return res;
        }
        while (tree.childs.size() > 0) {
            List<String> tmp = getBranch(tree, beginWord, endWord);



            if (tmp != null && tmp.size() > 0) {
                List<String> shorterList=new ArrayList<>();
                if (!tmp.get(0).equals(beginWord)) {
                    boolean correctSync = true;
                    for (int i = 0; i < tmp.size() - 1; i++) {
                        if (!matched(tmp.get(0), beginWord)
                                || !matched(tmp.get(i), tmp.get(i + 1))
                                || !matched(tmp.get(tmp.size()-1),endWord)) {
                            correctSync = false;
                            break;
                        }
                        shorterList.add(tmp.get(i));
                        if(matched(tmp.get(i), endWord) && !tmp.get(i).equals(endWord)){
                            tmp.clear();
                            tmp.addAll(shorterList);
                            break;
                        }
                    }
                    if (correctSync) {
                        tmp.add(0, beginWord);
                    } else if (matched(tmp.get(tmp.size() - 1), beginWord)) {
                        List<String> revertedTmp = new ArrayList<>();
                        if(!tmp.get(tmp.size() - 1).equals(beginWord))
                        revertedTmp.add(beginWord);
                        for (int i = tmp.size() - 1; i >= 0; i--) {
                            revertedTmp.add(tmp.get(i));
                            if (matched(revertedTmp.get(revertedTmp.size() - 1), endWord)) {
                                revertedTmp.add(endWord);
                                break;
                            }
                        }
                        tmp.clear();
                        tmp.addAll(revertedTmp);
                    }
                }
                if (matched(endWord, tmp.get(tmp.size() - 1))) {
                    if (!tmp.get(tmp.size() - 1).equals(endWord))
                        tmp.add(endWord);
                } else
                    tmp.clear();

                if (tmp != null && tmp.size() > 0) {

                    if(res.size()>0 && res.get(res.size()-1).size()>tmp.size()){
                        res.remove(res.size()-1);
                    }

                    if(res.size()>0 && res.get(res.size()-1).size()==tmp.size())
                        res.add(tmp);
                    else
                        res.add(tmp);
                }
            }

        }
        return res;
    }
}
