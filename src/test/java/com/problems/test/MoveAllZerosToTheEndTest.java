package com.problems.test;

import com.problems.MoveAllZerosToTheEnd;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/22/2017.
 */
public class MoveAllZerosToTheEndTest {

    @Test
    public  void solution1TestCase1(){
        MoveAllZerosToTheEnd s =new MoveAllZerosToTheEnd();
        Integer[] input=new Integer[]{6, 0, 8, 2, 3, 0, 4, 0, 1};
        s.solution1(input);
        Integer[] expected=new Integer[]{ 6, 8, 2, 3, 4, 1, 0, 0, 0 };

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i],input[i]);
        }

    }
}
