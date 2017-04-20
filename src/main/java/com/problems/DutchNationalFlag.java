package com.problems;

/**
 * Created by Maks on 4/20/2017.
 * Sort an array containing 0’s, 1’s and 2’s (Dutch national flag problem)
 Given an array containing only 0’s, 1’s and 2’s, sort the array in linear time and using constant space
 */
public class DutchNationalFlag {


    public void solution1(Integer[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=start+1;
        while(start<=end&& mid<end){
            if(arr[start]==2){
                if(arr[end]==2) {
                    end--;
                }
                else { 
                    swap(arr, start, end);
                }
            }
            else if(arr[start]==1){
                if(arr[mid]==1){
                    mid++;
                }
                else {
                    swap(arr, start, mid);
                }
            }
            else if(arr[end]==0){
                if(arr[start]==0){
                    start++;
                    if(start>=mid)
                        mid++;
                }
                else {
                    swap(arr,end, start);
                }
            }
            else if (arr[start]==0){
                start++;
                if(start>=mid)
                    mid++;
            }
        }
    }

    private void swap(Integer[] arr, int start, int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
    }
}
