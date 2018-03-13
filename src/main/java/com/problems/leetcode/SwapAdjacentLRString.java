package com.problems.leetcode;

/**
 * Created by Maks on 3/13/2018.
 * https://leetcode.com/problems/swap-adjacent-in-lr-string/description/
 * XL -> LX
 * RX -> XR
 * RXXLRXRXL -> XRLXXRRLX
 */
public class SwapAdjacentLRString {
    public boolean canTransform(String start, String end) {
        if (!start.equals(end) && start.length() != end.length())
            return false;
        if ((!start.equals(end) && start.length() < 2) || (!start.equals(end) && end.length() < 2))
            return false;

        StringBuilder startSb = new StringBuilder(start);
        StringBuilder startEn = new StringBuilder(end);
        return canTransform(startSb, startEn, 0, 'A', 'B');

    }

    private boolean canTransform(StringBuilder start, StringBuilder end, int idx, char a, char b) {

        if (idx > 0) {
            start.setCharAt(idx - 1, a);
            start.setCharAt(idx, b);
        }

        if (idx == end.length() - 2 && this.equal(start, end))
            return false;

        if (this.equal(start, end))
            return true;

        while (idx < start.length() && start.charAt(idx) == end.charAt(idx)) {
            idx++;
            if (idx == start.length() - 1 && start.charAt(idx) == end.charAt(idx)) {
                return true;
            }
        }
        if (idx + 1 < start.length() && end.charAt(idx) == 'L' && end.charAt(idx + 1) == 'X') {
            int tmp = idx + 1;
            while (tmp > idx && tmp < start.length() - 1) {
                if (start.charAt(tmp) == 'X' && start.charAt(tmp + 1) == 'L') {
                    start.setCharAt(tmp, 'L');
                    start.setCharAt(tmp + 1, 'X');
                    tmp--;
                }
                else tmp++;
            }
        }

        while (idx < start.length() && start.charAt(idx) == end.charAt(idx)) {
            idx++;
            if (idx == start.length() - 1 && start.charAt(idx) == end.charAt(idx)) {
                return true;
            }
        }

        if (idx + 1 < start.length() && end.charAt(idx) == 'X' && end.charAt(idx + 1) == 'R') {
            int tmp = idx + 1;
            while (tmp > idx && tmp < start.length() - 1) {
                if (start.charAt(tmp) == 'R' && start.charAt(tmp + 1) == 'X') {
                    start.setCharAt(tmp, 'X');
                    start.setCharAt(tmp + 1, 'R');
                    tmp--;
                }
                else tmp++;
            }
        }

        while (idx < start.length() && start.charAt(idx) == end.charAt(idx)) {
            idx++;
            if (idx == start.length() - 1 && start.charAt(idx) == end.charAt(idx)) {
                return true;
            }
        }

        if (idx + 1 < start.length() && start.charAt(idx) == 'X' && start.charAt(idx + 1) == 'L' && end.charAt(idx) == 'L' && end.charAt(idx + 1) == 'X') {
            return canTransform(start, end, idx + 1, 'L', 'X');
        } else if (idx + 1 < start.length() && start.charAt(idx) == 'R' && start.charAt(idx + 1) == 'X' && end.charAt(idx) == 'X' && end.charAt(idx + 1) == 'R') {
            return canTransform(start, end, idx + 1, 'X', 'R');
        }
        return false;


    }

    private boolean equal(StringBuilder s1, StringBuilder s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwapAdjacentLRString s = new SwapAdjacentLRString();
        System.out.println(s.canTransform("RXXLRXRXL","XRLXXRRLX"));
        System.out.println(s.canTransform("XLLR", "LXLX"));
        System.out.println(s.canTransform("XXXXXLXXXX", "LXXXXXXXXX"));
        System.out.println(s.canTransform("XXRXLXRXXX", "XXRLXXXXXR"));
    }
}
