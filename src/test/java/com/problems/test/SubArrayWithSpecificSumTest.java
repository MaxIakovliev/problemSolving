package com.problems.test;

import com.problems.SubArrayWithSpecificSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 4/18/2017.
 */
public class SubArrayWithSpecificSumTest {
    @Test
    public void TestSolution1Case1(){
        SubArrayWithSpecificSum s=new SubArrayWithSpecificSum();
        Integer[] input={ 4, 2, -3, -1, 0, 4 };
        List<List<Integer>> result= s.Solution1(input, 0);
        Assert.assertEquals(2,result.size());

    }
}
