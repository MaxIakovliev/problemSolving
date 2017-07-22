package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 7/21/2017.
 * https://leetcode.com/problems/word-ladder-ii/#/description
 */
public class WordLadderII {
    private class Node {
        private String head;
        private List<Node> childs;

        public Node() {
            this.childs = new ArrayList<>();
        }

        public Node(String item) {
            this.childs = new ArrayList<>();
            head = item;
        }

        public String getHead() {
            return head;
        }

        public List<Node> getChilds() {
            return childs;
        }

        public boolean add(String word) {
            if (head == null) {
                head = word;
                return true;
            } else {
                int mismatchCount = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != head.charAt(i))
                        mismatchCount++;
                    if (mismatchCount > 1) {
                        break;
                    }
                }
                if (mismatchCount == 1) {
                    childs.add(new Node(word));
                    return true;
                }

                for (int i = 0; i < childs.size(); i++) {
                    boolean res = childs.get(i).add(word);
                    if (res)
                        return true;
                }
            }
            return false;
        }

    }

    private Node buildCustomTree(List<String> words) {
        Node res = new Node();
        for (int i = 0; i < words.size(); i++) {
            res.add(words.get(i));
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
            return res;
        }

        if (matched(startWord, node.getHead())) {
            res.add(node.getHead());
        }
        if (node.childs.size() > 0) {
            List<String> tmp = getBranch(node.getChilds().get(0), startWord, endWord);
            if (tmp.size() > 0) {
                res.addAll(tmp);
                node.childs.remove(0);
            }
        }

        return res;
    }

    public List<List<String>> getResult(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res=new ArrayList<>();
        Node tree = buildCustomTree(wordList);
        List<String> tmp = getBranch(tree, beginWord, endWord);
        if(tmp.size()>0){
            res.add(tmp);
        }
        return  res;
    }
}
