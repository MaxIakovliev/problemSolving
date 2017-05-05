package com.problems;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maks on 5/5/2017.
 */
public class MergingOverlappingIntervals {

    public List<Interval> solution1(Interval[] data){
        List<Interval> res=new ArrayList<Interval>();
        Arrays.sort(data);
        res.add(new Pair<Integer, Integer>(data[0].begin,data[0].end);
        for(int i=1; i<data.length; i++){
            

        }
        return  res;
    }

    public  class Interval  implements  Comparable {

        public  int begin, end;

        public int compareTo(Object o) {
            return Integer.compare(begin,(Integer)o);
        }
    }
}
