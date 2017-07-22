package com.problems.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maks on 7/22/2017.
 */
public class WordLadderIITest {

    @Test
    public void Solution1TestCase1(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "hit";
        String endWord = "cog";
        List<String>wordList =  Arrays.asList("hot","dot","dog","lot","log","cog");
        //List<String>wordList =  Arrays.asList("hot","dot","dog","mog","mot","lot","log","cog");

        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }

    }

    @Test
    public void Solution1TestCase2(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "a";
        String endWord = "b";
        List<String>wordList =  Arrays.asList("a","c","b");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    @Test
    public void Solution1TestCase3(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "hot";
        String endWord = "dog";
        List<String>wordList =  Arrays.asList("hot","dog","dot");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    @Test
    public void Solution1TestCase4(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "hot";
        String endWord = "dog";
        List<String>wordList =  Arrays.asList("hot","cog","dog","tot","hog","hop","pot","dot");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    @Test
    public void Solution1TestCase5(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "red";
        String endWord = "tax";
        List<String>wordList =  Arrays.asList("ted","tex","red","tax","tad","den","rex","pee");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    @Test
    public void Solution1TestCase6(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "lost";
        String endWord = "cost";
        List<String>wordList =  Arrays.asList("most","fist","lost","cost","fish");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }


    @Test
    public void Solution1TestCase7(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "leet";
        String endWord = "code";
        List<String>wordList =  Arrays.asList("lest","leet","lose","code","lode","robe","lost");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }


    @Test
    public void Solution1TestCase8(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "game";
        String endWord = "thee";
        List<String>wordList =  Arrays.asList("frye","heat","tree","thee","game","free","hell","fame","faye");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }

    @Test
    public void Solution1TestCase9(){
        WordLadderII wl=new WordLadderII();
        String beginWord = "kiss";
        String endWord = "tusk";
        List<String>wordList =  Arrays.asList("miss","dusk","kiss","musk","tusk","diss","disk","sang","ties","muss");


        List<List<String>> res= wl.findLadders(beginWord,endWord,wordList);
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+", ");
            }
            System.out.println();
        }
    }
}
