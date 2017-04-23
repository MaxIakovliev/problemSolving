package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/23/2017.
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem
 * http://www.techiedelight.com/maximum-subarray-problem-kadanes-algorithm/
 */
public class MaximumSubarrayProblem {

    public  int solution1(Integer[] arr){
        int max=arr[0];
        int tmp=arr[0];
        for(int i=1; i<arr.length; i++){
            tmp=Math.max(arr[i], arr[i]+tmp);
            max=Math.max(max, tmp);
        }
        return  max;
    }

    public Pair<Integer,Integer> solution2WithSubArrayIndx(Integer[] arr){
        int max=arr[0];
        int tmp=arr[0];
        int x=0;
        int y=0;
        for(int i=1; i<arr.length; i++){
            //tmp=Math.max(arr[i], arr[i]+tmp);
            if(arr[i]>arr[i]+tmp){
                tmp=arr[i];
                x=i;
            }
            else tmp+=arr[i];
            //max=Math.max(max, tmp);
            if(max<tmp){
                y=i;
                max=tmp;
            }
        }
        if(y<x)
            y=arr.length-1;

        return new Pair<Integer, Integer>(x,y);

    }
}
