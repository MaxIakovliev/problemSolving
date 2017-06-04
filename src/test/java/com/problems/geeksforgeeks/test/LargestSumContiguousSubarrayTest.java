package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.LargestSumContiguousSubarray;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/4/2017.
 */
public class LargestSumContiguousSubarrayTest {

    @Test
    public void kadanseAlgTestCase1(){
        LargestSumContiguousSubarray ls=new LargestSumContiguousSubarray();
        int input[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        int exp=7;
        int res=ls.kadanesAlgorithm(input);
        Assert.assertEquals(exp,res);
    }
}
