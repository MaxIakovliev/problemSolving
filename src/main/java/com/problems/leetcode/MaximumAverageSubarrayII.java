package com.problems.leetcode;

/**
 * Created by Maks on 7/31/2017.
 * https://leetcode.com/problems/maximum-average-subarray-ii/description/
 */
public class MaximumAverageSubarrayII {
    public double findMaxAverage(int[] nums, int k) {
        int[] aux = new int[nums.length];
        aux[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            aux[i] = nums[i] + aux[i - 1];
        }
        double max = Integer.MIN_VALUE;
        for (int i = k; i <= nums.length-1; i++) {
            double curMax = aux[i] - aux[i - k];
            double divisor = i - (i - k);
            curMax = curMax / divisor;
            if (curMax > max) {
                max = curMax;
            }
        }
        if(k==nums.length)
            return  aux[aux.length-1]/((double)k);
        return max;
    }
}
