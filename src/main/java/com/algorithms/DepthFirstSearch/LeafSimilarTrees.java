package com.algorithms.DepthFirstSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeafSimilarTrees {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        dfs(root1, l1);
        dfs(root2, l2);
        return l1.equals(l2);
    }


    private void dfs(TreeNode node, List<Integer> storage) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            storage.add(node.val);
        }
        dfs(node.left, storage);
        dfs(node.right, storage);

    }

    private List<Integer> getLeafs(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left == null && curr.right == null) {
                res.add(curr.val);
            } else {
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return res;
    }
}
