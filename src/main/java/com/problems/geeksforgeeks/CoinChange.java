package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/5/2017.
 */
public class CoinChange {

    public  int iterativeSolution(int[] coins, int size, int total){
        if(total==0){
            return 1;
        }

        if(total<0){
            return  0;
        }

        if(size<=0 && total>0){
            return  0;
        }

        return  iterativeSolution(coins, size-1, total)+iterativeSolution(coins, size, size-coins[size-1]);
    }
}
