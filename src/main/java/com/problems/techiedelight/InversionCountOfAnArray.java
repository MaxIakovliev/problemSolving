package com.problems.techiedelight;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 5/15/2017.
 * http://www.techiedelight.com/inversion-count-array/
 */
public class InversionCountOfAnArray {

    public List<Pair<Integer,Integer>> solution1(Integer[] arr){

        List<Pair<Integer,Integer>> res=new ArrayList<Pair<Integer, Integer>>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    res.add(new Pair<Integer, Integer>(arr[i],arr[j]));
                }
            }
        }
        return  res;
    }
}
