package com.problems.techiedelight.test;

import com.problems.techiedelight.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/10/2017.
 */
public class BubbleSortTest implements com.problems.test.ISingleTestCase {
    @Test
    public void solution1TestCase1() {
        BubbleSort bs=new BubbleSort();
        int size=100;
        Integer[] input=new Integer[size];
        for(int i=size; i>0; i--){
            input[size-i]=i;
        }
        bs.iterative(input);
        for(Integer i=1; i<=size; i++){
            Assert.assertEquals(i,input[i-1]);
        }
    }
}
