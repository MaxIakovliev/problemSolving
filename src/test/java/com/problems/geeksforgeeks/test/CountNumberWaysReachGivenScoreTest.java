package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.dp.CountNumberWaysReachGivenScore;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 8/26/2017.
 */
public class CountNumberWaysReachGivenScoreTest {

    @Test
    public void CountTestCase1(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();
        int res=s.count(3);
        Assert.assertEquals(1,res);
    }
    @Test
    public void CountTestCase2(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();
        int res=s.count(6);
        Assert.assertEquals(1,res);
    }

    @Test
    public void CountTestCase3(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();
        int res=s.count(20);
        Assert.assertEquals(4,res);
    }
    @Test
    public void CountTestCase4(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();
        int res=s.count(13);
        Assert.assertEquals(2,res);
    }


    @Test
    public void recursivePrintCountTestCase1(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();

       // s.recursivePrint(6,0,new ArrayList<>(),6);
        //Assert.assertEquals(1,res);
    }

    @Test
    public void iterativePrintCountTestCase1(){
        CountNumberWaysReachGivenScore s=new CountNumberWaysReachGivenScore();
        s.iterative(10);
    }
}
