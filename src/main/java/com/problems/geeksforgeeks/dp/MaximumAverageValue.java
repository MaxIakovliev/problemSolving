package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/2/2017.
 * http://www.geeksforgeeks.org/path-maximum-average-value/
 */
public class MaximumAverageValue {
    public double solution1(int[][] cost) {
        int len = cost.length;
        int res[][] = new int[cost.length + 1][cost.length + 1];

        //fill first row
        for (int i = 1; i < len; i++)
            res[i][0] = res[i - 1][0] + cost[i][0];

        //fill first column
        for (int i = 1; i < len; i++)
            res[0][i] = res[0][i] + cost[0][i];

        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len; j++) {
                res[i][j] = Math.max(res[i - 1][j], res[i][j - 1] + cost[i][j]);
            }
        }
        return (double) res[len-1][len-1] / (2 * len - 1);
    }

    public static void main(String[] args) {
        int[][] arr=new int[][]
                        {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};
        System.out.println(new MaximumAverageValue().solution1(arr));
    }
}
