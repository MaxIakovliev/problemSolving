package com.algorithms.sort;

import com.common.Randomizer;
import com.sun.glass.ui.SystemClipboard;

/**
 * Created by Maks on 2/14/2017.
 */
public class SelectionSort {

    public static void sort(Integer[] arr){

        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            swap(arr,i, min);
        }
    }
    private static void swap(Integer[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
       Integer[] arr=  new Randomizer().generateRandomArray(20);
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }

    }

}
