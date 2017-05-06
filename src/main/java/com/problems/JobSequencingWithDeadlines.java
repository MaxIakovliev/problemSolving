package com.problems;

import java.util.Arrays;

/**
 * Created by Maks on 5/6/2017.
 */
public class JobSequencingWithDeadlines {

    public int solution1(TaskWithDeadline[] arr){
        Integer[] slots=new Integer[arr.length];
        Arrays.sort(arr);
        int res=0;
        for(int i=arr.length-1; i>=0; i--){
            for( int j=arr[i].deadline; j>=1; j--){
                if(slots[j]==null){
                    slots[j]=arr[i].profit;
                    res+=arr[i].profit;
                    break;
                }
            }
        }
        return  res;
    }
}
