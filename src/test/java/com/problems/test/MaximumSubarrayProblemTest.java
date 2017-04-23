package com.problems.test;

import com.problems.MaximumSubarrayProblem;

import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/23/2017.
 */
public class MaximumSubarrayProblemTest {

    @Test
    public  void solution1TestCase1(){
        MaximumSubarrayProblem s=new MaximumSubarrayProblem();
        Integer[] input=new Integer[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = s.solution1(input);
        Assert.assertEquals(6, result);
    }

    @Test
    public  void solution2TestCase1(){
        MaximumSubarrayProblem s=new MaximumSubarrayProblem();
        Integer[] input=new Integer[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Pair<Integer,Integer> result = s.solution2WithSubArrayIndx(input);
        Integer[] output=new Integer[result.getValue()-result.getKey()+1];
        for(int i=0; i<output.length; i++){
            output[i]=input[result.getKey()+i];
        }
        Integer[] expected=new Integer[]{4, -1, 2, 1};
        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i], output[i]);
        }
    }
}
