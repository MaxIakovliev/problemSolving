package com.problems.techiedelight.test;

import com.problems.techiedelight.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/10/2017.
 */
public class InsertionSortTest implements  com.problems.test.ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        InsertionSort sort=new InsertionSort();
        Integer[] input=new Integer[]{5,3,4,1,2};
        sort.iterativeSort(input);
        for(Integer i=1; i<=5; i++){
            Assert.assertEquals(i,input[i-1]);
        }
    }
}
