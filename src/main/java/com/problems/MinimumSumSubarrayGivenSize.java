package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/29/2017.
 * http://www.techiedelight.com/find-minimum-sum-subarray-given-size-k/
 */
public class MinimumSumSubarrayGivenSize {
    public Pair<Integer,Integer> solution1(Integer[] arr, int k){
        int min=Integer.MAX_VALUE;
        int leftIdx=0;
        int window=0;
        int tmp=0;

        for(int i=0; i<arr.length; i++){
            if(window==k){
                if(tmp<min){
                    min=tmp;
                    leftIdx=i-window;
                }
                tmp=0;
                i=i-window+1;
                window=0;
            }8


                tmp += arr[i];
                window++;

        }

        return  new Pair<Integer, Integer>(leftIdx, leftIdx+k-1);
    }
}
