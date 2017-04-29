package com.problems.test;

import com.problems.MinimumSumSubarrayGivenSize;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/29/2017.
 */
public class MinimumSumSubarrayGivenSizeTest {

    @Test
    public void solution1TestCase1(){
        MinimumSumSubarrayGivenSize s=new MinimumSumSubarrayGivenSize();
        Integer[] input= new Integer[]{10, 4, 2, 5, 6, 3, 8, 1};
        Pair<Integer,Integer> res= s.solution1(input,3);
        Pair<Integer,Integer> expected=new Pair<Integer, Integer>(1,3);
        Assert.assertEquals(expected.getKey(),res.getKey());
        Assert.assertEquals(expected.getValue(),res.getValue());
    }
}
