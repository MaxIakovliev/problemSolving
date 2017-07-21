package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 7/21/2017.
 * https://leetcode.com/problems/word-ladder-ii/#/description
 */
public class WordLadderII {
    private class Node{
        private String head;
        private List<Node> childs;

        public Node(){
            this.childs=new ArrayList<>();
        }
        public Node(String item){
            this.childs=new ArrayList<>();
            head=item;
        }

        public String getHead() {
            return head;
        }

        public List<Node> getChilds() {
            return childs;
        }

        public boolean add(String word){
            if(head==null){
                head=word;
                return  true;
            }
            else {
                int mismatchCount=0;
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i)!=head.charAt(i))
                        mismatchCount++;
                    if(mismatchCount>1){
                        break;
                    }
                }
                if(mismatchCount==1){
                    childs.add(new Node(word));
                    return  true;
                }

                for(int i=0; i<childs.size(); i++){
                    boolean res=childs.get(i).add(word);
                    if (res)
                        return  true;
                }

            }

            return false;
        }
    }

    private Node buildCustomTree(List<String> words){
        Node res=new Node();
        for(int i=0; i<words.size(); i++){
            res.add(words.get(i));
        }
        return  res;
    }
}
