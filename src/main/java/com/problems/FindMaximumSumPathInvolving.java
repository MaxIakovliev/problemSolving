package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/30/2017.
 * http://www.techiedelight.com/find-maximum-sum-path-involving-elements-given-arrays/
 */
public class FindMaximumSumPathInvolving {
    public List<Integer> solution1(Integer[] a, Integer[] b){
        int i=0;
        int j=0;
        int maxA=0;
        int maxB=0;
        List<Integer> tmpPathA=new ArrayList<Integer>();
        List<Integer> tmpPathB=new ArrayList<Integer>();
        List<Integer> result=new ArrayList<Integer>();
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                maxA+=a[i];
                i++;
                tmpPathA.add(a[i]);
            }
            else if(a[i]>b[j]){
                maxB+=b[j];
                j++;
                tmpPathB.add(b[j]);
            }
            else{
                if(maxA>maxB){
                    result.addAll(tmpPathA);
                }
                else {
                    result.addAll(tmpPathB);
                }
                i++;
                j++;
                maxA=0;
                maxB=0;
            }
        }
        while( i<a.length){
            result.add(a[i]);
            i++;
        }

        while( j<b.length){
            result.add(b[j]);
            j++;
        }
        return  result;
    }
}
