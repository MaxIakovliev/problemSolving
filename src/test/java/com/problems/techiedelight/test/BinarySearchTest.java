package com.problems.techiedelight.test;

import com.problems.techiedelight.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/15/2017.
 */
public class BinarySearchTest {

    @Test
    public void solution1TestCase1(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,0);
        Integer exp=0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase2(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,3);
        Integer exp=3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase3(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,4);
        Integer exp=4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase4(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,9);
        Integer exp=9;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase5(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,10);
        Integer exp=-1;
        Assert.assertEquals(exp, res);
    }
    @Test
    public void solution1TestCase6(){
        BinarySearch bs=new BinarySearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=bs.findElement(input,-10);
        Integer exp=-1;
        Assert.assertEquals(exp, res);
    }
}
