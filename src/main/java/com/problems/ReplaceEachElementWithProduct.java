package com.problems;

/**
 * Created by Maks on 4/22/2017.
 */
public class ReplaceEachElementWithProduct {
    public  void solution1(Integer[] arr){
        Integer[] left=new Integer[arr.length];
        Integer[] right=new Integer[arr.length];
        left[0]=1;
        for(int i=1;i<arr.length; i++){
            left[i]=left[i-1]*arr[i-1];
        }

        right[arr.length-1]=1;
        for(int i=arr.length-2; i>=0; i--){
            right[i]=right[i+1]*arr[i+1];
        }

        for(int i=0; i<arr.length; i++){
            arr[i]=left[i]*right[i];
        }
    }
}
