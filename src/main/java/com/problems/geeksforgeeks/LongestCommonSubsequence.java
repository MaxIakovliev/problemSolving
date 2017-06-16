package com.problems.geeksforgeeks;

/**
 * Created by Maks on 5/31/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
public class LongestCommonSubsequence {

    public int tabulation(char[]a, char[]b, int x, int y){
        if(x==0 || y==0){
            return 0;
        }
        if(a[x-1]==b[y-1]){
            return 1+tabulation(a,b,x-1,y-1);
        }
        else {
            return Math.max(tabulation(a,b,x-1,y),
                            tabulation(a,b,x,y-1));
        }
    }

    public int memoization(char[]a, char[]b, int x, int y){
        int[][] arr=new int[x+1][y+1];
        for(int i=0;i<=x; i++){
            for(int j=0; j<=y; j++){
                if(i==0|| j==0){
                    arr[i][j]=0;
                }
                else if(a[i-1]==b[j-1]){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return  arr[x][y];
    }


}
