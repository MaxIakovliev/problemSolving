package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/2/2017.
 * http://www.geeksforgeeks.org/maximum-weight-path-ending-element-last-row-matrix/
 */
public class MaximumWeightPath {
    public int solution1(int[][] arr, int n) {
        int res[][] = new int[n + 1][n + 1];

        res[0][0] = arr[0][0];

        for (int i = 1; i <n; i++) {
            res[i][0] = arr[i][0] + res[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i + 1 && j < n; j++) {
                res[i][j] = arr[i][j] + Math.max(res[i - 1][j - 1], arr[i - 1][j]);
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (k < res[n - 1][i])
                k = res[n - 1][i];
        }
        return k;
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]{{4, 2, 3, 4, 1},
                {2, 9, 1, 10, 5},
                {15, 1, 3, 0, 20},
                {16, 92, 41, 44, 1},
                {8, 142, 6, 4, 8}};
        System.out.println(new MaximumWeightPath().solution1(mat, 5));
    }
}
