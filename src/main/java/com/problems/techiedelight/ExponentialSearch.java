package com.problems.techiedelight;

/**
 * Created by Maks on 5/16/2017.
 * http://www.techiedelight.com/exponential-search/
 */
public class ExponentialSearch implements ISearch {
    public Integer findElement(Integer[] arr, int x) {

        if(arr[0]==x)
            return 0;
        int lo=1;
        while(lo<arr.length-1 && arr[lo]<x){
            lo*=2;
        }
        return  new BinarySearch().findElement(arr,x,(lo/2),Math.min(lo,arr.length-1));
    }
}
