package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.LongestCommonSubsequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/31/2017.
 */
public class LongestCommonSubsequenceTest {

    @Test
    public void recursiveCountTestCase1(){
        LongestCommonSubsequence lcs=new LongestCommonSubsequence();
        String x="AGGTAB";
        String y="GXTXAYB";
        int res=lcs.recursiveCount(x.toCharArray(),y.toCharArray(),x.length(),y.length());
        int exp=4;
        Assert.assertEquals(exp,res);
    }
}
