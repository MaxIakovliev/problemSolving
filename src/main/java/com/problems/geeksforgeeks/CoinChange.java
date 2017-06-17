package com.problems.geeksforgeeks;

import java.util.Arrays;

/**
 * Created by Maks on 6/5/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
 */
public class CoinChange {

    public int recursiveSolution(int[] coins, int size, int total){
       if(total==0)
           return 1;
       if(total<0|| size <=0)
           return 0;

       return recursiveSolution(coins, size-1, total)+ recursiveSolution(coins, size, total-coins[size-1]);
    }

    public  int iterativeSolution(int[] coins, int size, int total){
        int[] tmp=new int[total+1];
        Arrays.fill(tmp,0);
        tmp[0]=1;

        for(int i=0; i<size; i++){
            for(int j=coins[i]; j<=total; j++){
                tmp[j]+=tmp[j-coins[i]];
            }
        }
        return tmp[total];

    }


}
