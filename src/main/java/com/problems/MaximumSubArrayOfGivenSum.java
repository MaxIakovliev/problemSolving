package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/19/2017.
 */
public class MaximumSubArrayOfGivenSum {
    public  List<Integer>  solution1(Integer[] arr, Integer sum){
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            List<Integer> cur=new ArrayList<Integer>();
            int tmpSum=0;
            for(int j=i; j<arr.length; j++){
                cur.add(arr[j]);
                tmpSum+=arr[j];
                if(tmpSum==sum && cur.size()>result.size()){
                    result.clear();
                    result.addAll(cur);
                }
            }
        }
        return result;
    }
}

