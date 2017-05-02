package com.problems.test;

import com.problems.MaximumProductSubarray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/2/2017.
 */
public class MaximumProductSubarrayTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MaximumProductSubarray s =new MaximumProductSubarray();
        Integer[] input=new Integer[]{-6, 4, -5, 8, -10, 0, 8};
        int expected=1600;
        Assert.assertEquals(expected,s.solution1(input));


    }
}
