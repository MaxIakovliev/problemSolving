package com.problems;

/**
 * Created by Maks on 5/3/2017.
 * http://www.techiedelight.com/length-longest-continuous-sequence-same-sum-binary-arrays/
 */
public class LongestContinuousSequenceWithSameSum {

    //naive solution.
    public int solution1(Integer[] a, Integer[] b){
        int res=0;
        int curA=0;
        int curB=0;
        int count=0;
        for(int i=0; i<a.length; i++){
            curA=0;
            curB=0;
            count=0;
            for(int j=i; j<b.length; j++){
                curA+=a[j];
                curB+=b[j];
                count++;
                if(curA==curB){
                    res = Math.max(res, curA);
                }
            }
        }
        return  res;
    }
}
