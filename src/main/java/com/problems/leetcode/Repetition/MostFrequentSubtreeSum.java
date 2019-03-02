package com.problems.leetcode.Repetition;


import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubtreeSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    private HashMap<Integer,Integer> _data=new HashMap<>();
    private Integer _maxSoFar=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        this.dfs(root);
        int count=0;
        for (Map.Entry<Integer,Integer> item: this._data.entrySet()){
            if (item.getValue()==this._maxSoFar){
                count++;
            }
        }
        int[]res=new int[count];
        int i=0;
        for (Map.Entry<Integer,Integer> item :this._data.entrySet()){
            if (item.getValue()==this._maxSoFar){
                res[i++]=item.getKey();
            }
        }
        return  res;
    }

    private Integer dfs(TreeNode node){
        if (node==null){
            return 0;
        }
        Integer left=dfs(node.left);
        Integer right=dfs(node.right);
        Integer currentVal=left+right+node.val;
        if (this._data.containsKey(currentVal)){
            this._data.put(currentVal,this._data.get(currentVal)+1);
        }
        else {
            this._data.put(currentVal,0);
        }
        this._maxSoFar=Math.max(this._maxSoFar, this._data.get(currentVal));

        return  currentVal;
    }
}
