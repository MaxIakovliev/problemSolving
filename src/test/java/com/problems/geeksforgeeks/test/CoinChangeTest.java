package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.CoinChange;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/5/2017.
 */
public class CoinChangeTest {

    @Test
    public  void recursiveSolutionTestCase1(){
        CoinChange cc=new CoinChange();
        int res= cc.recursiveSolution(new int[]{1,2,3},3,4);
        int exp=4;
        Assert.assertEquals(exp, res);

    }

    @Test
    public  void iterativeSolutionTestCase1(){
        CoinChange cc=new CoinChange();
        int res= cc.iterativeSolution(new int[]{1,2,3},3,4);
        int exp=4;
        Assert.assertEquals(exp, res);

    }
}
