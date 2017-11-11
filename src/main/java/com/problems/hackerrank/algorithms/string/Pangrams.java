package com.problems.hackerrank.algorithms.string;

import java.util.HashSet;

/**
 * Created by Maks on 11/11/2017.
 */
public class Pangrams {

    public void solve(String str) {
        final int size = 26;
        HashSet<Character> hash = new HashSet<>();
        int loStart = (int) 'a';
        int loEnd = (int) 'z';

        int upStart = (int) 'A';
        int upEnd = (int) 'Z';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isAlphabetic(c))
                continue;
            if ((((int) c) >= loStart && ((int) c) < loEnd) || (((int) c) >= upStart && ((int) c) < upEnd)) {
                if (!hash.contains(Character.toLowerCase(c)))
                    hash.add(Character.toLowerCase(c));

            }
        }
        if(hash.size()==size-1){
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }
    public static void main(String[] args) {
        Pangrams p=new Pangrams();
        p.solve("We promptly judged antique ivory buckles for the next prize");

    }
}
