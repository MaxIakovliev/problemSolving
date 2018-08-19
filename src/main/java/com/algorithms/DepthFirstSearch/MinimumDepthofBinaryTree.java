package com.algorithms.DepthFirstSearch;

public class MinimumDepthofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public int minDepth(TreeNode root) {
        return this.dfs(root);
    }
    private int dfs(TreeNode node){
        if (node ==null)
            return 0;
        int left=this.dfs(node.left);
        int right=this.dfs(node.right);
        if (left>0 && right>0)
            return 1+Math.min(left,right);
        return 1+Math.max(left,right);
    }
}
