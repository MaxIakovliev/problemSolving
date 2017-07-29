package com.problems.leetcode;

import java.math.BigInteger;

/**
 * Created by Maks on 7/28/2017.
 */
public class ClosestPalindrome {

    public String findClosestPalindrome(String n) {
        int len = n.length();
        if (len == 0) return "";

        if (len == 1) {
            Integer t = Integer.parseInt(n);
            t = t - 1;
            return t.toString();
        }
        boolean isChot = (len % 2 == 0);

        if (!isChot) {
            int half = len / 2;

            BigInteger i1 = math(n, half,1);
            BigInteger i2 = math(n, half,0);
            BigInteger input = new BigInteger(n);

            if (i2.compareTo(input) == 0) {
                i2 = math(n, half, 2);
            }

            BigInteger res1 = input.subtract(i1).abs();
            BigInteger res2 = input.subtract(i2).abs();
            if (res1.compareTo(res2) <= 0) {
                return i1.toString();
            } else return i2.toString();
        }
        return "";
    }

    private BigInteger math(String n, int half, int operation) {
        BigInteger i1 = new BigInteger(n.substring(0, half + 1));
        if(operation==1)
            i1 = i1.subtract(new BigInteger("1"));
        else if(operation==2)
            i1 = i1.add(new BigInteger("1"));

        StringBuilder tmp = new StringBuilder(i1.toString());
        String mid = tmp.substring(tmp.length() - 1);
        tmp.deleteCharAt(tmp.length() - 1);
        StringBuilder rev = new StringBuilder(tmp.length());
        rev.append(tmp.reverse().toString());
        tmp.append(mid);
        tmp.append(rev);
        i1 = new BigInteger(tmp.toString());
        return i1;
    }
}

