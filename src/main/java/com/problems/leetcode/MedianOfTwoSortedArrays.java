package com.problems.leetcode;

/**
 * Created by Maks on 7/26/2017.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (i == nums1.length - 1 && j < nums2.length) {
                merged[i + j] = nums2[j];
                j++;
            } else if (j == nums2.length - 1 && i < nums1.length) {
                merged[i + j] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                merged[i + j] = nums1[i];
                i++;
            } else {
                merged[i + j] = nums2[j];
                j++;
            }
            if (i + j == 1)
                return merged[0];
            else if ((i + j) % 2 > 0) {
                return merged[merged.length / 2];
            } else {
                return (merged[merged.length / 2] + merged[(merged.length / 2) + 1]) / 2;
            }
        }

    }
}
