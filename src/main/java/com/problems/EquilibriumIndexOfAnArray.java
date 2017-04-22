package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/22/2017.
 * http://www.techiedelight.com/find-equilibrium-index-array/
 */
public class EquilibriumIndexOfAnArray {

    public List<Integer> solution1(Integer[]arr){
        int totalSum=calcTotal(arr);
        List<Integer> res=new ArrayList<Integer>();
        int cur=0;
        for(int i=0; i<arr.length; i++){
            totalSum-=arr[i];
            if(i>0)
                cur+=arr[i-1];
            if(cur==totalSum){
                res.add(i);
            }
        }
        return  res;
    }

    private int calcTotal(Integer[] arr) {
        int res=0;
        for(int i=0; i<arr.length; i++){
            res+=arr[i];
        }
        return res;
    }

}
