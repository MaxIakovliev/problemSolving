package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/4/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
 */
public class MinCostPath {
    public  int naiveRecursiveSolution(int[][]arr, int x,int y){
        if(x<0 ||y<0){
            return Integer.MAX_VALUE;
        }
        if(x==0 && y==0){
            return  arr[x][y];
        }
        else {
            return arr[x][y]+min( naiveRecursiveSolution(arr,x-1,y),
                                   naiveRecursiveSolution(arr,x-1,y-1),
                                   naiveRecursiveSolution(arr,x,y-1));
        }
    }

    private int min(int x, int y, int z) {
        int tmp=Math.min(x,y);
        tmp=Math.min(tmp,z);
        return  tmp;
    }
}
