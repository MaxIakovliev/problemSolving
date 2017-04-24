package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/24/2017.
 * http://www.techiedelight.com/maximum-sum-circular-subarray/
 */
public class MaximumSumCircularSubarray {

    public List<Integer> solution1(Integer[] arr){

        int maxIterations=2;
        int curIter=0;
        int maxSum=Integer.MIN_VALUE;
        int j;
        int tmp=Integer.MIN_VALUE;
        int x,y;
        x=0;
        y=0;
        int tmpx;
        boolean firstStep=true;
        for(int i=0; i< arr.length; i++) {
            j=i;
            tmpx=i;
            tmp=Integer.MIN_VALUE;
            curIter=0;
            firstStep=true;
            while (curIter != maxIterations) {
                if(j==arr.length){
                    j=0;
                    curIter++;
                }
                if(curIter>0 && j==i) {
                    break;
                }

                if(firstStep) {
                    firstStep=false;
                    tmp=arr[j];
                }
                else
                    tmp+=arr[j];

                if(tmp>maxSum){
                    y=j;
                    x=tmpx;
                    maxSum=tmp;
                }
                j++;
            }
        }

        if(x<y){
            List<Integer> result=new ArrayList<Integer>();
            for(int i=x;i<=y;i++){
                result.add(arr[i]);
            }
            return  result;
        }
        else if(x>y){
            List<Integer> result=new ArrayList<Integer>();
            for(int i=x;i<arr.length;i++){
                result.add(arr[i]);
            }
            for(int i=0;i<=y;i++){
                result.add(arr[i]);
            }
            return  result;
        }
        return  null;
    }
}
