package com.problems.techiedelight.test;

import com.problems.techiedelight.InversionCountOfAnArray;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 5/15/2017.
 */
public class InversionCountOfAnArrayTest {


    @Test
    public  void solution1TestCase1(){
        InversionCountOfAnArray s=new InversionCountOfAnArray();
        List<Pair<Integer,Integer>> exp=new ArrayList<Pair<Integer, Integer>>();
        exp.add(new Pair<Integer, Integer>(9,6));
        exp.add(new Pair<Integer, Integer>(9,4));
        exp.add(new Pair<Integer, Integer>(9,5));
        exp.add(new Pair<Integer, Integer>(6,4));
        exp.add(new Pair<Integer, Integer>(6,5));
        Integer input[]={1, 9, 6, 4, 5};
        List<Pair<Integer,Integer>>  res= s.solution1(input);
        Assert.assertEquals(exp.size(), res.size());

        for(int i=0; i<exp.size(); i++){
            Assert.assertEquals(exp.get(i).getKey(),res.get(i).getKey());
            Assert.assertEquals(exp.get(i).getValue(),res.get(i).getValue());
        }

    }
}
