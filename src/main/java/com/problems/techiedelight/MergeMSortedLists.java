package com.problems.techiedelight;

import java.util.Arrays;

/**
 * Created by Maks on 5/9/2017.
 * http://www.techiedelight.com/merge-m-sorted-lists-variable-length/
 */
public class MergeMSortedLists {

    /*
    1. create new array  the size of summary of size of all lists
    2. copy all the elements into new array
    3. apply efficient sort  O(Nlogn)
     */
    public  Integer[] simpleSolution(Integer[][] arr){
        int size=0;
        for(int i=0; i<arr.length; i++){
            size+=arr[i].length;
        }
        Integer[] result=new Integer[size];
        int counter=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                result[counter+j]=arr[i][j];
            }
            counter+=arr[i].length;
        }
        Arrays.sort(result);
        return  result;
    }
}
