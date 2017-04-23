package com.problems.test;

import com.problems.MaximumDifferenceInArrayWithConstraints;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/23/2017.
 */
public class MaximumDifferenceInArrayWithConstraintsTest {

    @Test
    public  void solutiontTestCase1(){
        MaximumDifferenceInArrayWithConstraints s=new MaximumDifferenceInArrayWithConstraints();
        Integer[] input=new Integer[]{ 2, 7, 9, 5, 1, 3, 5};
        int result = s.solution1(input);
        Assert.assertEquals(7,result);
    }

    @Test
    public  void solutiontTestCase2(){
        MaximumDifferenceInArrayWithConstraints s=new MaximumDifferenceInArrayWithConstraints();
        Integer[] input=new Integer[]{ 2, 7, 9, 5, 1, 3, 5,1,2,3,4,5,9};
        int result = s.solution1(input);
        Assert.assertEquals(8,result);
    }
}
