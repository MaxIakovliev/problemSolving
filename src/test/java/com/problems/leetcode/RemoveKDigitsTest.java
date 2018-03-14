package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 2/21/2018.
 */
public class RemoveKDigitsTest {

    @Test
    public  void test1(){
        RemoveKDigits rkd=new RemoveKDigits();
        String act=rkd.removeKdigits("1432219",3);
        Assert.assertEquals("1219",act);
    }

    @Test
    public  void test2(){
        RemoveKDigits rkd=new RemoveKDigits();
        String act=rkd.removeKdigits("10200",1);
        Assert.assertEquals("200",act);
    }


    @Test
    public  void test3(){
        RemoveKDigits rkd=new RemoveKDigits();
        String act=rkd.removeKdigits("10",2);
        Assert.assertEquals("0",act);
    }
}
