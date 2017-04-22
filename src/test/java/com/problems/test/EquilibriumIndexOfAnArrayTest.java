package com.problems.test;

import com.problems.EquilibriumIndexOfAnArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/22/2017.
 */
public class EquilibriumIndexOfAnArrayTest {

    @Test
    public void Solution1TestCase1(){
        EquilibriumIndexOfAnArray s =new EquilibriumIndexOfAnArray();
        Integer[] input=new Integer[]{0, -3, 5, -4, -2, 3, 1, 0};
        List<Integer> res= s.solution1(input);
        List<Integer> expected =new ArrayList<Integer>();
        expected.add(0);
        expected.add(3);
        expected.add(7);

        for(int i=0; i<expected.size(); i++){
            Assert.assertEquals(expected.get(i), res.get(i));
        }
    }
}
