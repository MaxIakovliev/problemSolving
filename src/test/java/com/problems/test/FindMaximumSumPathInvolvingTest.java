package com.problems.test;

import com.problems.FindMaximumSumPathInvolving;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 4/30/2017.
 */
public class FindMaximumSumPathInvolvingTest {

    @Test
    public  void solution1TestCase1(){
        FindMaximumSumPathInvolving s=new FindMaximumSumPathInvolving();
        Integer[]a=new Integer[]{3, 6, 7, 8, 10, 12, 15, 18, 100};
        Integer[]b=new Integer[]{1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        Integer[]expected=new Integer[]{1 ,2 , 3 , 6 , 7 , 9 , 10 ,12 , 15 , 16, 18 , 100};
        List<Integer> res= s.solution1(a,b);
        int sum=0;
        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i],res.get(i));
            sum+=res.get(i);
        }
        int expectedSum=199;
        Assert.assertEquals(expectedSum, sum);
    }
}
