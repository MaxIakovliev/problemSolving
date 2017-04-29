package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/29/2017.
 * http://www.techiedelight.com/find-distinct-combinations-given-length-repetition-allowed/
 */
public class DistinctCombinationsGivenLengthAllowed {

    public List<List<Integer>> solutionForLen2(Integer[] arr) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                List<Integer> cur=new ArrayList<Integer>();
                cur.add(arr[i]);
                cur.add(arr[j]);
                result.add(cur);
            }
        }
        return  result;
    }
}
