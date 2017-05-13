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

    private void sortIterative(Integer[] arr, int lo, int hi){
        Integer[] stack=new Integer[hi-lo+1];
        int top=-1;
        stack[++top]=lo;
        stack[++top]=hi;

        while(top>=0){
            hi=stack[top--];
            lo=stack[top--];
            if(lo<hi) {
                int pivotal = partition(arr, lo, hi);
                if (pivotal - 1 > 1) {
                    stack[++top] = lo;
                    stack[++top] = pivotal - 1;
                }

                if (pivotal + 1 < hi) {
                    stack[++top] = pivotal + 1;
                    stack[++top] = hi;
                }
            }

        }
    }

    private  void sortHybrid(Integer[] arr, int lo, int hi){
        while(lo<hi){
            if(hi-lo<10){
                InsertionSort insort=new InsertionSort();
                insort.iterativeSort(arr, lo, hi);
            }
            else {
                int pivotal= partition(arr, lo, hi);
                if(pivotal-lo<hi-pivotal){
                    sortHybrid(arr, lo, pivotal-1);
                    lo=pivotal+1;
                }
                else {
                    sortHybrid(arr, pivotal+1, hi);
                    hi= pivotal-1;
                }
            }
        }
    }

    public  void sortHybrid(Integer[] arr){
        sortHybrid(arr, 0, arr.length-1);
    }

    public  void sortIterative(Integer[] arr){
        sortIterative(arr, 0, arr.length-1);
    }

    public  void sort(Integer[] arr){
        sort(arr, 0, arr.length-1);
    }

}
