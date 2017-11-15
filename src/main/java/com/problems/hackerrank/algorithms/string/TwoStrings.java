package com.problems.hackerrank.algorithms.string;

import java.util.HashSet;

/**
 * Created by Maks on 11/15/2017.
 */
public class TwoStrings {
    public String solve(String s1, String s2) {
        HashSet<Character> c2 = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            if (!c2.contains(s2.charAt(i))) {
                c2.add(s2.charAt(i));
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (c2.contains(s1.charAt(i)))
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        TwoStrings ts=new TwoStrings();
        System.out.println(ts.solve("hello","world"));
        System.out.println(ts.solve("abc","def"));
    }
}
