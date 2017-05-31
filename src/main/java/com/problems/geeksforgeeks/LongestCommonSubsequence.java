package com.problems.geeksforgeeks;

/**
 * Created by Maks on 5/31/2017.
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
public class LongestCommonSubsequence {

    /*
    find length of longest common subsequence in recursive way
     */
    public  int recursiveCount(char[] x, char[] y, int xs, int ys){

        if(xs==0 || ys==0){
            return 0;
        }
        else if(x[xs-1]==y[ys-1]){
            return 1+recursiveCount(x,y,xs-1,ys-1);
        }
        else {
            return Math.max(recursiveCount(x,y,xs-1,ys), recursiveCount(x,y,xs,ys-1));
        }
    }

    public int iterativeTabulationSolution(char[] x, char[] y){
        int[][]res=new int[x.length+1][y.length+1];
        for(int i=0; i<=x.length; i++){
            for(int j=0; j<=y.length; j++){
                if (i==0 || j==0){
                    res[i][j]=0;
                }
                else if(x[i-1]==y[j-1]){
                    res[i][j]=1+res[i-1][j-1];
                }
                else {
                    res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
                }

            }
        }
        return res[x.length][y.length];
    }


    public char[] getLCSIterative(char[] x, char[] y){
        int[][]matrix=new int [x.length][y.length];
        for(int i=0; i<x.length; i++){
            for(int j=0; j<y.length; j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                }
                else if(x[i-1]==y[j-1]){
                    matrix[i][j]=1+matrix[i-1][j-1];
                }
                else{
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
            }
        }
        char[] res=new char[matrix[x.length][y.length]];
        int n=x.length;
        int k=y.length;
        int idx=res.length;
        while(n>0 && k>0){
            if(x[n-1]==y[k-1]){
                res[idx-1]=x[n-1];
                idx--;
                n--;
                k--;
            }
            else{
                if(matrix[n-1][k]>matrix[n][k-1]){
                    n--;
                }
                else{
                    k--;
                }
            }
        }
        return res;

    }
}
