package com.problems.leetcode;

/**
 * Created by Maks on 1/9/2018.
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        return validForward(s) && validBackward(s) ? true : false;
    }

    private boolean validForward(String s) {
        int begin = 0;
        int end = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                begin++;
            }
            if (s.charAt(i) == ')') {
                end++;
            }
            if (s.charAt(i) == '*') {
                star++;
            }
            if (end > begin + star)
                return false;
        }

        if (end == begin || end - begin <= star)
            return true;

        return false;
    }

    private boolean validBackward(String s) {
        int begin = 0;
        int end = 0;
        int star = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                begin++;
            }
            if (s.charAt(i) == '(') {
                end++;
            }
            if (s.charAt(i) == '*') {
                star++;
            }
            if (end > begin + star)
                return false;
        }

        if (end == begin || end - begin <= star)
            return true;

        return false;
    }
}
