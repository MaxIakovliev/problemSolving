package com.problems.techiedelight;

/**
 * Created by Maks on 5/10/2017.
 */
public class SelectionSort {

    public void iterative(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
