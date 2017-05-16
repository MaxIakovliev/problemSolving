package com.problems.techiedelight;

/**
 * Created by Maks on 5/16/2017.
 * http://www.geeksforgeeks.org/interpolation-search/
 */
public class InterpolationSearch {
    public Integer search(Integer[] arr,int x){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi && x>=arr[lo] && x<=arr[hi]){
            // Probing the position with keeping
            // uniform distribution in mind.
            int pos = lo + (int)(((double)(hi-lo) / (arr[hi]-arr[lo]))*(x - arr[lo]));

            if(arr[pos]==x){
                return pos;
            }

            if(arr[pos]<x){
                lo++;
            }

            if(arr[hi]>x){
                hi--;
            }
        }
        return  -1;
    }
}
