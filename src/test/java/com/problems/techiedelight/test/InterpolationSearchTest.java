package com.problems.techiedelight.test;

import com.problems.techiedelight.InterpolationSearch;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 5/16/2017.
 */
public class InterpolationSearchTest implements com.problems.test.ISingleTestCase {
    @Test
    public void solution1TestCase1() {
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,0);
        Integer exp=0;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase2(){
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,3);
        Integer exp=3;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase3(){
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,4);
        Integer exp=4;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase4(){
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,9);
        Integer exp=9;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void solution1TestCase5(){
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,10);
        Integer exp=-1;
        Assert.assertEquals(exp, res);
    }
    @Test
    public void solution1TestCase6(){
        InterpolationSearch s=new InterpolationSearch();
        Integer input[] =new Integer[10];
        for(int i=0; i<10; i++){
            input[i]=i;
        }
        Integer res=s.search(input,-10);
        Integer exp=-1;
        Assert.assertEquals(exp, res);
    }
}
