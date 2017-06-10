package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.CutRod;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/10/2017.
 */
public class CutRodTest {

    @Test
    public void recursiveSolutionTestCase1(){
        CutRod cr=new CutRod();
        int[] price={1, 5, 8, 9, 10, 17, 17, 20};
        int exp=22;
        int res=cr.recursiveSolution(price, price.length);
        Assert.assertEquals(exp,res);
    }
}
