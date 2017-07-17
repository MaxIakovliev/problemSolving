package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.dp.CountPossiblePathsInMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/18/2017.
 */
public class CountPossiblePathsInMatrixTest {
    @Test
    public void iterativeSolutionTestCase1(){
        CountPossiblePathsInMatrix cppm=new CountPossiblePathsInMatrix();
        int res=cppm.iterativeSolution(3,3);
        Assert.assertEquals(6,res);
    }

    @Test
    public void recursiveSolutionTestCase1(){
        CountPossiblePathsInMatrix cppm=new CountPossiblePathsInMatrix();
        int res=cppm.recursivesolution(3,3);
        Assert.assertEquals(6,res);
    }
}
