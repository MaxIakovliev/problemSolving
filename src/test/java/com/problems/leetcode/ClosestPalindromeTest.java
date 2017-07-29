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

    @Test
    public  void Solution1TestCase7(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("36364");
        String exp="36363";
        Assert.assertEquals(exp,res);
    }


    @Test
    public  void Solution1TestCase8(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("101");
        String exp="99";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase10(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("10001");
        String exp="9999";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1TestCase9(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("99");
        String exp="101";
        Assert.assertEquals(exp,res);
    }


    @Test
    public  void Solution1IsChotTestCase0(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("10");
        String exp="9";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase1(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("1552");
        String exp="1551";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase2(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("1660");
        String exp="1661";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase3(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("88");
        String exp="77";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase4(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("8778");
        String exp="8668";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase5(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("1000");
        String exp="999";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase6(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("1283");
        String exp="1331";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase7(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("100000000");
        String exp="99999999";
        Assert.assertEquals(exp,res);
    }

    @Test
    public  void Solution1IsChotTestCase8(){
        ClosestPalindrome cp=new ClosestPalindrome();
        String res= cp.findClosestPalindrome("999");
        String exp="1001";
        Assert.assertEquals(exp,res);
    }


}
