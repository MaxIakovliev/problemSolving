package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/10/2017.
 */
public class CutRod {
    public int recursiveSolution(int[] price, int n){
        if(n==0)
            return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max, price[i]+ recursiveSolution(price, n-i-1));
        }
        return max;
    }

    public int iterativeSolution(int[] price, int n){
        int[] tmp=new int[n+1];
        for(int i=1; i<=n; i++){
            int max=Integer.MIN_VALUE;
            for(int j=0; j<i; j++){
                max=Math.max(max, price[j]+tmp[i-j-1]);
            }
            tmp[i]=max;
        }
        return tmp[n];
    }
}
