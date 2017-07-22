package com.problems.geeksforgeeks.dp;

import javafx.util.Pair;

import java.util.Arrays;

/**
 * Created by Maks on 6/18/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-20-maximum-length-chain-of-pairs/
 */
public class MaximumLengthChainOfPairs {
    public  int solution1(Pair<Integer, Integer> arr[]){
        int[] tmp=new int[arr.length];
        Arrays.fill(tmp,1);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j].getValue()<arr[i].getKey() &&
                        tmp[i]<tmp[j]+1){
                    tmp[i]=tmp[j]+1;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<tmp[i])
                max=tmp[i];
        }
        return  max;
    }
}
