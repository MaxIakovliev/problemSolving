package com.problems.techiedelight.test;

import com.problems.techiedelight.KnapsackProblem01;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/22/2017.
 */
public class KnapsackProblem01Test {
    @Test
    public void solution1TestCase1(){
        KnapsackProblem01 kp=new KnapsackProblem01();
        Integer[] weights={ 1, 2, 3, 8, 7, 4};
        Integer[] vals={20, 5, 10, 40, 15, 25};
        int limit=10;
        int exp=60;
        int res=kp.recursiveSolution(weights,vals,vals.length-1,limit);
        Assert.assertEquals(exp, res);

    }
}
