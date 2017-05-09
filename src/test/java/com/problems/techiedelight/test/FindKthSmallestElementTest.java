package com.problems.techiedelight.test;

import com.problems.techiedelight.FindKthSmallestElement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/9/2017.
 */
public class FindKthSmallestElementTest {

    @Test
    public  void simpleSolutionTestCase1(){
        FindKthSmallestElement kk=new FindKthSmallestElement();
        Integer[] input=new Integer[] {7, 4, 6, 3, 9, 1};
        int res= kk.simpleSolution(input,3);
        Assert.assertEquals(4, res);
    }
}
