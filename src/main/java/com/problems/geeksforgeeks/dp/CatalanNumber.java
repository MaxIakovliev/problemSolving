package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 7/18/2017.
 */
public class CatalanNumber {

    public long recursiveSolution(int x){
        if(x<=1) return 1;

        long res=0;
        for(int i=0; i<x; i++){
            res+=recursiveSolution(i)*recursiveSolution(x-i-1);
        }
        return  res;
    }
}
