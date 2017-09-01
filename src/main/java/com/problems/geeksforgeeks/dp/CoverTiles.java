package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/1/2017.
 */
public class CoverTiles {

    public int count(int n){
        int res[]=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n; i++){
            if(i>=1&& i<=3){
                res[i]=1;
            }
            else if (i==4){
                res[i]=2;
            }
            else {
                res[i]=res[i-1]+res[i-4];
            }
        }
        return  res[n];
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(i+" = "+new CoverTiles().count(i));
        }
    }

}
