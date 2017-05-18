package com.problems.techiedelight.test;

import com.problems.techiedelight.SearchInCircularArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/18/2017.
 */
public class SearchInCircularArrayTest {

    @Test
    public void solution1TestCase1(){
        SearchInCircularArray sca=new SearchInCircularArray();
        Integer[] input={8, 9, 10, 2, 5, 6};
        int exp=2;
        int res=sca.findElement(input,10);
        Assert.assertEquals(exp,res);
    }

    @Test
    public void solution1TestCase2(){
        SearchInCircularArray sca=new SearchInCircularArray();
        Integer[] input={9, 10, 2, 5, 6, 8};
        int exp=3;
        int res=sca.findElement(input,5);
        Assert.assertEquals(exp,res);
    }
}
