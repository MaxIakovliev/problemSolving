package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.LongestIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/17/2017.
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public  void memoizationTestCase1(){
        LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60};
        int exp=5;
        int res=lis.memoization(arr);
        Assert.assertEquals(exp,res);
    }
}
