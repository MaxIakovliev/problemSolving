package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 12/22/2017.
 */
public class AtoiTest {

    @Test
    public void test(){
        Atoi atoi=new Atoi();
        for(int i=Integer.MIN_VALUE/10000; i<Integer.MAX_VALUE/100; i++){
            Assert.assertEquals(i,atoi.atoi(Integer.toString(i)));
        }
    }

    @Test
    public void test01(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-214748,atoi.atoi("-214748"));
    }

    @Test
    public void test0(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(1,atoi.atoi("1"));
    }

    @Test
    public void test1(){
        Atoi atoi=new Atoi();
            Assert.assertEquals(0,atoi.atoi("+-1"));
    }

    @Test
    public void test2(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-1,atoi.atoi("       -1"));
    }

    @Test
    public void test3(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-10,atoi.atoi("       -010"));
    }

    @Test
    public void test4(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(0,atoi.atoi(" 1 1"));
    }

    @Test
    public void test5(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(0,atoi.atoi("   +0 123"));
    }

    @Test
    public void test6(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(2147483647,atoi.atoi("2147483648"));
    }

    @Test
    public void test7(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-2147483648,atoi.atoi("-2147483649"));
    }

    @Test
    public void test8(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(123,atoi.atoi("123  456"));
    }

    @Test
    public void test9(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(0,atoi.atoi(" - 321"));
    }

    @Test
    public void test10(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-2147483648,atoi.atoi("      -11919730356x"));
    }

    @Test
    public void test11(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(2147483647,atoi.atoi("    10522545459"));
    }

    @Test
    public void test12(){
        Atoi atoi=new Atoi();
        Assert.assertEquals(-2147483648,atoi.atoi("    -10326662300y"));
    }

}
