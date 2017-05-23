package com.problems.techiedelight;

/**
 * Created by Maks on 5/23/2017.
 * http://www.techiedelight.com/rot-cutting/
 */
public class RodCutting {

    public int recursive(Integer[] arr, int n){
        if(n==0)
            return  0;
        int max=Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int cost=arr[i-1]+recursive(arr,n-i);
            max=Math.max(max, cost);
        }
        return  max;
    }
}
