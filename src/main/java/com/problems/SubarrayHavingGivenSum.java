package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/29/2017.
 * http://www.techiedelight.com/find-subarray-having-given-sum-given-array/
 */
public class SubarrayHavingGivenSum {

    public Pair<Integer, Integer> solution1(Integer[] arr, int sum){

        int left=0;
        int window=0;
        int tmp=0;
        for(int i=0; i<arr.length; i++){
            if(tmp>sum){
                tmp=tmp-arr[left];
                left++;
            }
            if(tmp==sum){
                return  new Pair<Integer, Integer>(left,i);
            }
        }
        return  new Pair<Integer, Integer>(-1,-1);
    }
}
