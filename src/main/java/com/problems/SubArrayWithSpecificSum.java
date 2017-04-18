package com.problems;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/18/2017.
 */
public class SubArrayWithSpecificSum {

    public  List<List<Integer>> Solution1(Integer[] arr, Integer sum){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0; i<arr.length; i++){
            int cur=0;
            List<Integer> list=new ArrayList<Integer>();
            for(int j=i; j<arr.length; j++){
                list.add(j);
                cur+=arr[j];
                if(cur==sum)
                    result.add(list);
            }
        }

        return result;

    }
}
