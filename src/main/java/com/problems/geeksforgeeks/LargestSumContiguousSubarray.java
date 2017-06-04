package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {
    public int kadanesAlgorithm(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxEndHere=0;

        for(int i=0; i<arr.length; i++){
            maxEndHere+=arr[i];
            if(max<maxEndHere){
                max=maxEndHere;
            }

            if(maxEndHere<0){
                maxEndHere=0;
            }
        }
        return  max;
    }
}
