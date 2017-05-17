package com.problems.techiedelight;

/**
 * Created by Maks on 5/17/2017.
 * http://www.techiedelight.com/find-number-rotations-circularly-sorted-array/
 */
public class FindNumberOfRotations {
    public int linearSolution(Integer[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                return  i;
            }
        }
        return 0;
    }
}
