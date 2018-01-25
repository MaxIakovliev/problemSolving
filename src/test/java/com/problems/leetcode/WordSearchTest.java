package com.problems.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maks on 1/22/2018.
 */
public class WordSearchTest {

    @Test
    public  void test1(){
        WordSearch ws=new WordSearch();
        char[][] input=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        Assert.assertTrue(ws.exist(input,"ABCCED"));
    }

    @Test
    public  void test2(){
        WordSearch ws=new WordSearch();
        char[][] input=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        Assert.assertTrue(ws.exist(input,"SEE"));
    }

    @Test
    public  void test3(){
        WordSearch ws=new WordSearch();
        char[][] input=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        Assert.assertTrue(ws.exist(input,"SCFSA"));
    }

    @Test
    public  void test4(){
        WordSearch ws=new WordSearch();
        char[][] input=new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        Assert.assertEquals(false,ws.exist(input,"EEDE"));
    }

    @Test
    public  void test5(){
        WordSearch ws=new WordSearch();
        char[][] input=new char[][]{
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        Assert.assertEquals(true,ws.exist(input,"AAB"));
    }
}
