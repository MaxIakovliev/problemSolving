package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/12/2017.
 */
public class BeautifulBinaryString {
    public int solve(String str) {
        StringBuilder sb = new StringBuilder(str);
        int idx = sb.toString().indexOf("010");
        int res = 0;
        while (idx >= 0) {
            sb = sb.replace(idx+2, idx + 3, "1");
            res++;
            idx = sb.toString().indexOf("010");
        }
        return res;
    }

    public static void main(String[] args) {
        BeautifulBinaryString b=new BeautifulBinaryString();
        System.out.println(b.solve("0100101010"));
    }
}
