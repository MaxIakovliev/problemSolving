package com.problems.leetcode.DynamicProgramming;

import java.util.Arrays;

public class DecodeWays {
    /*
    https://leetcode.com/problems/decode-ways/description/
     */
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length() + 1];
        Arrays.fill(memo,0);
        memo[0] = 1;
        memo[1] = s.charAt(0) == '0' && Integer.parseInt(s.charAt(0)+"")<=9 ? 0 : 1;
        for (int i=2; i<s.length()+1; i++){
            Integer tmp=Integer.parseInt(s.substring(i-1,i));
            if ( tmp>0 && tmp<=9){
                memo[i]+=memo[i-1];
            }
            Integer tmp2=Integer.parseInt(s.substring(i-2,i-1));
            Integer tmp3=Integer.parseInt(s.substring(i-2,i));
            if (tmp2>0 && tmp3<=26){
                memo[i]+=memo[i-2];
            }
        }
        return memo[memo.length-1];
    }
    public static void main(String[] args) {
        DecodeWays s=new DecodeWays();
        System.out.println(s.numDecodings("10"));
    }
}
