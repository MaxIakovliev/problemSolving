package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 1/9/2018.
 */
public class ValidParenthesisStringTest {

    @Test
    public  void test1(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertTrue(v.checkValidString("()"));
    }

    @Test
    public  void test2(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertTrue(v.checkValidString("(*)"));
    }

    @Test
    public  void test3(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertTrue(v.checkValidString("(*"));
    }

    @Test
    public  void test4(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertTrue(v.checkValidString("*)"));
    }

    @Test
    public  void test5(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertTrue(v.checkValidString("()()()()**"));
    }

    @Test
    public  void test6(){
        ValidParenthesisString v=new ValidParenthesisString();
        Assert.assertFalse(v.checkValidString(")("));
    }
}
