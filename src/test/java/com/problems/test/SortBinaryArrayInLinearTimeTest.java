package com.problems.test;

import com.problems.SortBinaryArrayInLinearTime;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/19/2017.
 */
public class SortBinaryArrayInLinearTimeTest {

    @Test
    public  void Solution1Test1(){
        SortBinaryArrayInLinearTime s =new SortBinaryArrayInLinearTime();
        Integer[] input= new Integer[]{ 1, 0, 1, 0, 1, 0, 0, 1 };
        Integer[] expected= new Integer[]{ 0, 0, 0, 0, 1, 1, 1, 1 };

        s.Solution1(input);
        for(int i=0; i<expected.length; i++ ){
            Assert.assertEquals(expected[i], input[i]);
        }
    }
}
