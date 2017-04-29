package com.problems.test;

import com.problems.DistinctCombinationsGivenLengthAllowed;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 4/29/2017.
 */
public class DistinctCombinationsGivenLengthAllowedTest {
    @Test
    public  void solution1TestCase1(){
        DistinctCombinationsGivenLengthAllowed s=new DistinctCombinationsGivenLengthAllowed();
        Integer[] input=new Integer[]{1, 2, 3, 4};
        List<List<Integer>> res= s.solutionForLen2(input);
        List<Integer[]> expected =new ArrayList<Integer[]>();
        expected.add(new Integer[]{1, 1});
        expected.add(new Integer[]{1, 2});
        expected.add(new Integer[]{1, 3});
        expected.add(new Integer[]{1, 4});
        expected.add(new Integer[]{2, 2});
        expected.add(new Integer[]{2, 3});
        expected.add(new Integer[]{2, 4});
        expected.add(new Integer[]{3, 3});
        expected.add(new Integer[]{3, 4});
        expected.add(new Integer[]{4, 4});

        for(int i=0;i< expected.size(); i++){
            for(int j=0; j<expected.get(i).length; j++){
                Assert.assertEquals(expected.get(i)[j], res.get(i).get(j));
            }
        }
    }
}
