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

    @Test
    public void iterativeTabulationCountTestCase1(){
        LongestCommonSubsequence lcs=new LongestCommonSubsequence();
        String x="AGGTAB";
        String y="GXTXAYB";
        int res=lcs.iterativeTabulationSolution(x.toCharArray(),y.toCharArray());
        int exp=4;
        Assert.assertEquals(exp,res);
    }

    @Test
    public void iterativeGetLCSCountTestCase1(){
        LongestCommonSubsequence lcs=new LongestCommonSubsequence();
        String x="AGGTAB";
        String y="GXTXAYB";
        char[] res=lcs.getLCSIterative(x.toCharArray(),y.toCharArray());
        char[] exp={'G','T','A','B'};
        for(int i=0; i<exp.length; i++) {
            Assert.assertEquals(exp[i], res[i]);
        }
    }
}
