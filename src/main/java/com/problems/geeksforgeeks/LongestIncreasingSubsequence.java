package com.problems.geeksforgeeks;

/**
 * Created by Maks on 6/17/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-subsequence/
 * found answer here - https://stackoverflow.com/questions/2631726/how-to-determine-the-longest-increasing-subsequence-using-dynamic-programming
 */
public class LongestIncreasingSubsequence {

    public int memoization(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=1;
        int maxLen=1;
        int bestEnd=0;
        for(int i=1; i<arr.length; i++){
            dp[i]=1;
            for(int j= i-1;j>=0; j--){
                if(dp[j]+1>dp[i] && arr[j]<arr[i]){
                    dp[i]=dp[j]+1;
                }
            }
            if(dp[i]>maxLen){
                maxLen=dp[i];
                bestEnd=i;
            }
        }
        return  maxLen;
    }
}
