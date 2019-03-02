package com.problems.leetcode.Repetition;

public class BinaryTreeMaximumPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Integer _maxSoFar=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        this.dfs(root);
        return this._maxSoFar;
    }
    private Integer dfs(TreeNode node){
        if (node==null){
            return 0;
        }
        Integer left=this.dfs(node.left);
        Integer right=this.dfs(node.right);
        Integer curVal=left+right+node.val;
        this._maxSoFar=Math.max(this._maxSoFar, curVal);
        return Math.max(left+node.val,Math.max(right+node.val,0));
    }

}
