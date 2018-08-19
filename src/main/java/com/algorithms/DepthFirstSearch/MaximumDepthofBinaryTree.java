package com.algorithms.DepthFirstSearch;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class MaximumDepthofBinaryTree {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        return this.dfs(root, 1);
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth - 1;
        }
        if (node.left == null && node.right == null) {
            return depth;
        }
        int tmpDepth = depth;

        if (node.left != null) {
            int tmp = this.dfs(node.left, tmpDepth + 1);
            depth = Math.max(depth, tmp);
        }

        if (node.right != null) {
            int tmp = this.dfs(node.right, tmpDepth + 1);
            depth = Math.max(depth, tmp);
        }
        return depth;
    }
}
