package com.problems.techiedelight.test;

import com.problems.techiedelight.MergeSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/13/2017.
 */
public class MergeSortTest implements com.problems.test.ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MergeSort ms=new MergeSort();
        Integer input[]={12, 11, 13, 5, 6, 7};
        Integer exp[]={5, 6, 7, 11, 12, 13};

        ms.sort(input);

        for(int i=0; i<exp.length; i++){
            Assert.assertEquals(exp[i],input[i]);
        }
    }
}
