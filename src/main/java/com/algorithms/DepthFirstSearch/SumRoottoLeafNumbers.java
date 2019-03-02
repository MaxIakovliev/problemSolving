package com.algorithms.DepthFirstSearch;

public class SumRoottoLeafNumbers {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int sumNumbers(TreeNode root) {
        if (root==null)return  0;
        return this.sumUp(root,0);
    }

    private int sumUp(TreeNode node, int curSum){
        if (node.left==null && node.right==null){
            return curSum*10+node.val;
        }
        int res=0;
        if (node.left!=null)
            res+=this.sumUp(node.left,curSum*10+node.val);

        if(node.right!=null)
            res+=this.sumUp(node.right,curSum*10+node.val);

        return  res;
    }
}
