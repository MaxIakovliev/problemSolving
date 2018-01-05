package com.problems.leetcode;

/**
 * Created by Maks on 1/2/2018.
 */
public class DecodeWays {

    public int numDecodings(String s) {
        if (s.length() == 0)
            return 0;
        int n = s.length();
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i=2; i<=n; i++){
            int one=(int)s.charAt(i-1)-'0';
            if(one>0 && one<=9)
                arr[i]+=arr[i-1];
            int two=Integer.valueOf(s.substring(i-2,i));
            if(two>9 && two<=26)
                arr[i]+=arr[i-2];

        }

        return arr[n];
    }



    public static void main(String[] args) {
        DecodeWays d = new DecodeWays();
        int num = d.numDecodings("10");
        System.out.println("10 res=" + num);


        num = d.numDecodings("0");
        System.out.println("pass 0 :res=" + num + " expected:0");

        num = d.numDecodings("27");
        System.out.println("pass 27 :res=" + num + " expected:1");

        num = d.numDecodings("11");
        System.out.println("pass 11 :res=" + num + " expected:2");

        num = d.numDecodings("26");
        System.out.println("pass 26 :res=" + num + " expected:2");

        num = d.numDecodings("012");
        System.out.println("pass 012 :res=" + num + " expected:0");

        num = d.numDecodings("1010");
        System.out.println("pass 1010 :res=" + num + " expected:1");

        num = d.numDecodings("110");
        System.out.println("pass 110 :res=" + num + " expected:1");

        num = d.numDecodings("12120");
        System.out.println("pass 12120 :res=" + num + " expected:3");

        num = d.numDecodings("1");
        System.out.println("1 :res=" + num);

        num = d.numDecodings("0");
        System.out.println("0 :res=" + num);

        num = d.numDecodings("12");
        System.out.println("12 :res=" + num);

        num = d.numDecodings("121");
        System.out.println("121 :res=" + num);

        num = d.numDecodings("00");
        System.out.println("0 :res=" + num);

        num = d.numDecodings("100");
        System.out.println("0 :res=" + num);
    }
}
