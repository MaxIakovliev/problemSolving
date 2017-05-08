package com.problems.techiedelight;

/**
 * Created by Maks on 5/8/2017.
 * http://www.techiedelight.com/convert-max-heap-min-heap-linear-time/
 */
public class MaxHeapIntoMinHeap {
    public  void solution1(Integer[] arr){
        int i=(arr.length-1)/2;
        while(i>=0){
            heapify(arr, i--,arr.length-1);
        }

    }

    private void heapify(Integer[] arr, int i, int size){
        int l=left(i);
        int r=right(i);
        int min=arr[i];
        if(l<size &&arr[l].compareTo(arr[i])<0 ){
            min=l;
        }

        if(r<size && arr[r].compareTo(arr[l])<0){
            min=r;
        }
        if(min!=i){
            swap(arr,i,min);
            heapify(arr,min,size);
        }

    }

    private void swap(Integer[] arr, int i, int min) {
        int tmp=arr[i];
        arr[i]=arr[min];
        arr[min]=tmp;
    }


    private int left(int x){
        return  2*x;
    }

    private int right(int x){
        return  2*x+1;
    }
}
