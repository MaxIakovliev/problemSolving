package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maks on 5/6/2017.
 */
public class ActivitySelectionProblem {

    public List<Interval> solution1(Interval[] arr){
        List<Interval> res=new ArrayList<Interval>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(res.isEmpty()|| res.get(res.size()-1).end<arr[i].start){
                res.add(arr[i]);
            }
        }
        return  res;
    }
}
