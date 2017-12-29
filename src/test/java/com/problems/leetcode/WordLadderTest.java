package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Maks on 12/29/2017.
 */
public class WordLadderTest {

    @Test
    public  void test1(){
        WordLadder wl=new WordLadder();
        String start="hit";
        String end="cog";
        String[] arr=new String[]{"hot","dot","dog","lot","log","cog"};
        int actual = wl.ladderLength(start,end, Arrays.asList(arr));
        Assert.assertEquals(5,actual);
    }
}
