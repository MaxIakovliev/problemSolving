package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/23/2017.
 * http://www.techiedelight.com/find-longest-bitonic-subarray-array/
 */
public class BitonicSubarray {
    public Pair<Integer, Integer> solution1(Integer[] arr){
        int x,y, max, newx,newy;
        x=0;
        y=0;
        max=0;
        newx=0;
        newy=0;

        boolean phase1=true;
        for(int i=1;i<arr.length; i++){
            newy=i;

           if(phase1 && arr[i-1]>arr[i])
               phase1=false;
            else if(phase1==false && arr[i-1]>arr[i]){
               phase1=true;
               if(i-1-newx>max){
                   x=newx;
                   y=i-1;
                   max=i-1-x;
                   newx=i;
               }
           }
        }
        if (max==0)
            return new Pair<Integer, Integer>(0, arr.length);
        else
            if(newy-newx>max){
                return new Pair<Integer, Integer>(newx,newy);
            }
        else return new Pair<Integer, Integer>(x,y);

    }
}
