package com.problems.techiedelight.test;

import com.problems.techiedelight.UnlimittedCoinChangeMaking;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/24/2017.
 */
public class UnlimittedCoinChangeMakingTest {

    @Test
    public  void bottomUpSolutionTestCase1(){
        UnlimittedCoinChangeMaking uc=new UnlimittedCoinChangeMaking();
        Integer coins[]={1,2,3,4};
        int exp=2;
        int res=uc.bottomUpSolution(coins, 8 );
        Assert.assertEquals(exp,res);
    }
}
