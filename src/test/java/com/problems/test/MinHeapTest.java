package com.problems.test;

import com.problems.techiedelight.MinHeap;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/6/2017.
 */
public class MinHeapTest implements  ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MinHeap mh=new MinHeap();
        int size=20;
        Integer[] input=new Integer[size];
        int counter=0;
        //for (int i=size-1; i>=0; i--){
        for (int i=0; i<size; i++){
            input[counter]=i;
            counter++;
        }
        mh.sort(input);
        Integer expected=size-1;
        Assert.assertEquals(expected, input[0]);
    }

    @Test
    public  void isMinHeapTestCase1(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{1,2,3,4,5,6};
        Assert.assertTrue(mh.isArrayAMinHeap(input));
    }

    @Test
    public  void isMinHeapTestCase2(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{1,2,3,4,5,2};
        Assert.assertFalse(mh.isArrayAMinHeap(input));
    }

    @Test
    public  void isMinHeapTestCase3(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{1,2,3,4,7,6};
        Assert.assertFalse(mh.isArrayAMinHeap(input));
    }

    @Test
    public  void isMinHeapTestCase4(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{10,2,3,4,5,6};
        Assert.assertFalse(mh.isArrayAMinHeap(input));
    }

    @Test
    public  void isMinHeapTestCase5(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{10,12,13,14,15,16};
        Assert.assertTrue(mh.isArrayAMinHeap(input));
    }

    @Test
    public  void isMinHeapTestCase6(){
        MinHeap mh=new MinHeap();
        Integer[] input=new Integer[]{10,2,13,14,15,16};
        Assert.assertFalse(mh.isArrayAMinHeap(input));
    }
}
