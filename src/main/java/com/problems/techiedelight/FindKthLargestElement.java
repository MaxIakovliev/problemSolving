package com.problems.techiedelight;

import java.util.Arrays;

/**
 * Created by Maks on 5/8/2017.
 * http://www.techiedelight.com/find-kth-largest-element-array/
 */
public class FindKthLargestElement {
    /*
    Simple solution
    1. sort array O(nlogn)
    2. return size-k elem from array
     */
    public  int solution1(Integer[] arr, int k){
        Arrays.sort(arr);
        return  arr[arr.length-k];
    }
}
