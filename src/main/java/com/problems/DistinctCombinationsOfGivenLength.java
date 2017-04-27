package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/25/2017.
 *
 * http://www.techiedelight.com/find-distinct-combinations-of-given-length/
 */
public class DistinctCombinationsOfGivenLength {

    public List<List<Integer>> solution1(Integer[] arr, int len) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int counter=0;
        //отсортировать
        while(counter<arr.length-len){//пока самый первый элемент не достиг конца массива со сдвигом на длину
            for(int i=len-1; i>=0; i++){
                List<List<Integer>> cur=collect(arr, i, len, counter);
            }
        }

        return  result;
    }

    private List<List<Integer>> collect(Integer[] arr, int pos, int len, int shift) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0; i<len-1; i++){

        }

        return  result;
    }

}
