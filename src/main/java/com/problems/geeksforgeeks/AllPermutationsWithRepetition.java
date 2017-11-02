package com.problems.geeksforgeeks;

import java.util.Arrays;

/**
 * Created by Maks on 8/7/2017.
 */
public class AllPermutationsWithRepetition {

    public void rec(String s, char[] data, int idx) {
        for (int i = 0; i < s.length(); i++) {
            data[idx] = s.charAt(i);
            if (idx == s.length() - 1) {
                System.out.println(data);
            } else {
                rec(s, data, idx + 1);
            }
        }
    }

    public static void main(String[] args) {
        AllPermutationsWithRepetition a = new AllPermutationsWithRepetition();
        String test = "abaa";
        char[] data = new char[test.length()];
        char[] charArray = test.toCharArray();
        Arrays.sort(charArray);
        test = new String(charArray);
        a.rec(test, data, 0);
    }

    private void rec2(String s, char[]data, int idx){
        for(int i=0; i<s.length(); i++){
            data[i]=s.charAt(idx);
            if(idx==s.length()-1)
                System.out.println(data);
            else
                rec2(s,data,idx+1);
        }
    }
}
