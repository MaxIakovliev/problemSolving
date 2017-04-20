package com.problems.test;

import com.problems.InplaceMergeTwoSortedArrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/20/2017.
 */
public class InplaceMergeTwoSortedArraysTest {

    @Test
    public  void TestSolution1Case1(){
        InplaceMergeTwoSortedArrays s =new InplaceMergeTwoSortedArrays();
        Integer[] inputA=new Integer[]{1, 4, 7, 8, 10};
        Integer[] inputB=new Integer[]{ 2, 3, 9 };
        s.solution1(inputA,inputB);

        Integer[] expectedA=new Integer[]{1, 2, 3, 4, 7};
        Integer[] expectedB=new Integer[]{ 8, 9, 10 };

        for(int i=0; i<expectedA.length; i++){
            Assert.assertEquals(expectedA[i],inputA[i]);
        }

        for(int i=0; i<expectedB.length; i++){
            Assert.assertEquals(expectedB[i],inputB[i]);
        }



    }
}
