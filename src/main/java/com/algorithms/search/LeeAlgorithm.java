package com.algorithms.search;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/21/2017.
 * See https://en.wikipedia.org/wiki/Lee_algorithm for additional details
 */
public class LeeAlgorithm {
    public List<Pair<Integer,Integer>> findPath(Integer[][] map, Pair<Integer,Integer> start, Pair<Integer,Integer> end) {
        List<Pair<Integer,Integer>> result= new ArrayList<Pair<Integer, Integer>>();
        //creating worked map
        Integer[][] workMap=new Integer[map.length][];
        for(int i=0; i<map.length; i++){
            workMap[i]=new Integer[map[i].length];
        }
        

        return result;
    }

    public void mark(Integer[][] workMap, Integer[][] originMap, Pair<Integer,Integer> start,  int d){
        //mark top
        if(start.getValue()-d>0 && originMap[start.getKey()][start.getValue()]==0){
            workMap[start.getKey()][start.getValue()]=d;
        }
    }
}
