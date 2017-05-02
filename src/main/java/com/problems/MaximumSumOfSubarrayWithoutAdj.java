package com.problems;

/**
 * Created by Maks on 5/2/2017.
 * http://www.techiedelight.com/maximum-sum-of-subsequence-with-no-adjacent-elements/
 */
public class MaximumSumOfSubarrayWithoutAdj {
    public  int solution1(Integer[] arr){
        int inc=arr[0];
        int exl=0;
        for(int i=0; i<arr.length; i++){
            int tmp=Math.max(inc,exl);
            inc=exl+arr[i];
            exl=tmp;
        }
        return Math.max(exl,inc);
    }
}
