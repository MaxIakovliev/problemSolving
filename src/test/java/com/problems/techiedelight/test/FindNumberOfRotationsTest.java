package com.problems.techiedelight.test;

import com.problems.techiedelight.FindNumberOfRotations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/17/2017.
 */
public class FindNumberOfRotationsTest {

    @Test
    public void linearSolutionTestCase1(){
        FindNumberOfRotations fr=new FindNumberOfRotations();
        Integer[] input={8, 9, 10, 2, 5, 6};
        int res= fr.linearSolution(input);
        int exp=3;
        Assert.assertEquals(exp,res);
    }

    @Test
    public void linearSolutionTestCase2(){
        FindNumberOfRotations fr=new FindNumberOfRotations();
        Integer[] input={2, 5, 6, 8, 9, 10};
        int res= fr.linearSolution(input);
        int exp=0;
        Assert.assertEquals(exp,res);
    }
}
