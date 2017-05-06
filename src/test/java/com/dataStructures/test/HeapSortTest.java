package com.dataStructures.test;

import com.algorithms.sort.HeapSort;
import com.problems.test.ISingleTestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/6/2017.
 */
public class HeapSortTest implements ISingleTestCase {
    @Test
    public void solution1TestCase1() {
        int size=20;
        Integer[] input=new Integer[20];
        for(int i=size-1; i>=0; i--){
            input[i]=i;
        }
        HeapSort.sort(input);
        for(Integer i=0;i<size; i++){
            Assert.assertEquals(i, input[i]);
        }

    }
}
