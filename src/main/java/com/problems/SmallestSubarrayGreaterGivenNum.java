package com.problems;

import javafx.util.Pair;

/**
 * Created by Maks on 4/29/2017.
 */
public class SmallestSubarrayGreaterGivenNum {

    public Pair<Integer, Integer> solution1(Integer[] arr, int sum){
        int left=0;
        int right=0;
        int tmp=0;
        int tmpLeft=0;
        int min=Integer.MAX_VALUE;

        boolean found=false;
        for(int i=0; i<arr.length; i++){
            tmp+=arr[i];
            if(tmp>sum && tmp<=min) {
                if((left==0 && right==0) || tmpLeft-i<=right-left)
                min = tmp;
                right = i;
                tmp = tmp - arr[tmpLeft];
                left=tmpLeft;
                tmpLeft++;
                found=true;
            }

                while(tmp>min && tmpLeft<i) {
                    tmp = tmp - arr[tmpLeft];
                    tmpLeft++;
                }


        }

        if(tmp>sum && tmp<=min){
            if((left==0 && right==0) || tmpLeft-arr.length-1<=right-left){
                min = tmp;
                right = arr.length;
                tmp = tmp - arr[tmpLeft];
                left=tmpLeft;
                found=true;
            }
        }
        if(!found)
            return new Pair<Integer, Integer>(-1,-1);
        else
            return  new Pair<Integer, Integer>(left, right);
    }
}
