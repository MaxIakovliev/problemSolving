package com.problems.test;

import com.problems.LongestContinuousSequenceWithSameSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/3/2017.
 */
public class LongestContinuousSequenceWithSameSumTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        LongestContinuousSequenceWithSameSum s=new LongestContinuousSequenceWithSameSum();
        Integer x[]={0, 0, 1, 1, 1, 1};
        Integer y[]={0, 1, 1, 0, 1, 0};
        int res = s.solution1(x,y);
        int expected=3;
        Assert.assertEquals(expected, res);

    }
}
