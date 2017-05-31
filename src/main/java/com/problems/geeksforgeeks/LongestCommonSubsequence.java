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
            return  0;
        }
        if(x[xs-1]==y[ys-1]){
            return 1+recursiveCount(x,y,xs-1, ys-1);
        }
        else {
            return Math.max(
                    recursiveCount(x,y,xs-1, ys),
                    recursiveCount(x,y,xs,ys-1)
            );
        }

    }
}
