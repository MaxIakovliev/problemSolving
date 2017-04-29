package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/29/2017.
 * http://www.techiedelight.com/find-maximum-sequence-of-continuous-1s-can-formed-replacing-k-zeroes-ones/
 */
public class MaximumSequenceByReplacingKZeroes {

    public Pair<Integer,Integer> solutio1(Integer[] arr, int k){
        int max=0;
        int leftIdx=0;
        int left=0;
        int count=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==0){
                count++;
            }
            while(count>k){
                if(arr[left]==0){
                    count--;
                }
                left++;
            }

            if(i-left>max){
                leftIdx=left;
                max=i-left;
            }
        }
        return  new Pair<Integer, Integer>(leftIdx,leftIdx+max);

    }
}
