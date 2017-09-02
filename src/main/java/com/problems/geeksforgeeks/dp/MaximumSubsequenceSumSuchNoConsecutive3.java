package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/2/2017.
 * http://www.geeksforgeeks.org/maximum-subsequence-sum-such-that-no-three-are-consecutive/
 */
public class MaximumSubsequenceSumSuchNoConsecutive3 {
    public int solution1(int[] arr) {
        int sum[] = new int[arr.length];
        // Base cases (process first three elements)
        sum[0] = arr[0];
        sum[1] = arr[0] + arr[1];
        sum[2] = Math.max(sum[1], arr[1] + arr[2]);

        // Process rest of the elements
        // We have three cases
        // 1) Exclude arr[i],  i.e.,  sum[i] = sum[i-1]
        // 2) Exclude arr[i-1], i.e., sum[i] = sum[i-2] + arr[i]
        // 3) Exclude arr[i-2], i.e., sum[i-3] + arr[i] + arr[i-1]
        for (int i=3; i<arr.length; i++)
            sum[i] = Math.max(Math.max(sum[i-1], sum[i-2] + arr[i]),
                    arr[i] + arr[i-1] + sum[i-3]);
        return  arr[arr.length-1];
    }

    public static void main(String[] args) {
        int arr[] = {100, 1000, 100, 1000, 1};
        System.out.println(new MaximumSubsequenceSumSuchNoConsecutive3().solution1(arr));
    }
}

