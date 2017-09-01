package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/1/2017.
 * http://www.geeksforgeeks.org/permutation-coefficient/
 */
public class PermutationCoefficient {
    //P(n, k) = P(n-1, k) + k* P(n-1, k-1)
    public int solution(int n, int k) {
        int[][] res = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0)
                    res[i][j] = 1;
                else
                    res[i][j] = res[i - 1][j] + (j * res[i - 1][j - 1]);

//                res[i][j + 1] = 0;
            }
        }
        return res[n][k];
    }

    public static void main(String[] args) {
        System.out.println(new PermutationCoefficient().solution(10,2));
    }

}
