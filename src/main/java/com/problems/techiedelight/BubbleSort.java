package com.problems.techiedelight;

/**
 * Created by Maks on 5/10/2017.
 * Bubble sort http://www.techiedelight.com/bubble-sort-iterative-recursive/
 */
public class BubbleSort {
    public  void iterative(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-1; j++){
                if(arr[j-1]>arr[j]){
                    int tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
