package com.problems.hackerrank.algorithms.string;

/**
 * Created by Maks on 11/8/2017.
 */
public class CaesarCipher {

    private Character[] low = new Character[26];
    private Character[] upp = new Character[26];

    public String Encrypt(String str, int num) {
        buildArrays();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);

            if (Character.isAlphabetic(cur)) {
                char cc = getChar(cur, num);
                sb.append(cc);
            } else {
                sb.append(cur);
            }
        }

        return sb.toString();
    }

    private void buildArrays() {
        char l = 'a';
        char p = 'A';
        for (int i = 0; i < low.length; i++) {
            low[i] = l;
            l = (char) (l + 1);
            upp[i] = p;
            p = (char) (p + 1);
        }
    }

    private Character getChar(char c, int shift) {
        int idx = 0;
        for (int i = 0; i < low.length; i++) {
            if (Character.isLowerCase(c) && c == low[i]) {
                idx = i;
                break;
            } else if (Character.isUpperCase(c) && c == upp[i]) {
                idx = i;
                break;
            }
        }
        int i = 0;
        while (i < shift) {
            i++;
            idx++;
            if (idx >= low.length) {
                idx = 0;
            }
        }
        if (Character.isLowerCase(c)) {
            return low[idx];
        } else
            return upp[idx];

    }


    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        String s = cc.Encrypt("a.b-c-zZ", 1);
        System.out.println(s);
    }
}
