package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.LargestSumContiguousSubarray;
import org.junit.Assert;
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

    @Test
    public void kadanseExtAlgTestCase1(){
        LargestSumContiguousSubarray ls=new LargestSumContiguousSubarray();
        int input[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        int exp=7;
        int expStart=2;
        int expEnd=6;
        LargestSumContiguousSubarray.ResultTuple res=ls.kadanesAlgorithmExt(input);
        Assert.assertEquals(exp,res.sum);
        Assert.assertEquals(expStart,res.startPos);
        Assert.assertEquals(expEnd,res.endPos);
    }
}
