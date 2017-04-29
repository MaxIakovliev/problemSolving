package com.problems.test;

import com.problems.SubarrayHavingGivenSum;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/29/2017.
 */
public class SubarrayHavingGivenSumTEst {

    @Test
    public void solution1TestCase1(){
        SubarrayHavingGivenSum s=new SubarrayHavingGivenSum();
        Integer[] input=new Integer[]{2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        Pair<Integer,Integer> res= s.solution1(input,15);
        Integer[] expected=new Integer[]{6, 0, 9};


        int c=0;
        for(int i=res.getKey(); i<=res.getValue(); i++){
            Assert.assertEquals(expected[c], input[i]);
            c++;
        }
    }

    @Test
    public void solution1TestCase2(){
        SubarrayHavingGivenSum s=new SubarrayHavingGivenSum();
        Integer[] input=new Integer[]{2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        Pair<Integer,Integer> res= s.solution1(input,19);
        Integer[] expected=new Integer[]{0, 9, 7, 3};


        int c=0;
        for(int i=res.getKey(); i<=res.getValue(); i++){
            Assert.assertEquals(expected[c], input[i]);
            c++;
        }
    }
}
