package com.algorithms.sort;

import com.common.Randomizer;

/**
 * Created by Maks on 2/16/2017.
 */
public class InsertionSort {

    public static void  sort(Integer[]arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0 && arr[j]<arr[j-1]; j--){
                swap(arr, j,j-1);
            }
        }
    }

    public  static void swap(Integer[]arr, int i,int j){
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
