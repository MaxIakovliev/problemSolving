package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 8/6/2017.
 */
public class TextJustificationTest {

    @Test
    public  void testCase1(){
        TextJustification tj=new TextJustification();
        String arr[]={"This", "is", "an", "example", "of", "text", "justification."};
        int lineSize=16;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("This    is    an");
        exp.add("example  of text");
        exp.add("justification.  ");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }
}
