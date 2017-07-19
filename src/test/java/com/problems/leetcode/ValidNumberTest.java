package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/19/2017.
 */
public class ValidNumberTest {

    @Test
    public  void testValidIntNumbers(){
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals(true,vn.isNumber("1"));
        Assert.assertEquals(true,vn.isNumber("-1"));
        Assert.assertEquals(true,vn.isNumber("+1"));
        Assert.assertEquals(true,vn.isNumber(" 1"));
        Assert.assertEquals(true,vn.isNumber("1 "));
        Assert.assertEquals(true,vn.isNumber(" 1 "));
        Assert.assertEquals(true,vn.isNumber(" -1 "));
        Assert.assertEquals(true,vn.isNumber(" +1 "));
        Assert.assertEquals(true,vn.isNumber(" 11 "));
        Assert.assertEquals(true,vn.isNumber(" 112 "));
        Assert.assertEquals(true,vn.isNumber("   112 "));
        Assert.assertEquals(true,vn.isNumber("   112   "));
        Assert.assertEquals(true,vn.isNumber("9876543210"));
        Assert.assertEquals(true,vn.isNumber("987654321023456789"));
        Assert.assertEquals(true,vn.isNumber("987654321023456789  "));
    }

    @Test
    public  void testInvalidIntNumbers(){
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals("1",false,vn.isNumber(""));
        Assert.assertEquals("1",false,vn.isNumber("1-"));
        Assert.assertEquals("1.1",false,vn.isNumber("1+"));
        Assert.assertEquals("1.2",false,vn.isNumber("1+"));
        Assert.assertEquals("1.2",false,vn.isNumber("1+1"));
        Assert.assertEquals("2",false,vn.isNumber(" "));
        Assert.assertEquals("3",false,vn.isNumber("! "));
        Assert.assertEquals("4",false,vn.isNumber(" q "));
        Assert.assertEquals("5",false,vn.isNumber(" 11a "));
        Assert.assertEquals("6",false,vn.isNumber(" 11g "));
        Assert.assertEquals("7",false,vn.isNumber("   1g2 "));
        Assert.assertEquals("8",false,vn.isNumber("   r111   "));
        Assert.assertEquals("9",false,vn.isNumber("b9876543210"));
        Assert.assertEquals("10",false,vn.isNumber("x987654321023456789"));
        Assert.assertEquals("11",false,vn.isNumber("f987654321023456789  "));
    }

    @Test
    public  void testValidBinNumbers(){
        int b=0b0001;
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals(true,vn.isNumber("0b1"));
        Assert.assertEquals(true,vn.isNumber("-0b1"));
        Assert.assertEquals(true,vn.isNumber("+0b1"));
        Assert.assertEquals(true,vn.isNumber("0b1111"));
        Assert.assertEquals(true,vn.isNumber("0b0001111"));
        Assert.assertEquals(true,vn.isNumber("0b000110101"));
        Assert.assertEquals(true,vn.isNumber(" 0b000110101"));
        Assert.assertEquals(true,vn.isNumber(" 0b000110101 "));
        Assert.assertEquals(true,vn.isNumber("   0b000110101 "));
        Assert.assertEquals(true,vn.isNumber("   -0b000110101 "));
        Assert.assertEquals(true,vn.isNumber("   +0b000110101 "));
        Assert.assertEquals(true,vn.isNumber("   0b000110101   "));
        Assert.assertEquals(true,vn.isNumber("0b000110101   "));
    }

    @Test
    public  void testInvalidBinNumbers(){
        int b=0b0001;
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals(false,vn.isNumber("00b1"));
    }
}
