package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 2/8/2018.
 */
public class LongestPalindromicSubstringTest {

    @Test
    public  void test1(){
        LongestPalindromicSubstring lp=new LongestPalindromicSubstring();
        Assert.assertEquals("bab", lp.longestPalindrome("babad"));

    }

    @Test
    public  void test2(){
        LongestPalindromicSubstring lp=new LongestPalindromicSubstring();
        Assert.assertEquals("bb", lp.longestPalindrome("cbbd"));

    }
}
