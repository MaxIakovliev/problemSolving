package com.problems.geeksforgeeks.test;

import com.problems.geeksforgeeks.dp.MaximumLengthChainOfPairs;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 6/18/2017.
 */
public class MaximumLengthChainOfPairsTest {

    @Test
    public  void solution1TestCase1(){
        MaximumLengthChainOfPairs m=new MaximumLengthChainOfPairs();
        Pair<Integer,Integer> arr[]=new Pair[]{new Pair(5,24), new Pair(15, 25),
                                     new Pair (27, 40), new Pair(50, 60)};
        int exp=3;
        int res=m.solution1(arr);
        Assert.assertEquals(exp,res);
    }
}
