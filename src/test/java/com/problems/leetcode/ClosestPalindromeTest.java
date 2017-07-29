package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 7/29/2017.
 */
public class ClosestPalindromeTest {

    @Test
    public  void Solution1TestCase1(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("123");
        String exp="121";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase2(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("160");
        String exp="161";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase3(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("152");
        String exp="151";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase4(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("809");
        String exp="808";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase5(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("807");
        String exp="808";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase6(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("828");
        String exp="818";
        Assert.assertEquals(exp,res);
    }
}
