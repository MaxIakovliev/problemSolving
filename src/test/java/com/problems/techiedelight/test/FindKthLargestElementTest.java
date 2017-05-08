package com.problems.techiedelight.test;

import com.problems.techiedelight.FindKthLargestElement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/8/2017.
 */
public class FindKthLargestElementTest {

    @Test
    public  void solution1TestCase1(){
        FindKthLargestElement f=new FindKthLargestElement();
        Integer input[] ={7, 4, 6, 3, 9, 1};
        int res =f.solution1(input,2);
        int expected=7;
        Assert.assertEquals(expected,res);
    }
}
