package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.MinimumJumpToTheEnd;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/10/2017.
 */
public class MinimumJumpToTheEndTest {

    @Test
    public  void recursiveSolutionTestCase1(){
        MinimumJumpToTheEnd mj=new MinimumJumpToTheEnd();
        int[] arr={1, 3, 6, 1, 0, 9};
        int exp=3;
        int res=mj.recursiveSolution(arr, 0, arr.length-1);
        Assert.assertEquals(exp,res);
    }
}
