package com.problems.techiedelight.test;

import com.problems.techiedelight.MaximizeValueOfExpression;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/23/2017.
 */
public class MaximizeValueOfExpressionTezt {

    @Test
    public  void solution1TestCase1(){
        MaximizeValueOfExpression mv=new MaximizeValueOfExpression();
        Integer[] input=new Integer[]{ 3, 9, 10, 1, 30, 40};
        int res=mv.solution1(input);
        int exp=46;
        Assert.assertEquals(exp, res);
    }
}
