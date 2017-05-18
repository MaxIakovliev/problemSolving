package com.problems.techiedelight.test;

import com.problems.techiedelight.OccurrencesInSortedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/18/2017.
 */
public class OccurrencesInSortedArrayTest {

    @Test
    public  void solution1TestCase1(){
        OccurrencesInSortedArray s=new OccurrencesInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int res=s.count(input,5);
        Assert.assertEquals(3,res);
    }

    @Test
    public  void solution1TestCase2(){
        OccurrencesInSortedArray s=new OccurrencesInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int res=s.count(input,6);
        Assert.assertEquals(2,res);
    }

    @Test
    public  void solution1TestCase3(){
        OccurrencesInSortedArray s=new OccurrencesInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int res=s.count(input,9);
        Assert.assertEquals(3,res);
    }

    @Test
    public  void solution1TestCase4(){
        OccurrencesInSortedArray s=new OccurrencesInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int res=s.count(input,2);
        Assert.assertEquals(1,res);
    }

    @Test
    public  void solution1TestCase5(){
        OccurrencesInSortedArray s=new OccurrencesInSortedArray();
        Integer[] input={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int res=s.count(input,7);
        Assert.assertEquals(0,res);
    }
}
