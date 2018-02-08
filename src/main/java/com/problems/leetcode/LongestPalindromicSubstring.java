package com.problems.leetcode;

import javafx.util.Pair;

/**
 * Created by Maks on 2/8/2018.
 * https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return  s;
        int lo, hi;
        lo=0; hi=0;
        for(int i=0; i<s.length()-1; i++){
            Pair<Integer, Integer> f1=extend(s,i,i);
            if(hi-lo< f1.getValue()-f1.getKey()){
                lo=f1.getKey();
                hi=f1.getValue();
            }
            f1=extend(s,i,i+1);
            if(hi-lo< f1.getValue()-f1.getKey()){
                lo=f1.getKey();
                hi=f1.getValue();
            }
        }
        return  s.substring(lo, hi+1);


    }
    private Pair<Integer,Integer> extend(String s, int i, int j){
        int lo, hi;
        lo=0; hi=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            lo=i; hi=j;
            i--; j++;
        }
        return new Pair<Integer, Integer>(lo,hi);
    }

}
