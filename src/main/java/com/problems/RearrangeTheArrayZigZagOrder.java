package com.problems;

import com.algorithms.sort.HeapSort;

/**
 * http://www.techiedelight.com/rearrange-the-array-with-alternate-high-and-low-elements/
 * Created by Maks on 4/22/2017.
 */
public class RearrangeTheArrayZigZagOrder {

    public  void rearrangeArray(Integer[] arr){

        HeapSort sort=new HeapSort();
        //Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            if(i+2< arr.length && arr[i]< arr[i+1] && arr[i]<arr[i+2])
                swap(arr, i+1, i+2);
            else if(i+2< arr.length && arr[i]> arr[i+1] && arr[i]>arr[i+2])
                swap(arr, i, i+1);

            i+=2;
        }
    }
    public void swap(Integer[] arr, int x, int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
}
