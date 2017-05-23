package com.problems.techiedelight.test;

import com.problems.techiedelight.RodCutting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/23/2017.
 */
public class RodCuttingTest {

    @Test
    public  void solution1TestCase1(){
        RodCutting rc=new RodCutting();
        Integer price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int res=rc.recursive(price,4);
        int exp=10;
        Assert.assertEquals(exp, res);
    }
}
