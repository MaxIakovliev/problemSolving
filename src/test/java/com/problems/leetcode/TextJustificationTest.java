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

    @Test
    public  void testCase2(){
        TextJustification tj=new TextJustification();
        String arr[]={""};
        int lineSize=2;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("  ");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }

    @Test
    public  void testCase3(){
        TextJustification tj=new TextJustification();
        String arr[]={"a"};
        int lineSize=1;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("a");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }

    @Test
    public  void testCase4(){
        TextJustification tj=new TextJustification();
        String arr[]={"a","b","c","d","e"};
        int lineSize=3;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("a b");
        exp.add("c d");
        exp.add("e  ");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }

    @Test
    public  void testCase5(){
        TextJustification tj=new TextJustification();
        String arr[]={"What","must","be","shall","be."};
        int lineSize=12;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("What must be");
        exp.add("shall be.   ");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }


    @Test
    public  void testCase6(){
        TextJustification tj=new TextJustification();
        String arr[]={"Don't","go","around","saying","the","world","owes","you","a","living;","the","world","owes","you","nothing;","it","was","here","first."};
        int lineSize=30;
        List<String> res=tj.fullJustify(arr,lineSize);
        List<String> exp= new ArrayList<>();
        exp.add("Don't  go  around  saying  the");
        exp.add("world  owes  you a living; the");
        exp.add("world owes you nothing; it was");
        exp.add("here first.                   ");
        for (int i = 0; i < exp.size(); i++) {
            Assert.assertEquals(exp.get(i), res.get(i));
        }
        Assert.assertEquals(exp.size(), res.size());
    }
}
