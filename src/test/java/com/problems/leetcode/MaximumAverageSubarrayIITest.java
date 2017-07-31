package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/31/2017.
 */
public class MaximumAverageSubarrayIITest {

    @Test
    public  void testCase1(){
        MaximumAverageSubarrayII ma=new MaximumAverageSubarrayII();
        int[] arr= {1,12,-5,-6,50,3};
        double exp=12.75;
        double res=ma.findMaxAverage(arr,4);
        Assert.assertEquals(exp,res,0.01);
    }

    @Test
    public  void testCase2(){
        MaximumAverageSubarrayII ma=new MaximumAverageSubarrayII();
        int[] arr= {1,12,-5,-6,50,3};
        double exp=10.8;
        double res=ma.findMaxAverage(arr,5);
        Assert.assertEquals(exp,res,0.01);
    }

    @Test
    public  void testCase3(){
        MaximumAverageSubarrayII ma=new MaximumAverageSubarrayII();
        int[] arr= {1,12,-5,-6,50,3};
        double exp=9.16667;
        double res=ma.findMaxAverage(arr,6);
        Assert.assertEquals(exp,res,0.00001);
    }
}
