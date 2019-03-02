package com.algorithms.Repetition;

public class BinaryTreeMaximumPathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int maxPathSum(TreeNode root) {
        this.dfs(root);
        return this.maxSoFar;
    }
    private int maxSoFar=Integer.MIN_VALUE;

    private int dfs(TreeNode node){
        if (node ==null)
            return 0;
        int left=this.dfs(node.left);
        int right=this.dfs(node.right);
        int curVal=left+right+node.val;
        this.maxSoFar=Math.max(this.maxSoFar, curVal);
        return  Math.max(Math.max(left+node.val,node.val+right),0);
    }
}
