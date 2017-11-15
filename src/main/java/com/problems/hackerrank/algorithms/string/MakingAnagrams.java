package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maks on 11/15/2017.
 */
public class MakingAnagrams {
    public int solve(String s1, String s2) {
        int res = 0;
        HashMap<Character, Integer> c1 = new HashMap<>();
        HashMap<Character, Integer> c2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            c1.put(s1.charAt(i), c1.containsKey(s1.charAt(i)) ? c1.get(s1.charAt(i)) + 1 : 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            c2.put(s2.charAt(i), c2.containsKey(s2.charAt(i)) ? c2.get(s2.charAt(i)) + 1 : 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            if (c1.containsKey(s1.charAt(i)) && c2.containsKey(s1.charAt(i))) {
                if (c1.get(s1.charAt(i)) == 1) {
                    c1.remove(s1.charAt(i));
                } else {
                    c1.put(s1.charAt(i), c1.get(s1.charAt(i)) - 1);
                }

                if (c2.get(s1.charAt(i)) == 1) {
                    c2.remove(s1.charAt(i));
                } else {
                    c2.put(s1.charAt(i), c2.get(s1.charAt(i)) - 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> en : c1.entrySet()) {
            res+=en.getValue();
        }
        for(Map.Entry<Character, Integer> en : c2.entrySet()) {
            res+=en.getValue();
        }

        return res;
    }


    public static void main(String[] args) {
        MakingAnagrams ma =new MakingAnagrams();
        System.out.println(ma.solve("ecc","erccs"));
    }



    }
