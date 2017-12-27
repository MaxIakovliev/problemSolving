package com.problems.leetcode;

/**
 * Created by Maks on 12/24/2017.
 */
public class ReverseWordsInString {
    public String reverse(String str) {

        StringBuilder sb = new StringBuilder(str.length());
        int prevStart = -1;
        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == ' ' || i == 0) {
                int j = i;

                while (j < str.length() && str.charAt(j) == ' ') {
                    j++;
                }
                if (prevStart == -1 || j < prevStart) {
                    for (; j < str.length() && str.charAt(j) != ' '; j++) {
                        sb.append(str.charAt(j));
                    }
                    if (i > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ')
                        sb.append(' ');
                }
                prevStart = i;
            }
        }
        if (sb.length()>0 && sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
