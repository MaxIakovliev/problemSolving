package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/6/2017.
 */
public class ReduceString {

    public String reduce(String str) {
        if (str.length() == 0)
            return "Empty String";
        str = process(str);
        return str.length() == 0 ? "Empty String" : str;
    }

    private String process(String str) {
        StringBuilder sb = new StringBuilder(str);
        char prev = sb.charAt(0);
        int i = 1;
        while (i < sb.length()) {
            if (prev == sb.charAt(i)) {
                sb.deleteCharAt(i);
                i--;
                sb.deleteCharAt(i);

                if (i >= sb.length())
                    break;

                prev = sb.charAt(0);
                i = 1;
                if (i >= sb.length())
                    break;
            } else {
                prev = sb.charAt(i);
                i++;
            }
        }
        return sb.toString();
    }
}
