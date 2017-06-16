package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/10/2017.
 * http://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
 */
public class MinimumJumpToTheEnd {

    public  int recursiveSolution(int[] arr, int s, int e){
        if (s==e){
            return 0;
        }
        if(arr[s]==0){
            return  Integer.MAX_VALUE-1;
        }

        int min=Integer.MAX_VALUE;
        for(int i=s+1; i<=e && i<=s+arr[s]; i++){
            int jump=recursiveSolution(arr, i,e);
            min=Math.min(min, jump+1);
        }
        return  min;
    }
}
