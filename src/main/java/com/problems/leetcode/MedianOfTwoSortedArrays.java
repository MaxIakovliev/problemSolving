package com.problems.leetcode;

/**
 * Created by Maks on 7/26/2017.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        if(nums1==null ||nums1.length==0){
            int t = nums2.length / 2;
            if(nums2.length%2==0) {
                return (nums2[t] +nums2[t-1])/2.0;
            }
            else {
                return nums2[t];
            }
        }
        if(nums2==null ||nums2.length==0){
            int t = nums1.length / 2;
            if(nums1.length%2==0) {
                return (nums1[t] +nums1[t-1])/2.0;
            }
            else {
                return nums1[t];
            }
        }
        while (i < nums1.length || j < nums2.length) {
            if (i >= nums1.length && j < nums2.length) {
                merged[i + j] = nums2[j];
                j++;
            } else if (j >= nums2.length && i < nums1.length) {
                merged[i + j] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                merged[i + j] = nums1[i];
                i++;
            } else {
                merged[i + j] = nums2[j];
                j++;
            }
        }
        i=nums1.length;
        j=nums2.length;
        int t=merged.length/2;
        if (i + j == 1)
            return merged[0];
        else if ((i + j) % 2 > 0) {
            return merged[t];
        } else if(i+j==2) {
            return (merged[0]+merged[1])/2.0;
        }
        else {
            return (merged[t] + merged[t- 1]) / 2.0;
        }


    }
}
