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
}
