package com.problems.hackerrank.algorithms.string.test;

import com.problems.hackerrank.algorithms.string.TwoCharacters;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 11/6/2017.
 */
public class TwoCharactersTest {

    @Test
    public  void TestCase1(){
        TwoCharacters tc=new TwoCharacters();
        int res=tc.longestAltString("beabeefeab");
        Assert.assertEquals(5,res);
    }
    @Test
    public  void TestCase2(){
        TwoCharacters tc=new TwoCharacters();
        int res=tc.longestAltString("beabexefeab");
        Assert.assertEquals(5,res);
    }

    @Test
    public  void TestCase3(){
        TwoCharacters tc=new TwoCharacters();
        int res=tc.longestAltString("uyetuppelecblwipdsqabzsvyfaezeqhpnalahnpkdbhzjglcuqfjnzpmbwprelbayyzovkhacgrglrdpmvaexkgertilnfooeazvulykxypsxicofnbyivkthovpjzhpohdhuebazlukfhaavfsssuupbyjqdxwwqlicbjirirspqhxomjdzswtsogugmbnslcalcfaxqmionsxdgpkotffycphsewyqvhqcwlufekxwoiudxjixchfqlavjwhaennkmfsdhigyeifnoskjbzgzggsmshdhzagpznkbahixqgrdnmlzogprctjggsujmqzqknvcuvdinesbwpirfasnvfjqceyrkknyvdritcfyowsgfrevzon");
        Assert.assertEquals(0,res);
    }


    @Test
    public  void ValidStringTestCase1(){
        TwoCharacters tc=new TwoCharacters();
        boolean res=tc.validString("xyxyx");
        Assert.assertEquals(true,res);
    }

    @Test
    public  void ValidStringTestCase2(){
        TwoCharacters tc=new TwoCharacters();
        boolean res=tc.validString("xyaxyx");
        Assert.assertEquals(false,res);
    }

    @Test
    public  void ValidStringTestCase3(){
        TwoCharacters tc=new TwoCharacters();
        boolean res=tc.validString("xyxyyx");
        Assert.assertEquals(false,res);
    }
}
