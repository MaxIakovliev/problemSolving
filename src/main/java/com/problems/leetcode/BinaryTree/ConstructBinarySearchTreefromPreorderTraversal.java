package com.problems.leetcode.BinaryTree;

class Solution {
/*
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return this.construct(preorder,Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
    private TreeNode construct(int[] preorder, int start, int end){
        if(this._idx==preorder.length ||preorder[this._idx]<start || preorder[this._idx]>end){
            return null;
        }
        int val=preorder[this._idx];
        this._idx++;
        TreeNode node=new TreeNode(val);
        node.left=this.construct(preorder, start, val);
        node.right=this.construct(preorder,val,end);
        return node;
    }
    private int _idx=0;
}
