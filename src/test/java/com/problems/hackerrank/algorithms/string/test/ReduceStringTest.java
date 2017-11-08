package com.problems.hackerrank.algorithms.string.test;

import com.problems.hackerrank.algorithms.string.ReduceString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 11/6/2017.
 */
public class ReduceStringTest {

    @Test
    public void solutionTestCase1(){
        ReduceString rs=new ReduceString();
        String input="aaabccddd";
        String exp="abd";
        String actual=rs.reduce(input);

        Assert.assertEquals(exp,actual);
    }

    @Test
    public void solutionTestCase2(){
        ReduceString rs=new ReduceString();
        String input="ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx";
        String exp="Empty String";
        String actual=rs.reduce(input);

        Assert.assertEquals(exp,actual);
    }

    @Test
    public void solutionTestCase3(){
        ReduceString rs=new ReduceString();
        String input="vv";
        String exp="Empty String";
        String actual=rs.reduce(input);

        Assert.assertEquals(exp,actual);
    }

    @Test
    public void solutionTestCase4(){
        ReduceString rs=new ReduceString();
        String input="baab";
        String exp="Empty String";
        String actual=rs.reduce(input);

        Assert.assertEquals(exp,actual);
    }

    @Test
    public void solutionTestCase5(){
        ReduceString rs=new ReduceString();
        String input="lrfkqyuqfjjfquyqkfrlkxyqvnrtyssytrnvqyxkfrzrmzlygffgylzmrzrfveulqfpdbhhbdpfqluevlqdqrrcrwddwrcrrqdql";
        String exp="Empty String";
        String actual=rs.reduce(input);

        Assert.assertEquals(exp,actual);
    }
}
