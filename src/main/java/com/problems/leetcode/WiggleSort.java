package com.problems.leetcode;

import java.util.Arrays;

/**
 * Created by Maks on 3/17/2018.
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        //1,[2],1,2,1 case q
        //1,2,[1],2,1 case !q
        boolean q = true;
        Arrays.sort(nums);
        int i = 1;
        while (i < nums.length - 1) {
            int a, b, c;
            int j = nums.length - 1;


            a = nums[i - 1];
            b = nums[i];
            c = nums[i + 1];
            if (b > a && b > c) {
                q = q ? false : true;
                i++;
                continue;
            }
            if (b < a && b < c) {
                q = q ? false : true;
                i++;
                continue;
            }
            if (a < b && b < c) {
                //System.out.println("херня вышла 0");
                i++;
                continue;
            }

            if (b >= a && q) {
                b = nums[j];

                while (j >= 0 && b <= c) {
                    b = nums[j];
                    j--;
                }
                if (j < 0) {
                    postCheck(nums);
                    return;
                }
                if (b > a && b >= c) {
                    swap(nums, i, j);
                } else {
                    System.out.println("херня вышла 1");
                    return;
                }
            } else {

                c = nums[j];
                while (j >= 0 && b >= c && i + 1 < nums.length) {
                    c = nums[j];
                    j--;
                }
                if (j < 0) {
                    postCheck(nums);
                    return;
                }
                if (b < a && b < c) {
                    swap(nums, i + 1, j);
                } else {
                    System.out.println("херня вышла 2");
                    return;
                }
            }
            q = q ? false : true;
            i++;

        }

        postCheck(nums);


    }


    private void postCheck(int[] nums){
        if (nums.length >= 4 &&
                nums[nums.length - 4] <= nums[nums.length - 3]
                && nums[nums.length - 3] <= nums[nums.length - 2]
                ) {
            swap(nums, nums.length - 2, nums.length - 1);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    public static void main(String[] args) {
        WiggleSort ws = new WiggleSort();
        //int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        ws.wiggleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(String.format("%s ", arr[i]));
//        }
        System.out.println();

        int[] arr = new int[]{1, 1, 2, 1, 2, 2, 1};
        ws.wiggleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }

        System.out.println();

        arr = new int[]{1, 5, 1, 1, 6, 4};
        ws.wiggleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }

        System.out.println();

        arr = new int[]{1, 1, 2, 2, 2, 1};
        ws.wiggleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }

        System.out.println();

        arr = new int[]{1, 2, 1, 2, 1, 1, 2, 2, 1};
        ws.wiggleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }

        System.out.println();

        arr = new int[]{1, 5, 1, 1, 6, 4};
        ws.wiggleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }
    }
}
