package com.problems.test;

import com.problems.LetterCombinationsOnPhoneDigits;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Maks on 5/28/2017.
 */
public class LetterCombinationsOnPhoneDigitsTest {

    @Test
    public void getCombinationsTestCase1(){
        LetterCombinationsOnPhoneDigits cc=new LetterCombinationsOnPhoneDigits();
        List<String> res=cc.getCombinations("232");
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }

        String[] exp={"ada", "adb", "adc", "aea", "aeb", "aec", "afa", "afb", "afc", "bda", "bdb", "bdc", "bea", "beb", "bec", "bfa", "bfb", "bfc", "cda", "cdb", "cdc", "cea", "ceb", "cec", "cfa", "cfb", "cfc"};
        for(int i=0; i<exp.length; i++){
            Assert.assertEquals(exp[i],res.get(i));
        }



    }
}
