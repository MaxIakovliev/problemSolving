package com.problems.test;

import com.problems.BoyerMooreMajorityVoteAlgorithm;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/22/2017.
 */
public class BoyerMooreMajorityVoteAlgorithmTest {

    @Test
    public  void solution1TestCase1(){
        BoyerMooreMajorityVoteAlgorithm s=new BoyerMooreMajorityVoteAlgorithm();
        Integer[] input=new Integer[]{2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2};
        int result =s.solution1(input);
        Assert.assertEquals(2,result);
    }
}
