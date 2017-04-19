package com.problems.test;

import com.problems.MaximumSubArrayOfGivenSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 4/19/2017.
 */
public class MaximumSubArrayOfGivenSumTest {

    @Test
    public  void solution1Test1(){
        MaximumSubArrayOfGivenSum s=new MaximumSubArrayOfGivenSum();
        Integer[] arr=new Integer[]{ 5, 6, -5, 5, 3, 5, 3, -2, 0};
        List<Integer>result=  s.solution1(arr,8);
        Assert.assertEquals(4,result.size());
    }
}
