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
        int i= 0;
        while(i< arr.length-len){
            int c=i+len-1;
            Integer[] part=new Integer[len];
            for(int j=0; j<len-1; j++){
                part[j]=arr[i+j];
            }
            List<List<Integer>> tmpRes=move(arr,part,c);
            i++;
        }

        return  result;
    }

    private List<List<Integer>> move(Integer[] arr,Integer[] part, int c){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int counter=0;
        for(int i=c; i<arr.length; i++ ){
            List<Integer> current=new ArrayList<Integer>();
            for(int j=0; j<part.length; j++){
                current.add(part[j]);
            }
            current.add(arr[i]);
            res.add(counter++, current);
        }
        return res;
    }


}
