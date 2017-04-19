package com.problems;

/**
 * Created by Maks on 4/18/2017.
 */
public class SortBinaryArrayInLinearTime {

    public  void Solution1(Integer[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            if(arr[start]==1 && arr[end]==1) {
                end--;
            }
            else if(arr[start]>arr[end]){
                swap(arr,start, end);
                start++;
                end--;
            }
            else if(arr[start]==0 && arr[end]==0){
                start++;
            }
            else start++;
        }
    }

    private void swap(Integer[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
