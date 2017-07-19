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
        Assert.assertEquals("1",true,vn.isNumber("1"));
        Assert.assertEquals("2",true,vn.isNumber("-1"));
        Assert.assertEquals("3",true,vn.isNumber("+1"));
        Assert.assertEquals("4",true,vn.isNumber(" 1"));
        Assert.assertEquals("5",true,vn.isNumber("1 "));
        Assert.assertEquals("6",true,vn.isNumber(" 1 "));
        Assert.assertEquals("7",true,vn.isNumber(" -1 "));
        Assert.assertEquals("8",true,vn.isNumber(" +1 "));
        Assert.assertEquals("9",true,vn.isNumber(" 11 "));
        Assert.assertEquals("10",true,vn.isNumber(" 112 "));
        Assert.assertEquals("11",true,vn.isNumber("   112 "));
        Assert.assertEquals("12",true,vn.isNumber("   112   "));
        Assert.assertEquals("13",true,vn.isNumber("9876543210"));
        Assert.assertEquals("14",true,vn.isNumber("987654321023456789"));
        Assert.assertEquals("15",true,vn.isNumber("987654321023456789  "));
    }

    @Test
    public  void testValidHexNumbers(){
        ValidNumber vn=new ValidNumber();
        int x=0xaafffa;
        Assert.assertEquals("1",true,vn.isNumber("0x0"));
        Assert.assertEquals("2",true,vn.isNumber("0x1"));
        Assert.assertEquals("3",true,vn.isNumber("0x1233455"));
        Assert.assertEquals("4",true,vn.isNumber("0x9a"));
        Assert.assertEquals("5",true,vn.isNumber("0xaa9a"));
        Assert.assertEquals("6",true,vn.isNumber("0xaafffa"));
        Assert.assertEquals("7",true,vn.isNumber("0xaaFFFa"));
        Assert.assertEquals("8",true,vn.isNumber("-0xaaFFFa"));
        Assert.assertEquals("9",true,vn.isNumber("+0xaaFFFa"));
    }

    @Test
    public  void testInvalidIntNumbers(){
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals("1",false,vn.isNumber(""));
        Assert.assertEquals("11",false,vn.isNumber("459277e38+"));
        Assert.assertEquals("1",false,vn.isNumber("671.l"));
        Assert.assertEquals("1",false,vn.isNumber("1-"));
        Assert.assertEquals("1.1",false,vn.isNumber("1+"));
        Assert.assertEquals("1.2",false,vn.isNumber("1+"));
        Assert.assertEquals("1.2",false,vn.isNumber("1+1"));
        Assert.assertEquals("1.22",false,vn.isNumber("1 1"));
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
        int b=0b1;
        ValidNumber vn=new ValidNumber();
        Assert.assertEquals("1",false,vn.isNumber("01b1"));
        Assert.assertEquals("2",false,vn.isNumber("20b1"));
        Assert.assertEquals("3",false,vn.isNumber("0b12"));
        Assert.assertEquals("4",false,vn.isNumber("0b000002"));
        Assert.assertEquals("5",false,vn.isNumber("0 0b01"));
        Assert.assertEquals("5",false,vn.isNumber("0b0 1"));
        Assert.assertEquals("5",false,vn.isNumber("0b0x1"));
        Assert.assertEquals("5",false,vn.isNumber("0b0f1"));
    }


    @Test
    public  void testValidFloatNumbers() {
        double b = .0;
        ValidNumber vn = new ValidNumber();
        Assert.assertEquals("1",true, vn.isNumber(".0"));
        /*Assert.assertEquals("1",true, vn.isNumber("3."));
        Assert.assertEquals("1.1",true, vn.isNumber("1.0f"));
        Assert.assertEquals("2",true, vn.isNumber("1.000f"));
        Assert.assertEquals("3",true, vn.isNumber(".000f"));
        Assert.assertEquals("4",true, vn.isNumber(".00033f"));
        Assert.assertEquals("5",true, vn.isNumber(" .00033f"));
        Assert.assertEquals("6", true, vn.isNumber(" .00033f "));
        Assert.assertEquals("7",true, vn.isNumber(".00033f "));
        Assert.assertEquals("8",true, vn.isNumber("-.00033f "));
        Assert.assertEquals("9",true, vn.isNumber("+.00033f "));
        Assert.assertEquals("10",true, vn.isNumber(" +.00033f "));
        Assert.assertEquals("11",true, vn.isNumber(" -.00033f "));*/
    }

    @Test
    public  void testValidScientificNumbers() {
        Integer b = (int)1e0;

        ValidNumber vn = new ValidNumber();
        Assert.assertEquals("1", true, vn.isNumber("166e-02767"));
        Assert.assertEquals("1", true, vn.isNumber("32.e-23"));
        Assert.assertEquals("1", true, vn.isNumber("46.e3"));
        Assert.assertEquals("1", true, vn.isNumber("1e0"));
        Assert.assertEquals("1", true, vn.isNumber("1e+0"));
        Assert.assertEquals("1", true, vn.isNumber("1e+000"));
        Assert.assertEquals("1", true, vn.isNumber("10e+000"));
        Assert.assertEquals("1", true, vn.isNumber("+10e+000"));
        Assert.assertEquals("1", true, vn.isNumber("-10e+000"));
        Assert.assertEquals("1", true, vn.isNumber(" -10e+000"));
        Assert.assertEquals("1", true, vn.isNumber("  -10e+000"));
        Assert.assertEquals("1", true, vn.isNumber(" -10e+000  "));
    }

    @Test
    public  void testIncorrectNumbers() {
        float b =959440.94f;

        ValidNumber vn = new ValidNumber();
        Assert.assertEquals("1", false, vn.isNumber("-788f"));
        Assert.assertEquals("1", false, vn.isNumber("2e+60++604"));
        Assert.assertEquals("1", false, vn.isNumber("459277e38+"));
        Assert.assertEquals("1", false, vn.isNumber("6e6.5"));
        Assert.assertEquals("1.11", false, vn.isNumber("0x."));
        Assert.assertEquals("1.112", false, vn.isNumber("07L"));
        Assert.assertEquals("1.1", false, vn.isNumber("0x"));
        Assert.assertEquals("1.11", false, vn.isNumber("0x 0"));
        Assert.assertEquals("1.2", false, vn.isNumber("0b"));
        Assert.assertEquals("1", false, vn.isNumber(".-4"));
        Assert.assertEquals("1", false, vn.isNumber("."));
        Assert.assertEquals("1", false, vn.isNumber("1x11"));
        Assert.assertEquals("1.1", false, vn.isNumber(". 0"));
        Assert.assertEquals("1.2", false, vn.isNumber("- 0"));
        Assert.assertEquals("1.3", false, vn.isNumber(" - 0"));
        Assert.assertEquals("1.4", false, vn.isNumber(" .e"));
        Assert.assertEquals("1.5", false, vn.isNumber("1 ."));
        Assert.assertEquals("2", false, vn.isNumber(" ."));
        Assert.assertEquals("3", false, vn.isNumber(" . "));
        Assert.assertEquals("4", false, vn.isNumber(" + "));
        Assert.assertEquals("5", false, vn.isNumber(" - "));
        Assert.assertEquals("6", false, vn.isNumber("0.0."));
        Assert.assertEquals("7", false, vn.isNumber("0.."));
        Assert.assertEquals("8", false, vn.isNumber("..0"));
        Assert.assertEquals("9", false, vn.isNumber("e"));
        Assert.assertEquals("10", false, vn.isNumber("x"));
        Assert.assertEquals("11", false, vn.isNumber("f"));
        Assert.assertEquals("11.1", false, vn.isNumber("0e"));
        Assert.assertEquals("11.2", false, vn.isNumber("0e+"));
        Assert.assertEquals("11", false, vn.isNumber("10e+000-"));
    }

    }
