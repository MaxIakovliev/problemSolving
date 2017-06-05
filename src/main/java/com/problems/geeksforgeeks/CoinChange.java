package com.problems.geeksforgeeks;

import java.util.Arrays;

/**
 * Created by Maks on 6/5/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
 */
public class CoinChange {

    public int recursiveSolution(int[] coins, int size, int total){
        if(total==0){
            return 1;
        }

        if(total<0){
            return  0;
        }

        if(size<=0 && total>=1){
            return  0;
        }

        return  recursiveSolution(coins, size-1, total)+recursiveSolution(coins, size, total-coins[size-1]);
    }

    public  int iterativeSolution(int[] coins, int size, int total){
        int[] table=new int[total+1];
        Arrays.fill(table,0);
        table[0]=1;
        //walk through all the coins
        for(int i=0; i<size; i++){
            for(int j=coins[i]; j<=total; j++){
                table[j]+=table[j-coins[i]];
            }
        }
        return  table[total];

    }


}
