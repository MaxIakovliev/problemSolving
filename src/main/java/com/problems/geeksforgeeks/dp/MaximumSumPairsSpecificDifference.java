package com.problems.geeksforgeeks.dp;

import java.util.Arrays;

/**
 * Created by Maks on 9/2/2017.
 */
public class MaximumSumPairsSpecificDifference {
    public int solution1(int[] arr, int n) {

        Arrays.sort(arr);
        int[] res = new int[arr.length];
        res[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1];
            if (arr[i] - arr[i - 1] < n) {
                if (i >= 2) {
                    res[i] = Math.max(res[i], res[i - 2] + arr[i] + arr[i - 1]);
                } else {
                    res[i] = Math.max(res[i], arr[i] + arr[i - 1]);
                }
            }
        }
        return  res[res.length-1];
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 10, 15, 17, 12, 9};
        System.out.println(new MaximumSumPairsSpecificDifference().solution1(arr,4));

        arr = new int[]{5, 15, 10, 300};
        System.out.println(new MaximumSumPairsSpecificDifference().solution1(arr,12));
    }
}
