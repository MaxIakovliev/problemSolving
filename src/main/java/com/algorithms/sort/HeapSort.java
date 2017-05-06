package com.algorithms.sort;

import com.common.Randomizer;

/**
 * Created by Maks on 2/17/2017.
 */
public class HeapSort {
    private static int left(int i){
        return i*2;
    }

    private static int right(int i){
        return i*2+1;
    }

    private static void swap(Integer[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    private static void maxHeapify(Integer[] arr, int i){
        int l=left(i);
        int r=right(i);
        int largest=i;
       if(l<=total && arr[l].compareTo(arr[largest])>0)
            largest=l;

        if(r<=total && arr[r].compareTo(arr[largest])>0)
            largest=r;

        if(largest!=i){
            swap(arr,i,largest);
            maxHeapify(arr,largest);
        }
    }

    private static void buildMaxHeap(Integer[] arr){
        for(int i=total/2; i>=0; i--){
            maxHeapify(arr,i);
        }
    }
    private static int total;
    public  static void sort(Integer[] arr){
        total = arr.length - 1;
        buildMaxHeap(arr);
        for(int i=total; i>0; i--){
            swap(arr,0,i);
            total--;
            maxHeapify(arr,0);
        }
    }

    public static void main(String[] args) {
        Integer[] arr=  new Randomizer().generateRandomArray(20);
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }

    }
}
