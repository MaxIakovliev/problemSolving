package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 6/18/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-14-maximum-sum-increasing-subsequence/
 */
public class MaximumSumIncreasingSubsequence {

    public int solution1(int[] arr){
        int[] tmp=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            tmp[i]=arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] &&
                        tmp[i]<tmp[j]+arr[i]){
                    tmp[i]=tmp[j]+arr[i];
                }
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i<tmp.length; i++){
            if(max<tmp[i])
                max=tmp[i];
        }

        return max;
    }
}
