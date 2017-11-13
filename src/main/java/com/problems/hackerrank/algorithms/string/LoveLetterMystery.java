package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/12/2017.
 */
public class LoveLetterMystery {

    public int solve(String str) {
        int res = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            res += (Math.abs(str.charAt(i) - str.charAt(str.length() - 1 - i)));
        }
        return res;
    }

    public static void main(String[] args) {
        LoveLetterMystery llm=new LoveLetterMystery();
        System.out.println(llm.solve("abc"));
        System.out.println(llm.solve("abcba"));
        System.out.println(llm.solve("abcd"));
        System.out.println(llm.solve("cba"));
    }
}
