package com.problems.techiedelight.test;

import com.problems.techiedelight.FindFirstOccurrenceInSortedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/18/2017.
 */
public class FindFirstOccurrenceInSortedArrayTest {

    @Test
    public void solution1TestCase1(){
        FindFirstOccurrenceInSortedArray s=new FindFirstOccurrenceInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int exp=1;
        int res=s.findFirstOccurrence(input, 5);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase2(){
        FindFirstOccurrenceInSortedArray s=new FindFirstOccurrenceInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int exp=-1;
        int res=s.findFirstOccurrence(input, 4);
        Assert.assertEquals(exp, res);
    }
}
