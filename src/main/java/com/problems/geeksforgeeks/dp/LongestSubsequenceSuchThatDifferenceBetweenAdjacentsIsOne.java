package com.problems.geeksforgeeks.dp;

import java.util.Arrays;

/**
 * Created by Maks on 9/4/2017.
 * http://www.geeksforgeeks.org/longest-subsequence-such-that-difference-between-adjacents-is-one/
 */
public class LongestSubsequenceSuchThatDifferenceBetweenAdjacentsIsOne {

    public int solution1(int[] arr) {
        int[] res = new int[arr.length];
        int count = 0;
        Arrays.fill(res, Integer.MIN_VALUE);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] == arr[i] + 1 || arr[j] == arr[i] - 1) {
                    res[i] = Math.max(res[i], arr[i]);
                }
            }

        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] != Integer.MIN_VALUE) {
                System.out.print(res[i] + " ");
                count++;
            }
        }
        System.out.println("");
        return count;
    }


    public static void main(String[] args) {
        System.out.println(
                new LongestSubsequenceSuchThatDifferenceBetweenAdjacentsIsOne()
                        .solution1(new int[]{ 3, 4, 5, 3, 2, 4,6,8,12,14,16}));


    }
}

