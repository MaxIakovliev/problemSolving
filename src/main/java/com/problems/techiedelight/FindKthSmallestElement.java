package com.problems.techiedelight;

import java.util.Arrays;

/**
 * Created by Maks on 5/9/2017.
 * http://www.techiedelight.com/find-kth-smallest-element-array/
 */
public class FindKthSmallestElement {

    /*
    1. sort array using efficient algorithm
    2. get k smallest element from array
     */
    public  int simpleSolution(Integer[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
