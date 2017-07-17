package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.dp.CatalanNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/18/2017.
 */
public class CatalanNumberTest {

    @Test
    public void recursiveSolutionTestCase1(){
        CatalanNumber cn=new CatalanNumber();
        long[] exp=new long[]{1L, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670L, 129644790L, 477638700L, 1767263190L, 6564120420L};
        for(int i=0;i<exp.length; i++){
            long res=cn.recursiveSolution(i);
            Assert.assertEquals(exp[i],res);
        }
    }
}
