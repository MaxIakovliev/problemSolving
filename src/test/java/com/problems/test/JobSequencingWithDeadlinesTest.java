package com.problems.test;

import com.problems.JobSequencingWithDeadlines;
import com.problems.TaskWithDeadline;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/6/2017.
 */
public class JobSequencingWithDeadlinesTest implements ISingleTestCase {
    @Test
    public void solution1TestCase1() {
        JobSequencingWithDeadlines s=new JobSequencingWithDeadlines();
        TaskWithDeadline input[] ={
                new TaskWithDeadline(1,9,15),
                new TaskWithDeadline(2,2,2),
                new TaskWithDeadline(3,5,18),
                new TaskWithDeadline(4,7,1),
                new TaskWithDeadline(5,4,25),
                new TaskWithDeadline(6,2,20),
                new TaskWithDeadline(7,5,8),
                new TaskWithDeadline(8,7,10),
                new TaskWithDeadline(9,4,12),
                new TaskWithDeadline(10,3,5),
        };
        int expected=109;
        int res=s.solution1(input);
        Assert.assertEquals(expected, res);
    }
}
