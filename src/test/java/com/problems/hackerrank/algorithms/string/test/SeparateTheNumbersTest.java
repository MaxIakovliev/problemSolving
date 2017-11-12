package com.problems.hackerrank.algorithms.string.test;

import com.problems.hackerrank.algorithms.string.SeparateTheNumbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 11/11/2017.
 */
public class SeparateTheNumbersTest {

    @Test
    public  void validNumberTestCase1(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        boolean res=stn.validNumber(1,"123456789");
        Assert.assertEquals(true, res);
    }

    @Test
    public  void validNumberTestCase2(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        boolean res=stn.validNumber(1,"12345678910");
        Assert.assertEquals(true, res);
    }

    @Test
    public  void validNumberTestCase3(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        boolean res=stn.validNumber(1,"123456789109");
        Assert.assertEquals(false, res);
    }

    @Test
    public  void validNumberTestCase4(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        boolean res=stn.validNumber(99,"99100");
        Assert.assertEquals(true, res);
    }

    @Test
    public  void solveTestCase1(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("12345");
        Assert.assertEquals("YES 1", res);
    }

    @Test
    public  void solveTestCase2(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("2324");
        Assert.assertEquals("YES 23", res);
    }

    @Test
    public  void solveTestCase3(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("910");
        Assert.assertEquals("YES 9", res);
    }
    @Test
    public  void solveTestCase4(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("911");
        Assert.assertEquals("NO", res);
    }

    //------------
    @Test
    public  void t1(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("00000000000000000000000000000000");
        Assert.assertEquals("NO", res);
    }
    @Test
    public  void t2(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("11111111111111111111111111111111");
        Assert.assertEquals("NO", res);
    }
    @Test
    public  void t3(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("10001001100210031004100510061007");
        Assert.assertEquals("YES 1000", res);
    }

    @Test
    public  void t4(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("90071992547409929007199254740993");
        Assert.assertEquals("YES 9007199254740992", res);
    }

    @Test
    public  void t5(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("45035996273704964503599627370497");
        Assert.assertEquals("YES 4503599627370496", res);
    }

    @Test
    public  void t6(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("429496729542949672964294967297");
        Assert.assertEquals("YES 4294967295", res);
    }

    @Test
    public  void t7(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("429496729542949672964294967296");
        Assert.assertEquals("NO", res);
    }

    @Test
    public  void t8(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("429496729542949672964294967287");
        Assert.assertEquals("NO", res);
    }

    @Test
    public  void t9(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("429496729542949672964294967197");
        Assert.assertEquals("NO", res);
    }
    @Test
    public  void t10(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("429496729500000000000000000001");
        Assert.assertEquals("NO", res);
    }
    @Test
    public  void t11(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("42949672950123456789");
        Assert.assertEquals("NO", res);
    }

    @Test
    public  void t12(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("4294967295000010020030000456789");
        Assert.assertEquals("NO", res);
    }

    @Test
    public  void t13(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("4294967295000102003004005");
        Assert.assertEquals("NO", res);
    }
    @Test
    public  void t14(){
        SeparateTheNumbers stn=new SeparateTheNumbers();
        String res=stn.solve("42949672954294967296429496729");
        Assert.assertEquals("NO", res);
    }
}
