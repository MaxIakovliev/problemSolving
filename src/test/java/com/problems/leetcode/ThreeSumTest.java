package com.problems.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 1/20/2018.
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSumTest {

    @Test
    public  void test1(){
        ThreeSum ts=new ThreeSum();
        List<List<Integer>> res=ts.threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer>arr : res ) {
            for (int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
