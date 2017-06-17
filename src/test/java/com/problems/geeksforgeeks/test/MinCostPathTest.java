package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.MinCostPath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/4/2017.
 */
public class MinCostPathTest {

    @Test
    public  void naiveRecursiveSolutionTestCase1(){
        MinCostPath mcp=new MinCostPath();
        int[][]arr={{1, 2, 3},
                    {4, 8, 2},
                    {1, 5, 3} };
        int res = mcp.recursive(arr,2,2);
        int exp=8;
        Assert.assertEquals(exp,res);
    }
}
