package com.problems.techiedelight.test;

import com.problems.techiedelight.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/10/2017.
 */
public class SelectionSortTest implements com.problems.test.ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        SelectionSort ss=new SelectionSort();
        int size=100;
        Integer[] input=new Integer[size];
        for(int i=size; i>0; i--){
            input[size-i]=i;
        }
        ss.iterative(input);

        for(Integer i=1; i<=size; i++){
            Assert.assertEquals(i,input[i-1]);
        }

    }
}
