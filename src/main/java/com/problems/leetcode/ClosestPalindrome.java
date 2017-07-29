package com.problems.leetcode;

//import java.math.BigInteger;

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
        if (len == 2) {
            Integer t = Integer.parseInt(n);
            if (t < 12) {
                int i = 0;
                while (i < 10)
                    i++;
                return Integer.toString((--i));
            }
        }
        boolean isChot = (len % 2 == 0);

        int half = len / 2;

        if (isChot) {
            half--;
        }


        java.math.BigInteger i1 = math(n, half, 1, !isChot ? true : false);
        java.math.BigInteger i2 = math(n, half, 0, !isChot ? true : false);
        java.math.BigInteger i3 = math(n, half, 2, !isChot ? true : false);
        java.math.BigInteger input = new java.math.BigInteger(n);

        if (i2.compareTo(input) == 0) {
            i2 = math(n, half, 2, !isChot ? true : false);
        }

        java.math.BigInteger res1 = input.subtract(i1).abs();
        java.math.BigInteger res2 = input.subtract(i2).abs();
        java.math.BigInteger res3 = input.subtract(i3).abs();
        if ((res1.compareTo(res2) <= 0 )&&(res1.compareTo(res3) <= 0 )  || i2.compareTo(input)==0) {
            return i1.toString();
        } else if((res2.compareTo(res3) <= 0 ))
            return i2.toString();
        else
            return i3.toString();

    }

    private java.math.BigInteger math(String n, int half, int operation, boolean excludeMiddle) {
        java.math.BigInteger i1 = new java.math.BigInteger(n.substring(0, half + 1));
        if (operation == 1)
            i1 = i1.subtract(new java.math.BigInteger("1"));
        else if (operation == 2)
            i1 = i1.add(new java.math.BigInteger("1"));


        StringBuilder tmp = new StringBuilder(i1.toString());
        String mid = "";
        if (excludeMiddle) {

            if (tmp.length() > 1 && tmp.length()==n.substring(0, half + 1).length()) {
                mid = tmp.substring(tmp.length() - 1);
                tmp.deleteCharAt(tmp.length() - 1);
            }
        }

        StringBuilder rev = null;
        if (Math.abs(n.length() - (tmp.length() * 2 + mid.length())) > 1) {
            if (tmp.length() == 1) {
                rev = new StringBuilder(tmp.toString());
            } else
                rev = new StringBuilder(tmp.toString().substring(0, tmp.length() - 1));
        } else
            rev = new StringBuilder(tmp.toString());

        if (i1.toString().length() < new java.math.BigInteger(n.substring(0, half + 1)).toString().length() && !excludeMiddle) {
            i1 = new java.math.BigInteger((i1.toString() + i1.toString()));
            tmp = new StringBuilder(i1.toString());
        }

        if(new java.math.BigInteger(n.substring(0, half + 1)).toString().length() - tmp.length()>1){
            tmp= new StringBuilder(i1.toString());
        }
        rev.reverse();
        tmp.append(mid);
        if(tmp.toString().length()+rev.toString().length()-n.length()>1)
            tmp.deleteCharAt((tmp.length()-1));
        tmp.append(rev);

        i1 = new java.math.BigInteger(tmp.toString());

        return i1;
    }
}

