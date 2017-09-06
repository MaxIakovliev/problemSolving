package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/6/2017.
 */
public class TidyNumber {

    public boolean check(int num) {
        int prev=Integer.MIN_VALUE;
        while (num > 0) {
            int rem = num % 10;
            if(prev==Integer.MIN_VALUE)
                prev=rem;
            else {
                if(prev<rem)
                    return  false;

                prev=rem;
            }
            System.out.println(rem);
            num = num / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res= new TidyNumber().check(12134);
        System.out.println(res);
    }
}
