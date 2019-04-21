package com.problems.leetcode.BinaryTree;

public class BinaryTreePruning {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public TreeNode pruneTree(TreeNode root) {
        this.dfs(root);
        return root;
    }
    private boolean dfs(TreeNode node){
          if (node==null)
              return true;
          boolean lres=this.dfs(node.left);
          boolean rres=this.dfs(node.right);
          if (lres)
              node.left=null;
          if (rres)
              node.right=null;
          if (lres && rres && node.val==0)
              return true;
          return  false;
    }
}
