package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Maks on 11/12/2017.
 */
public class GemStones {
    public int solve(String[] strs) {
        int res = 0;
        HashMap<Character, Integer> tempData = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            HashSet<Character> curData = new HashSet<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (!curData.contains(strs[i].charAt(j))) {
                    curData.add(strs[i].charAt(j));
                    tempData.put(strs[i].charAt(j), tempData.containsKey(strs[i].charAt(j)) ? tempData.get(strs[i].charAt(j)) + 1 : 1);
                }
            }
        }
        for (Character key : tempData.keySet()) {
            if (tempData.get(key) == strs.length)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        GemStones gs=new GemStones();
        String[] strs=new String[]{"abcdde","baccd","eeabg"};
        System.out.println(gs.solve(strs));
    }

}
