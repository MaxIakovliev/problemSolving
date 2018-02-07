package com.problems.leetcode;

import java.util.HashSet;

/**
 * Created by Maks on 2/7/2018.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> u = new HashSet<>();
        int last = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            while (u.contains(s.charAt(i))) {
                u.remove(s.charAt(last++));
            }
            u.add(s.charAt(i));
            maxLen = Math.max(maxLen, u.size());
        }
        return  maxLen;
    }
}
