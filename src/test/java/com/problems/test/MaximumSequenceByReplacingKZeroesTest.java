package com.problems.test;

import com.problems.MaximumSequenceByReplacingKZeroes;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/29/2017.
 */
public class MaximumSequenceByReplacingKZeroesTest {

    @Test
    public  void solution1TestCase1(){
        MaximumSequenceByReplacingKZeroes s=new MaximumSequenceByReplacingKZeroes();
        Integer[] input=new Integer[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        Pair<Integer,Integer> res=s.solutio1(input, 0);
        Pair<Integer,Integer> expected=new Pair<Integer, Integer>(6,9);
        Assert.assertEquals(expected.getKey(), res.getKey());
        Assert.assertEquals(expected.getValue(), res.getValue());
    }

    @Test
    public  void solution1TestCase2(){
        MaximumSequenceByReplacingKZeroes s=new MaximumSequenceByReplacingKZeroes();
        Integer[] input=new Integer[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        Pair<Integer,Integer> res=s.solutio1(input, 1);
        Pair<Integer,Integer> expected=new Pair<Integer, Integer>(3,9);
        Assert.assertEquals(expected.getKey(), res.getKey());
        Assert.assertEquals(expected.getValue(), res.getValue());
    }

    @Test
    public  void solution1TestCase3(){
        MaximumSequenceByReplacingKZeroes s=new MaximumSequenceByReplacingKZeroes();
        Integer[] input=new Integer[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
        Pair<Integer,Integer> res=s.solutio1(input, 2);
        Pair<Integer,Integer> expected=new Pair<Integer, Integer>(0,9);
        Assert.assertEquals(expected.getKey(), res.getKey());
        Assert.assertEquals(expected.getValue(), res.getValue());
    }
}
