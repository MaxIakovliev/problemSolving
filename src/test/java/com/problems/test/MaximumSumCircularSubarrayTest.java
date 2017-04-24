package com.problems.test;

import com.problems.MaximumSumCircularSubarray;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 4/24/2017.
 */
public class MaximumSumCircularSubarrayTest {

    @Test
    public void solution1TestCase1(){
        MaximumSumCircularSubarray s =new MaximumSumCircularSubarray();
        Integer[] input=new Integer[]{2, 1, -5, 4, -3, 1, -3, 4, -1};
        Integer[] expected=new Integer[]{4, -1, 2, 1};
        List<Integer> result=s.solution1(input);

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], result.get(i));
        }

    }

    @Test
    public void solution1TestCase2(){
        MaximumSumCircularSubarray s =new MaximumSumCircularSubarray();
        Integer[] input=new Integer[]{-3, 1, -3, 4, -1, 2, 1, -5, 4};
        Integer[] expected=new Integer[]{4, -1, 2, 1};
        List<Integer> result=s.solution1(input);

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], result.get(i));
        }

    }
}
