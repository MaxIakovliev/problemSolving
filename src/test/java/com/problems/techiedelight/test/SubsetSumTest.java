package com.problems.techiedelight.test;

import com.problems.techiedelight.SubsetSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/23/2017.
 */
public class SubsetSumTest {
    @Test
    public  void solution1TestCase1(){
        SubsetSum ss=new SubsetSum();
        Integer[] arr={7, 3, 2, 5, 8};
        boolean res=ss.solution1(arr,14);
        boolean exp=true;
        Assert.assertEquals(exp,res);
    }
}
