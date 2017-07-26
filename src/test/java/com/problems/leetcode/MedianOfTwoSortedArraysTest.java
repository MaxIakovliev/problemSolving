package com.problems.leetcode;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/26/2017.
 */
public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArraysTestCase1(){
        MedianOfTwoSortedArrays p=new MedianOfTwoSortedArrays();
        int[] n1={1,2};
        int[] n2={3,4};
        double exp=2.5;
        Assert.assertEquals(exp, p.findMedianSortedArrays(n1,n2),.8);
    }

    @Test
    public void findMedianSortedArraysTestCase2(){
        MedianOfTwoSortedArrays p=new MedianOfTwoSortedArrays();
        int[] n1=new int[0];
        int[] n2={2,3};
        double exp=2.5;
        Assert.assertEquals(exp, p.findMedianSortedArrays(n1,n2),.8);
    }

    @Test
    public void findMedianSortedArraysTestCase3(){
        MedianOfTwoSortedArrays p=new MedianOfTwoSortedArrays();
        int[] n1={1,3};
        int[] n2={2};
        double exp=2;
        Assert.assertEquals(exp, p.findMedianSortedArrays(n1,n2),.8);
    }

    @Test
    public void findMedianSortedArraysTestCase4(){
        MedianOfTwoSortedArrays p=new MedianOfTwoSortedArrays();
        int[] n1={1,2};
        int[] n2={3,4};
        double exp=2.5;
        Assert.assertEquals(exp, p.findMedianSortedArrays(n1,n2),.8);
    }
}
