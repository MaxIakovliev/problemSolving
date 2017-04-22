package com.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maks on 4/22/2017.
 */
public class BoyerMooreMajorityVoteAlgorithm {
    public  int solution1(Integer[] arr){
        HashMap<Integer, Integer> item=new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            if(item.containsKey(arr[i]))
                item.put(arr[i],item.get(arr[i])+1);
            else
                item.put(arr[i],1);
        }

        for(Map.Entry<Integer, Integer> cur  : item.entrySet()){
            if(cur.getValue()> arr.length/2)
                return cur.getKey();
        }
        return -1;

    }
}
