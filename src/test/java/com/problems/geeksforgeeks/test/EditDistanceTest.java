package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.EditDistance;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/5/2017.
 */
public class EditDistanceTest {

    @Test
    public void recursiveSolutionTestCase1(){
        EditDistance ed=new EditDistance();
        String s1="abc";
        String s2="adc";
        int exp=1;
        Assert.assertEquals(exp, ed.recursiveSolution(s1,s2,s1.length(),s2.length()));
    }


    @Test
    public void recursiveSolutionTestCase2(){
        EditDistance ed=new EditDistance();
        String s1="abc";
        String s2="adb";
        int exp=2;
        Assert.assertEquals(exp, ed.recursiveSolution(s1,s2,s1.length(),s2.length()));
    }

    @Test
    public void recursiveSolutionTestCase3(){
        EditDistance ed=new EditDistance();
        String s1="abc";
        String s2="qwd";
        int exp=3;
        Assert.assertEquals(exp, ed.recursiveSolution(s1,s2,s1.length(),s2.length()));
    }


    @Test
    public void iterativeSolutionTestCase1(){
        EditDistance ed=new EditDistance();
        String s1="abc";
        String s2="adc";
        int exp=1;
        Assert.assertEquals(exp, ed.iterativeSolution(s1,s2,s1.length(),s2.length()));
    }

    @Test
    public void iterativeSolutionTestCase2(){
        EditDistance ed=new EditDistance();
        String s1="abc";
        String s2="qwd";
        int exp=3;
        Assert.assertEquals(exp, ed.iterativeSolution(s1,s2,s1.length(),s2.length()));
    }
}
