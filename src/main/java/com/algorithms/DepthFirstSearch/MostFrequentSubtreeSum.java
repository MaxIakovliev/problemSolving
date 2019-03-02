package com.algorithms.DepthFirstSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentSubtreeSum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer,Integer> data=new HashMap<>();
        this.post(root, data);
        List<Integer> tmp=new ArrayList<>();
        for (Integer key: data.keySet()){
            if (this.maxVal==data.get(key)){
                tmp.add(key);
            }
        }

        int[] result=new int[tmp.size()];
        for (int i=0; i<tmp.size();i++){
            result[i]=tmp.get(i);
        }
        return  result;
    }
    private int maxVal=0;

    private int post(TreeNode node, Map<Integer,Integer> data){
        if (node ==null){
            return  0;
        }
        int left=post(node.left,data);
        int right=post(node.right,data);
        Integer curSum=left+right+node.val;
        Integer count=1;
        if (data.containsKey(curSum)){
            count=data.get(curSum);
        }
        data.put(curSum,count);

        this.maxVal=Math.max(this.maxVal, count);
        return curSum;
    }
}
