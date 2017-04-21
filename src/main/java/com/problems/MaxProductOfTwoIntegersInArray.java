package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/21/2017.
 */
public class MaxProductOfTwoIntegersInArray {
    public Pair<Integer, Integer> Solution1(Integer[] arr){
        int max=Integer.MIN_VALUE;
        int x=-1;
        int y=-1;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(max< arr[i]*arr[j]){
                    max=arr[i]*arr[j];
                    x=i;
                    y=j;
                }
            }
        }
        return new Pair<Integer, Integer>(x,y);
    }
}
