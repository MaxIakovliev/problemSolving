package com.problems.techiedelight;

/**
 * Created by Maks on 5/13/2017.
 */
public class QuickSort {
    private int partition(Integer[] arr, int lo, int hi){

        int pivot=arr[hi];
        int i=lo-1;
        for(int j=lo; j<hi; j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }

        swap(arr,i+1, hi);

        return  i+1;
    }

    private void swap(Integer[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    private void sort(Integer[] arr, int lo, int hi){
        if(lo<hi) {
            int pivotal = partition(arr, lo, hi);
            sort(arr,lo, pivotal-1);
            sort(arr,pivotal+1, hi);
        }
    }

    public  void sort(Integer[] arr){
        sort(arr, 0, arr.length-1);
    }
}
