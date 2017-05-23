package com.problems.techiedelight;

/**
 * Created by Maks on 5/23/2017.
 * http://www.techiedelight.com/partition-problem/
 */
public class PartitionProblem {

    private boolean recursive(Integer[] arr, int n, int sum){
        if(sum==0){
            return  true;
        }

        if(n<0|| sum<0){
            return  false;
        }
        boolean include=recursive(arr, n-1,sum-arr[n]);
        boolean exclude=recursive(arr, n-1, sum);
        return include || exclude;

    }
    public  boolean recursive(Integer[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return  recursive(arr, arr.length-1, sum/2);

    }
}
