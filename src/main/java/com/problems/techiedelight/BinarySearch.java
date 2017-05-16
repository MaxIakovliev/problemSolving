package com.problems.techiedelight;

/**
 * Created by Maks on 5/15/2017.
 * http://www.techiedelight.com/binary-search/
 */
public class BinarySearch {
    public Integer findElement(Integer[] arr, Integer el){
        return  findElement(arr,el, 0, arr.length-1);
    }

    public   Integer findElement(Integer[] arr, Integer el, int start, int end){
        int mid= (end+start)/2;
        if(arr[start]==el)
            return  start;
        if(arr[end]==el)
            return  end;
        if(arr[mid]==el)
            return mid;
        if(arr[end]<el && end==arr.length-1)
            return -1;
        if(mid==0) return  -1;
        if(arr[mid]>el)
            return findElement(arr, el,start, mid);
        else if(arr[mid]<el)
            return  findElement(arr, el, mid+1,end);

        return  -1;
    }
}
