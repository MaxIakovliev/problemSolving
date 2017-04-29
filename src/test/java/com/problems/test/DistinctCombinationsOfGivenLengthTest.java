package com.problems.test;

import com.problems.DistinctCombinationsOfGivenLength;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Maks on 4/25/2017.
 */
public class DistinctCombinationsOfGivenLengthTest {

    @Test
    public  void solution1TestCase1(){
        DistinctCombinationsOfGivenLength s=new DistinctCombinationsOfGivenLength();
        Integer[] input=new Integer[]{1, 2, 3};
        List<List<Integer>> res= s.solutionForLen2(input);
        List<Integer[]> expected =new ArrayList<Integer[]>();
        expected.add(new Integer[]{1, 2});
        expected.add(new Integer[]{1, 3});
        expected.add(new Integer[]{2, 3});

        for(int i=0;i< expected.size(); i++){
            for(int j=0; j<expected.get(i).length; j++){
                Assert.assertEquals(expected.get(i)[j], res.get(i).get(j));
            }
        }
    }
}
