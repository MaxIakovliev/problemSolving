package com.problems.test;

import com.problems.ReplaceEachElementWithProduct;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/22/2017.
 */
public class ReplaceEachElementWithProductTest {

    @Test
    public  void solution1TestCase1(){
        ReplaceEachElementWithProduct s=new ReplaceEachElementWithProduct();
        Integer[] input=new Integer[]{1, 2, 3, 4, 5};
        Integer[] expected=new Integer[]{120, 60, 40, 30, 24};

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], input[i]);
        }
    }
}
