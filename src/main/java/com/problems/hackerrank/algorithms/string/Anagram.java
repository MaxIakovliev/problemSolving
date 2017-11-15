package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;

/**
 * Created by Maks on 11/15/2017.
 */
public class Anagram {
    public int solve(String s) {
        if (s.length() % 2 > 0) return -1;
        int res = 0;
        HashMap<Character, Integer> c2 = new HashMap<>();
        for (int i = s.length() / 2; i < s.length(); i++) {
            c2.put(s.charAt(i), c2.containsKey(s.charAt(i)) ? c2.get(s.charAt(i)) + 1 : 1);
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (!c2.containsKey(s.charAt(i))) {
                res++;
            } else {
                if (c2.get(s.charAt(i)) == 1) {
                    c2.remove(s.charAt(i));
                } else {
                    c2.put(s.charAt(i), c2.get(s.charAt(i)) - 1);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.solve("hhpddlnnsjfoyxpciioigvjqzfbpllssuj"));
        System.out.println(a.solve("xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj"));
        System.out.println(a.solve("dnqaurlplofnrtmh"));
        System.out.println(a.solve("aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb"));
        System.out.println(a.solve("lbafwuoawkxydlfcbjjtxpzpchzrvbtievqbpedlqbktorypcjkzzkodrpvosqzxmpad"));
        System.out.println(a.solve("drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe"));
        System.out.println(a.solve("ubulzt"));
        System.out.println(a.solve("vxxzsqjqsnibgydzlyynqcrayvwjurfsqfrivayopgrxewwruvemzy"));
        System.out.println(a.solve("xtnipeqhxvafqaggqoanvwkmthtfirwhmjrbphlmeluvoa"));
        System.out.println(a.solve("gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv"));
    }
}
