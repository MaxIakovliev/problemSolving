package com.problems.leetcode;

/**
 * Created by Maks on 1/18/2018.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor==1){
            return  Integer.MIN_VALUE;
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long a = Math.abs(dividend);
        if (a==Integer.MIN_VALUE){
            a=(long)Integer.MAX_VALUE+1;
        }
        long b = Math.abs(divisor);
        if (b==Integer.MIN_VALUE){
            b=(long)Integer.MAX_VALUE+1;
        }

        long res = 0;
        while (a >= b) {
            long tmp = b;
            long multpl = 1;
            while (a >= (tmp << 1)) {
                tmp = tmp << 1;
                multpl = multpl << 1;
            }
            a = a - tmp;
            res = res + multpl;
        }
        return sign == 1 ? (int) res : -(int) res;


    }

    public int divide2(int dividend, int divisor) {
        int count = 0;
        int a = dividend;
        int b = divisor;

        while ((a >= 0 && b > 0 && dividend >= divisor)
                || (a < 0 && b < 0 && dividend <= divisor)
                || (a < 0 && b > 0 && dividend <= divisor * -1)
                || (a > 0 && b < 0 && dividend * -1 <= divisor)) {
            if (a >= 0 && b > 0) {
                dividend -= divisor;
            } else if (a < 0 && b < 0) {
                dividend = dividend - divisor;
            } else if (a < 0 && b > 0) {
                dividend = dividend + divisor;
            } else if (a > 0 && b < 0) {
                dividend = dividend + divisor;
            }
            count++;
            if (count == Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                if (count * -1 == Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }


        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0))
            return count * -1;

        return count;
    }
}
