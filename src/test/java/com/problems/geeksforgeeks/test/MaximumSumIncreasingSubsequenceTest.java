package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.dp.MaximumSumIncreasingSubsequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/18/2017.
 */
public class MaximumSumIncreasingSubsequenceTest {

    @Test
    public  void Solution1TestCase1(){
        MaximumSumIncreasingSubsequence m=new MaximumSumIncreasingSubsequence();
        int[] arr={1, 101, 2, 3, 100, 4, 5};
        int exp=106;
        int res=m.solution1(arr);
        Assert.assertEquals(exp,res);
    }
}
