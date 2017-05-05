package com.problems.test;

import com.problems.MergingOverlappingIntervals;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 5/5/2017.
 */
public class MergingOverlappingIntervalsTest implements ISingleTestCase {

    @Test
    public void solution1TestCase1() {
        MergingOverlappingIntervals s=new MergingOverlappingIntervals();
        MergingOverlappingIntervals.Interval input[]={
                new MergingOverlappingIntervals.Interval(1, 5),
                new MergingOverlappingIntervals.Interval(2, 3),
                new MergingOverlappingIntervals.Interval(4, 6),
                new MergingOverlappingIntervals.Interval(7, 8),
                new MergingOverlappingIntervals.Interval(8, 10),
                new MergingOverlappingIntervals.Interval(12, 15)
        };

        List<MergingOverlappingIntervals.Interval> res =s.solution1(input);

        MergingOverlappingIntervals.Interval expected[]= {
                new MergingOverlappingIntervals.Interval(1, 6),
                new MergingOverlappingIntervals.Interval(7, 10),
                new MergingOverlappingIntervals.Interval(12, 15)
        };

        for(int i=0; i<expected.length;i++){
            Assert.assertEquals(expected[i].begin,res.get(i).begin);
            Assert.assertEquals(expected[i].end,res.get(i).end);
        }
    }
}
