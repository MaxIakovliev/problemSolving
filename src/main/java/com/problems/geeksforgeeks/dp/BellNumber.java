package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/1/2017.
 * http://www.geeksforgeeks.org/bell-numbers-number-of-ways-to-partition-a-set/
 */
public class BellNumber {
    public int calc(int n){
        int[][]res=new int[n+1][n+1];
        res[0][0]=1;

        for(int i=1; i<=n; i++){
            res[i][0]=res[i-1][i-1];
            for(int j=1; j<=i; j++){
                res[i][j]=res[i-1][j-1]+res[i][j-1];
            }
        }
        return  res[n][0];
    }

    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            System.out.println(i+"="+new BellNumber().calc(i));
        }
    }
}
