package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 5/2/2017.
 * http://www.techiedelight.com/find-maximum-product-subarray-given-array/
 */
public class MaximumProductSubarray implements IArrayInPairOut {


    public Pair<Integer,Integer> solution1(Integer[] arr) {
        int curMax=0;
        int curMin=0;
        int maxResult=0;
        int left=0;
        int right=0;


        for(int i=0; i<arr.length; i++){
            int temp=curMax;
            curMax=Math.max(arr[i],Math.max(arr[i]*curMax, curMin));
            curMin=Math.min(arr[i]*temp, arr[i]*curMin);
            if(curMax>maxResult){
                left=i;
                right=i;
                maxResult=curMax;
            }
            else {
                right = i;
            }
        }
        return new Pair<Integer, Integer>(left, right);
    }
}
