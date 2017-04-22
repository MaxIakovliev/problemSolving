package com.problems;

/**
 * Created by Maks on 4/22/2017.
 */
public class MoveAllZerosToTheEnd {

    public  void solution1(Integer[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==arr[end] &&arr[start]== 0){
                end--;
                start++;
            }
            else if(arr[start]==0){
                shift(arr, start);
                end--;
            }
            else
                start++;
        }
    }

    private void shift(Integer[] arr, int i){
        int tmp=arr[i];
        for(int k=i; k<arr.length-1; k++){
            if(k+1< arr.length)
             swap(arr,k,k+1);
        }
    }
    public  void swap(Integer[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
