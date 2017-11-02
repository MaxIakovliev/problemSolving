package com.problems.hackerrank.algorithms.Implementations.test;

import com.problems.hackerrank.algorithms.Implementations.GradingStudents;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 11/2/2017.
 */
public class GradingStudentsTest {

    @Test
    public  void TestCase1(){
        GradingStudents gs=new GradingStudents();
        int[] input=new int []{73, 67, 38, 33};
        int[] expected=new int []{75, 67, 40, 33};

        int[] res=gs.solve(input);
        for(int i=0; i<input.length; i++){
            Assert.assertEquals(expected[i],res[i]);
        }

    }

}
