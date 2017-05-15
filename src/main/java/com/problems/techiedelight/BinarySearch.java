package com.problems.techiedelight;

/**
 * Created by Maks on 5/15/2017.
 * http://www.techiedelight.com/binary-search/
 */
public class BinarySearch {
    public Integer findElement(Integer[] arr, Integer el){
        return  findElement(arr,el, 0, arr.length-1);
    }

    private Integer findElement(Integer[] arr, Integer el, int start, int end){
        int mid= (end-start)/2;
        if(mid==0) return  -1;
        if(arr[mid]>el)
            return findElement(arr, el,start, mid);
        else if(arr[mid]<el)
            return  findElement(arr, el, mid+1,end);
        else
            return mid;
    }
}
