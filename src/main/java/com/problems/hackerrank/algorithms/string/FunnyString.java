package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/12/2017.
 */
public class FunnyString {

    public String solve(String str) {
        int count=str.length()/2;
        if(str.length()%2>0)
            count++;
        for (int i = 1; i < count; i++) {
            int diff1 = Math.abs(str.charAt(i - 1) - str.charAt(i));
            int diff2 = Math.abs(str.charAt(str.length()-i-1) - str.charAt(str.length()-i));
            if (diff1 != diff2) {
                return "Not Funny";
            }
        }
        return "Funny";
    }


    public static void main(String[] args) {
        FunnyString fs=new FunnyString();
        System.out.println( fs.solve("acxz"));
        System.out.println( fs.solve("bcxz"));
    }

}
