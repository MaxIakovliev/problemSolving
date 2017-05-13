package com.problems.techiedelight.test;

import com.problems.techiedelight.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/13/2017.
 */
public class QuickSortTest implements com.problems.test.ISingleTestCase {
    @Test
    public void solution1TestCase1() {
        QuickSort qs=new QuickSort();
        Integer input[]={12, 11, 13, 5, 6, 7};
        Integer exp[]={5, 6, 7, 11, 12, 13};

        qs.sort(input);

        for(int i=0; i<exp.length; i++){
            Assert.assertEquals(exp[i],input[i]);
        }
    }
}
