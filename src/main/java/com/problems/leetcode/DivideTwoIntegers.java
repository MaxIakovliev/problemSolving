package com.problems.leetcode;

/**
 * Created by Maks on 1/18/2018.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int count = 0;
        int a = dividend;
        int b = divisor;

        while ((a >= 0 && b > 0 && dividend >= divisor)
                || (a < 0 && b < 0 && dividend <= divisor)
                || (a < 0 && b > 0 && dividend <= divisor * -1)
                || (a > 0 && b < 0 && dividend*-1 <= divisor )) {
            if (a >= 0 && b > 0) {
                dividend -= divisor;
            } else if (a < 0 && b < 0) {
                dividend = dividend - divisor;
            } else if (a < 0 && b > 0) {
                dividend = dividend + divisor;
            } else if (a >0 && b < 0) {
                dividend = dividend + divisor;
            }
            count++;
            if(count==Integer.MAX_VALUE)
                return  Integer.MAX_VALUE;

            if ( (a < 0 && b > 0)|| (a > 0 && b < 0)){
                if(count*-1==Integer.MIN_VALUE)
                    return  Integer.MIN_VALUE;
            }


        }
        if ( (a < 0 && b > 0)|| (a > 0 && b < 0))
            return count * -1;

        return count;
    }
}
