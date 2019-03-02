package com.algorithms.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueinEachTreeRow {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> largestValues(TreeNode root) {

        this.res = new ArrayList<>();
        this.dfs(root,1);
        return  this.res;

    }

    private List<Integer> res;

    private void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (this.res.size() < depth) {
            this.res.add((Integer.MIN_VALUE));
        }
        this.res.set(depth - 1, Math.max(this.res.get(depth - 1), node.val));

        this.dfs(node.left, depth + 1);
        this.dfs(node.right, depth + 1);
        return;
    }
}
