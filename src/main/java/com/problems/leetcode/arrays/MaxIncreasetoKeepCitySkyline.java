package com.problems.leetcode.arrays;

public class MaxIncreasetoKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len=grid.length;
        int[] row=new int[len];
        int[] col=new int[len];
        for(int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                row[i]=Math.max(row[i],grid[i][j]);
                col[j]=Math.max(col[j],grid[i][j]);
            }
        }
        int res=0;
        for(int i=0; i<len; i++) {
            for (int j = 0; j < len; j++) {
                res+=Math.min(col[j],row[i])-grid[i][j];
            }
        }
        return res;
    }
}
