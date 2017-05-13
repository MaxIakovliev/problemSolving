package com.problems.techiedelight;

/**
 * Created by Maks on 5/10/2017.
 */
public class InsertionSort {
    public  void iterativeSort(Integer[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0 && arr[j]<arr[j-1]; j--){
                swap(arr, j, j-1);

            }
        }
    }

    public  void iterativeSort(Integer[] arr, int lo, int hi){
        for(int i=lo; i<hi; i++){
            for(int j=i; j>0 && arr[j]<arr[j-1]; j--){
                swap(arr, j, j-1);

            }
        }
    }

    private void swap(Integer[] arr, int j, int i) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
