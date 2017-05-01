package com.problems;

/**
 * Created by Maks on 5/1/2017.
 * http://www.techiedelight.com/trapping-rain-water-within-given-set-bars/s
 */
public class TrappingRainWater {

    public  int solution1(Integer[] arr){
        Integer[] helper =new Integer[arr.length];
        helper[0]=Integer.MIN_VALUE;
        for(int i=1;i<arr.length-1; i++){
            helper[i]= Math.max(helper[i-1], arr[i-1]);
        }

        int tmp=Integer.MIN_VALUE;
        int result=0;

        for(int i=arr.length-2; i>=1; i--){
            tmp=Math.max(tmp,arr[i+1]);
            if(Math.min(tmp, helper[i])>arr[i]){
                result+=Math.min(tmp, helper[i])-arr[i];
            }
        }

        return  result;
    }
}
