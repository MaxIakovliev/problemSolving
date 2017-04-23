package com.problems;

/**
 * Created by Maks on 4/23/2017.
 * http://www.techiedelight.com/find-maximum-difference-between-two-elements-array/
 */
public class MaximumDifferenceInArrayWithConstraints {
    public  int solution1(Integer[] arr){
        int max=0;
        int x=arr[0];
        boolean switched=false;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1] && arr[i]-x>max){
                max=arr[i]-x;
            }
            else if(arr[i]<arr[i-1])
                x=arr[i];
            else if(arr[i]>arr[i-1])
                switched=true;
        }

        if(max==0 && !switched)
            return arr[arr.length-1]-arr[0];

        return max;
    }
}
