package com.problems.hackerrank.algorithms.string.test;

import com.problems.hackerrank.algorithms.string.FunnyString;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 11/12/2017.
 */
public class FunnyStringTest {

    @Test
    public void t1(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq"));
    }

    @Test
    public void t2(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("holtm"));
    }

    @Test
    public void t3(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("uvzxrumuztyqyvpnji"));
    }

    @Test
    public void t4(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("tmruzxzuwoskqysxztuvosuyrswrnmtxvzsrqwytzrxpltrwusxupw"));
    }

    @Test
    public void t5(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("wxstwxuzuyuvyzrsxysxyuvyqxuxyskqwsyqumqrvopvowqumnvrxpwqpwsrnvrztxrxpvuxunvyzvupvupowvyzvzuzwvsrwv"));
    }

    @Test
    public void t6(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("yrzxrxskrtlpwpmtpxvowrxrpxq"));
    }

    @Test
    public void t7(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("pryumtuntmovpwvowslj"));
    }

    @Test
    public void t8(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("nosklrxrtyuxtmnurzsryuxtywqwqpxts"));
    }

    @Test
    public void t9(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("fmpszyvqwxrtvpuwqszvyvotmsxsxuvzyvpwzrpmuxqwtswvytytzsnuxuyrpvtysqoutzurqxury"));
    }

    @Test
    public void t10(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("jkmsxzwrxzy"));
    }

    //--test 3---------------------

    @Test
    public void t3t1(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("jkotzxzxrxtzytlruwrxytyzsuzytwyzxuzytryzuzysxvsmupouysywywqlhg"));
    }

    @Test
    public void t3t2(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("eklrywzvpxtvoptlrskmskszvwzsuzxrtvyzwruqvyxusqwupnurqmtltnltsmuyxqoksyurpwqpv"));
    }

    @Test
    public void t3t3(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("efhpuvqvnuwpvwysvnunostvpqvxtxsvqwqvsxtxvqpvtsonunvsywvpwunvqvupxzy"));
    }

    @Test
    public void t3t4(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("otytmpszumnryqvxpvnvxyvpvprumnvsqwqwtsqyqksqvnuqpxszwzsxsx"));
    }

    @Test
    public void t3t5(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("bhmptlqswsvoqsvzyzwoqtvowpyqxpwurpxutswtrpwzvrpkswzuo"));
    }

    @Test
    public void t3t6(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("rvovprxzvwrxpwpzsltzutxztrxqxt"));
    }

    @Test
    public void t3t7(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("ceiosyrtztvnqsuozrxvtqywqwyrxtnjh"));
    }

    @Test
    public void t3t8(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Not Funny", fs.solve("djnsyzxszryqworuxpqvqwquvotzsqvoupwvztzupowtqnvpxqyrwutzuys"));
    }

    @Test
    public void t3t9(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("kovzuywsuvwxuxtwzryzuxyvouvyskoqtwryszxqqxzsyrwtqoksyvuovyxuzyrzwtxuxwvuswuqvryu"));
    }

    @Test
    public void t3t10(){
        FunnyString fs=new FunnyString();
        Assert.assertEquals("Funny", fs.solve("ptvzstvotxqyvzrwyqryzrpkswzryupwutmigc"));
    }
}
