package com.problems.test;

import com.problems.MaximumSumOfSubarrayWithoutAdj;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/2/2017.
 */
public class MaximumSumOfSubarrayWithoutAdjTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MaximumSumOfSubarrayWithoutAdj s=new MaximumSumOfSubarrayWithoutAdj();
        Integer input[]= { 1, 2, 9, 4, 5, 0, 4, 11, 6};
        int expected=26;
        Assert.assertEquals(expected, s.solution1(input));

    }
}
