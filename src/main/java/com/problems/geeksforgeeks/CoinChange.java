package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/5/2017.
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
}
