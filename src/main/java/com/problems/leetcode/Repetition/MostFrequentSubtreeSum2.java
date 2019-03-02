package com.problems.leetcode.Repetition;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubtreeSum2 {

    /*
    Jast to make sure - we have an idea - what type of
    data structure we are going to operate
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private Integer _maxSoFar=0;
    private HashMap<Integer,Integer> _data=new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        this.dfs(root);
        int count=0;
        for(Map.Entry<Integer,Integer> item:this._data.entrySet()){
            if (item.getValue()==this._maxSoFar){
                count++;
            }
        }
        int[] result=new int[count];int i=0;
        for (Map.Entry<Integer,Integer> item:this._data.entrySet()){
            if (item.getValue()==this._maxSoFar){
                result[i++]=item.getKey();
            }
        }
        return result;
    }

    private Integer dfs(TreeNode node){
        if (node==null){
            return  0;
        }
        Integer left=this.dfs(node.left);
        Integer right=this.dfs(node.right);
        Integer currentVal=left+right+node.val;
        if (this._data.containsKey(currentVal)){
            this._data.put(currentVal,this._data.get(currentVal)+1);
        }
        else{
            this._data.put(currentVal,1);
        }
        this._maxSoFar=Math.max(this._maxSoFar,this._data.get(currentVal));
        return currentVal;
    }


}