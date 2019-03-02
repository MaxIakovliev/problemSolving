package com.algorithms.Repetition;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class MostFrequentSubtreeSum3 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Hashtable<Integer,Integer> _data=new Hashtable<>();
    private Integer _maxVal=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        this.dfs(root);
        for(Map.Entry<Integer,Integer> item:this._data.entrySet()){
            if (item.getValue()==this._maxVal){
                res.add(item.getKey());
            }
        }
        int[] output=new int[res.size()];
        for(int i=0; i<res.size();i++){
            output[i]=res.get(i);
        }
        return  output;

    }
    private Integer dfs(TreeNode node){
        if (node ==null){
            return 0;
        }
        Integer left=this.dfs(node.left);
        Integer right=this.dfs(node.right);
        Integer cur=left+right+node.val;
        if (_data.containsKey(cur)){
            _data.put(cur,_data.get(cur)+1);
        }
        else{
            _data.put(cur,0);
        }
        this._maxVal=Math.max(this._maxVal,_data.get(cur));
        return cur;
    }

}
