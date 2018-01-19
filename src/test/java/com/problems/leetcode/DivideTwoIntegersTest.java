package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 1/18/2018.
 */
public class DivideTwoIntegersTest {

    @Test
    public void test1(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        Assert.assertEquals(1,dti.divide(1,1));
    }

    @Test
    public void test2(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        for(int i=0; i<100; i++){
            for(int j=1; j<100; j++){
                Assert.assertEquals(i/j,dti.divide(i,j));
            }
        }
    }

    @Test
    public void test3(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        for(int i=1/*-100*/; i<100; i++){
            for(int j=-1/*-101*/; j<100; j++){
                if(j==0)
                    continue;
                Assert.assertEquals("i="+i+" j="+j,i/j,dti.divide(i,j));
            }
        }
    }

    @Test
    public void test4(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        for(int i=100; i<100; i++){
            for(int j=-101; j<100; j++){
                if(j==0)
                    continue;
                Assert.assertEquals("i="+i+" j="+j,i/j,dti.divide(i,j));
            }
        }
    }

    @Test
    public void test5(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        for(int i=-100; i<100; i++){
            for(int j=101; j<100; j++){
                if(j==0)
                    continue;
                Assert.assertEquals("i="+i+" j="+j,i/j,dti.divide(i,j));
            }
        }
    }

    @Test
    public void test6(){
        DivideTwoIntegers dti=new DivideTwoIntegers();
        Assert.assertEquals(2147483647,dti.divide(-2147483648,-1));
    }
}
