package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/12/2017.
 */
public class AlternatingCharacters {

    public int solve(String str) {
        int count = 0;
        int i = 1;
        char prev = str.charAt(0);
        while (i < str.length()) {
            if (str.charAt(i) == prev) {
                count++;
            }
            prev = str.charAt(i);

            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        AlternatingCharacters ac=new AlternatingCharacters();
        System.out.println(ac.solve("AAAA"));
        System.out.println(ac.solve("BBBBB"));
        System.out.println(ac.solve("ABABABAB"));
        System.out.println(ac.solve("BABABA"));
        System.out.println(ac.solve("AAABBB"));
    }
}
