package com.problems;

/**
 * Created by Maks on 5/2/2017.
 * http://www.techiedelight.com/find-maximum-product-subarray-given-array/
 */
public class MaximumProductSubarray  {


    public int solution1(Integer[] arr) {
        int curMax=arr[0];
        int curMin=arr[0];
        int maxResult=0;



        for(int i=1; i<arr.length; i++){
            int temp=curMax;
            curMax=Math.max(arr[i],Math.max(arr[i]*curMax, arr[i]*curMin));
            curMin=Math.min(arr[i],Math.min(arr[i]*temp, arr[i]*curMin));
            if(curMax>maxResult){
                maxResult=curMax;
            }

        }
        return maxResult;
    }
}
