package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 2/7/2018.
 */
public class LongestSubstringTest {

    @Test
    public  void test1(){
        LongestSubstring ls=new LongestSubstring();
        Assert.assertEquals(3,ls.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public  void test2(){
        LongestSubstring ls=new LongestSubstring();
        Assert.assertEquals(1,ls.lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    public  void test3(){
        LongestSubstring ls=new LongestSubstring();
        Assert.assertEquals(3,ls.lengthOfLongestSubstring("pwwkew"));
    }
}
