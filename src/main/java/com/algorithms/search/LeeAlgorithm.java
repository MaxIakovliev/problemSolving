package com.algorithms.search;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/21/2017.
 * See https://en.wikipedia.org/wiki/Lee_algorithm for additional details
 */
public class LeeAlgorithm {
    public List<Pair<Integer,Integer>> findPath(Integer[][] map, int x1, int y1, int x2, int y2) {
        List<Pair<Integer,Integer>> result= new ArrayList<Pair<Integer, Integer>>();
        //creating worked map
        Integer[][] workMap=new Integer[map.length][];
        for(int i=0; i<map.length; i++){
            workMap[i]=new Integer[map[i].length];
        }
        int d=0;
        while (x1!=x2 && y1!=y2){
            d++;
            for(int i=x1-d; i<x1+d; i++){
                for(int j=y1-d; j<y1+d; j++){
                    if(i>=0 && j>=0 && i<workMap.length && j< workMap[i].length && workMap[i][j]==0){
                        workMap[i][j]=d;
                    }
                }
            }
        }
        //TODO write backtrace method


        return result;
    }



}
