package com.problems.techiedelight.test;

import com.problems.techiedelight.SortKSortedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/8/2017.
 */
public class SortKSortedArrayTest {

    @Test
    public  void solution1TestCase1(){
        SortKSortedArray s=new SortKSortedArray();
        Integer[] input=new Integer[]{1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
        int k=2;
        s.solution1(input,k);
        Integer[] expected=new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0; i< expected.length; i++){
            Assert.assertEquals(expected[i], input[i]);
        }

    }
}
