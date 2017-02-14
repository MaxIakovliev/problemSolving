package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 2/14/2017.
 */
public class SuperReducedString {
    public static String Solution1(String s)
    {

        if(s==null|| s.length()==0)return "Empty String";
        if (s.length() == 1) return s;

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        char prev = sb.charAt(0);
        int count = 1, idx = 1;

        boolean isRemoved = false;
        while (true)
        {

            if (sb.charAt(idx) == prev)
            {
                count++;
                idx++;
            }
            else
            {
                prev = sb.charAt(idx);
                count = 1;
                idx++;
            }

            if (count == 2)
            {
                sb=sb.delete(idx - 2, idx);
                if (sb.length() == 0) break;
                idx = 0;
                prev = sb.charAt(idx);
                idx++;
                isRemoved = true;

            }
            if (idx > sb.length() - 1 && !isRemoved)
                break;

            if (idx > sb.length() - 1)
            {
                idx = 0;
                prev = sb.charAt(idx);
                idx++;
                count = 1;
                isRemoved = false;
            }

        }
        return sb.length() == 0 ? "Empty String" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
