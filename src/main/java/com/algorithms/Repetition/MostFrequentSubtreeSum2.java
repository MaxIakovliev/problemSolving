package com.algorithms.Repetition;


import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubtreeSum2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    HashMap<Integer,Integer> data =new HashMap<>();
    private Integer maxSoFar=0;

    public int[] findFrequentTreeSum(TreeNode root) {
        this.post(root);
        int count=0;
        for (Map.Entry<Integer, Integer> item:this.data.entrySet()){
            if (item.getValue()==this.maxSoFar){
                count++;
            }
        }
        int[] res=new int[count];
        count=0;
        for (Map.Entry<Integer, Integer> item:this.data.entrySet()){
            if (item.getValue()==this.maxSoFar){
                res[count++]=item.getKey();
            }
        }
        return res;



    }
    private int post(TreeNode node){
        if (node ==null){
            return  0;
        }
        int left=this.post(node.left);
        int right=this.post(node.right);
        int curVal= left+right+node.val;
        if (this.data.containsKey(curVal)){
            this.data.put(curVal, this.data.get(curVal)+1);
        }
        else{
            this.data.put(curVal,0);
        }
        this.maxSoFar=Math.max(this.maxSoFar,this.data.get(curVal));
        return curVal;
    }
}
