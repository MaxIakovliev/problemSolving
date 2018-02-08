package com.problems.leetcode;

/**
 * Created by Maks on 2/8/2018.
 * https://leetcode.com/problems/add-and-search-word-data-structure-design/description/
 */
public class AddSearchWord {
    private class TreeNode {
        public TreeNode[] childs = new TreeNode[26];
        public String word = "";
    }

    private TreeNode root = new TreeNode();


    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (node.childs[idx] == null) {
                node.childs[idx] = new TreeNode();
            }
            node = node.childs[idx];
        }
        node.word = word;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return match(word.toCharArray(),0,root);
    }

    private boolean match(char[] arr, int idx, TreeNode node){
        if (idx==arr.length)
            return !node.word.equals("");
        if(arr[idx]!='.'){
            return (node.childs[arr[idx]-'a']!=null) && match(arr,idx+1,node.childs[arr[idx]-'a']);
        }
        else {
            for(int i=0; i< node.childs.length; i++){
                if(node.childs[i]!=null){
                    if(match(arr,idx+1,node.childs[i])){
                        return  true;
                    }
                }
            }
        }
        return  false;
    }
}
