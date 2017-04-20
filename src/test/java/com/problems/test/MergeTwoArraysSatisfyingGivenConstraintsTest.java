package com.problems.test;

import com.problems.MergeTwoArraysSatisfyingGivenConstraints;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/20/2017.
 */
public class MergeTwoArraysSatisfyingGivenConstraintsTest {

    @Test
    public void TestSolution1Case1(){
        MergeTwoArraysSatisfyingGivenConstraints s=new MergeTwoArraysSatisfyingGivenConstraints();
        Integer[] a=new Integer[]{ 0, 2, 0, 3, 0, 5, 6, 0, 0};
        Integer[] b=new Integer[]{1, 8, 9, 10, 15};
        s.solution1(a,b);
        Integer[] expected =new Integer[]{1, 2, 3, 5, 6, 8, 9, 10, 15};
        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i],a[i]);
        }

    }
}
