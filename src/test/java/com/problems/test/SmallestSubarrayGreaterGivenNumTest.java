package com.problems.test;

import com.problems.SmallestSubarrayGreaterGivenNum;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 4/29/2017.
 */
public class SmallestSubarrayGreaterGivenNumTest {

    @Test
    public  void solution1TestCase1(){
        SmallestSubarrayGreaterGivenNum s=new SmallestSubarrayGreaterGivenNum();
        Integer[] input=new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Pair<Integer,Integer> res= s.solution1(input, 20);
        Integer[] expected =new Integer[]{6, 7, 8};
        int c=0;
        for(int i=res.getKey(); i<res.getValue(); i++){
            Assert.assertEquals(expected[c], input[i]);
            c++;
        }
        Assert.assertEquals(c,expected.length);
    }
}
