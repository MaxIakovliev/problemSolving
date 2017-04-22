package com.problems.test;

import com.problems.RearrangeTheArrayZigZagOrder;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/22/2017.
 */
public class RearrangeTheArrayZigZagOrderTest {

    @Test
    public  void TestRearrangeArrayCase1(){
        RearrangeTheArrayZigZagOrder s=new RearrangeTheArrayZigZagOrder();
        Integer[] input=new Integer[]{1, 2, 3, 4, 5, 6, 7};
        s.rearrangeArray(input);
        Integer[] expected=new Integer[]{1, 3, 2, 5, 4, 7, 6};

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], input[i]);
        }

    }
    @Test
    public  void TestRearrangeArrayCase2(){
        RearrangeTheArrayZigZagOrder s=new RearrangeTheArrayZigZagOrder();
        Integer[] input=new Integer[]{9, 6, 8, 3, 7};
        s.rearrangeArray(input);
        Integer[] expected=new Integer[]{6, 9, 3, 8, 7};

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], input[i]);
        }

    }
    @Test
    public  void TestRearrangeArrayCase3(){
        RearrangeTheArrayZigZagOrder s=new RearrangeTheArrayZigZagOrder();
        Integer[] input=new Integer[]{6, 9, 2, 5, 1, 4};
        s.rearrangeArray(input);
        Integer[] expected=new Integer[]{6, 9, 2, 5, 1, 4};

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], input[i]);
        }

    }
}
