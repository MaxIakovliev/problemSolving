package com.problems;

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

        for(int i=1; i<data.length; i++){

            if(res.isEmpty()|| res.get(res.size()-1).end<data[i].begin){
                res.add(new Interval(data[i].begin, data[i].end));
            }
            if(res.get(res.size()-1).end<data[i].end){
                res.get(res.size()-1).end=data[i].end;
            }
        }

        return  res;
    }

    public  class Interval  implements  Comparable {

        public  int begin, end;

        public Interval(int begin, int end){
            this.begin=begin;
            this.end=end;

        }

        public int compareTo(Object o) {
            return Integer.compare(begin,(Integer)o);
        }
    }
}
