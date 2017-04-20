package com;

import com.problems.DutchNationalFlag;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/20/2017.
 */
public class DutchNationalFlagTest {

    @Test
    public  void TestSolution1Case1(){
        DutchNationalFlag s=new DutchNationalFlag();
        Integer[] input=new Integer[]{0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        Integer[] expected=new Integer[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2};
        s.solution1(input);
        for(int i=0; i<input.length; i++){
            Assert.assertEquals(expected[i],input[i]);
        }
    }

    @Test
    public  void TestSolution1Case2(){
        DutchNationalFlag s=new DutchNationalFlag();
        Integer[] input=new Integer[]{2,1,0,2,1,0,0,0,0};
        Integer[] expected=new Integer[]{0,0,0,0,0,1,1,2,2};
        s.solution1(input);
        for(int i=0; i<input.length; i++){
            Assert.assertEquals(expected[i],input[i]);
        }
    }

    @Test
    public  void TestSolution1Case3(){
        DutchNationalFlag s=new DutchNationalFlag();
        Integer[] input=new Integer[]{2,2,2,1,1,1,0,0,0};
        Integer[] expected=new Integer[]{0,0,0,1,1,1,2,2,2};
        s.solution1(input);
        for(int i=0; i<input.length; i++){
            Assert.assertEquals(expected[i],input[i]);
        }
    }
}
