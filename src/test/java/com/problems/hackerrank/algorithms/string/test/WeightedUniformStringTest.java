package com.problems.hackerrank.algorithms.string.test;

import com.problems.hackerrank.algorithms.string.WeightedUniformString;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by Maks on 11/11/2017.
 */
public class WeightedUniformStringTest {
    @Test
    public void TestCache1(){
        WeightedUniformString wu=new WeightedUniformString();
        String str="apple";
        HashSet<Integer> p= wu.prepareCache(str);
        Integer[] arr=new Integer[]{1,16,16+16,12,5};
        for(int i=0; i<arr.length; i++){
            Assert.assertEquals(true, p.contains(arr[i]));
        }
    }

    @Test
    public void TestCache2(){
        WeightedUniformString wu=new WeightedUniformString();
        String str="aaa";
        HashSet<Integer> p= wu.prepareCache(str);
        Integer[] arr=new Integer[]{1,1+1,1+1+1};
        for(int i=0; i<arr.length; i++){
            Assert.assertEquals(true, p.contains(arr[i]));
        }
    }

    @Test
    public void TestCache3(){
        WeightedUniformString wu=new WeightedUniformString();
        String str="abccddde";
        HashSet<Integer> p= wu.prepareCache(str);
        Integer[] arr=new Integer[]{ 1,2,3,3+3,4,4+4,4+4+4,5};
        for(int i=0; i<arr.length; i++){
            Assert.assertEquals(true, p.contains(arr[i]));
        }
    }
}
