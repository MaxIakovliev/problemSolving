package com.problems.test;

import com.problems.ActivitySelectionProblem;
import com.problems.Interval;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 5/6/2017.
 */
public class ActivitySelectionProblemTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        ActivitySelectionProblem s =new ActivitySelectionProblem();
        Interval input[]={
                new Interval(1,4),
                new Interval(3,5),
                new Interval(0,6),
                new Interval(5,7),
                new Interval(3,8),
                new Interval(5,9),
                new Interval(6,10),
                new Interval(8,11),
                new Interval(2,13),
                new Interval(12,14)
        };

        Interval expected[]={
                new Interval(1,4),
                new Interval(5,7),
                new Interval(8,11),
                new Interval(12,14)
        };
        List<Interval> res= s.solution1(input);

        for(int i=0; i<expected.length; i++){
            Assert.assertEquals(expected[i].start, res.get(i).start);
            Assert.assertEquals(expected[i].end, res.get(i).end);
        }


    }
}
