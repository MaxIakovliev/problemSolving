package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 12/24/2017.
 */
public class ReverseWordsInStringTest {


    @Test
    public  void test0(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("", rw.reverse(""));
    }

    @Test
    public  void test1(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world q hello", rw.reverse("hello q world"));
    }
    @Test
    public  void test1_1(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world hello", rw.reverse("hello world"));
    }

    @Test
    public  void test1_2(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world q hello", rw.reverse("hello q world "));
    }

    @Test
    public  void test1_3(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world q hello", rw.reverse("   hello q world "));
    }

    @Test
    public  void test2(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world hello", rw.reverse("hello     world"));
    }

    @Test
    public  void test3(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world hello", rw.reverse("hello     world "));
    }

    @Test
    public  void test4(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world hello", rw.reverse(" hello     world"));
    }

    @Test
    public  void test5(){
        ReverseWordsInString rw=new ReverseWordsInString();
        Assert.assertEquals("world as hello", rw.reverse(" hello   as  world  "));
    }

}
