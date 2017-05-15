package com.problems.techiedelight;

/**
 * Created by Maks on 5/15/2017.
 * http://www.techiedelight.com/positive-and-negative-integers-segregate/
 */
public class SegregatePosNegNumbers {

    /*
    Complexity O(n)
    use two links from both sides of array
    walk through array one time  swap items
     */
    public void  twoRefs(Integer[] arr){
        //-1 -1 -1 2 -1 -1
        int start=0; int end=arr.length-1;
        while(start<end){
            if(arr[start]>0 && arr[end]<0){
                int tmp=arr[start];
                arr[start]=arr[end];
                arr[end]=tmp;
                start++;
                end--;
            }
            if(arr[start]<0)
                start++;

            if(arr[end]>0)
                end--;
        }
    }
}
