package com.problems.leetcode;

import java.util.Stack;

/**
 * Created by Maks on 2/21/2018.
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        while (i < num.length()) {
            while (st.size() > 0 && k > 0 && num.charAt(i) < st.peek()) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";

    }
}
