package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/10/2017.
 */
public class CutRod {
    public int recutsiveSolution(int[] price, int n){
        if(n<=0){
            return  0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max, price[i]+recutsiveSolution(price,n-i-1));
        }
        return  max;
    }
}
