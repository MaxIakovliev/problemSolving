package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/25/2017.
 *
 * http://www.techiedelight.com/find-distinct-combinations-of-given-length/
 */
public class DistinctCombinationsOfGivenLength {

    public List<List<Integer>> solutionForLen2(Integer[] arr) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                List<Integer> cur=new ArrayList<Integer>();
                cur.add(arr[i]);
                cur.add(arr[j]);
                result.add(cur);
            }
        }
        return  result;
    }

}
