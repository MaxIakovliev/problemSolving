package com.problems.hackerrank.algorithms.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Maks on 11/6/2017.
 */
public class TwoCharacters {

    public  int longestAltString(String s) {
        char [][] letters = new char[26][26];
        int [][] values = new int[26][26];
        for(char c : s.toCharArray()) {
            int index = (int)(c - 'a');
            for(int i = 0; i < 26; i++) {
                if(letters[index][i] != c && values[index][i] != -1) {
                    letters[index][i] = c;
                    ++values[index][i];
                } else {
                    values[index][i] = -1;
                }
                if(letters[i][index] != c && values[i][index] != -1) {
                    letters[i][index] = c;
                    ++values[i][index];
                } else {
                    values[i][index] = -1;
                }
            }
        }
        int largestString = 0;
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < 26; j++) {
                if(values[i][j] > largestString) {
                    largestString = values[i][j];
                }
            }
        }
        if(largestString > 1) {
            return largestString;
        } else {
            return 0;
        }
    }



    List<String> posibleRemovals=new ArrayList<>();
    public int getMaxString(String str) {
        if (str.length() == 0)
            return 0;
        //List<Character> chars = getAllChars(str);
//        if (chars.size() < 2) {
//            return 0;
//        }
//        if (chars.size() == 2) {
//            if (validString(str))
//                return str.length();
//            else
//                return 0;
//        }
        int maxLen = 0;

        String chars =getAllCharsStr(str);
        permutation("",chars);
        for(int i=0; i<posibleRemovals.size(); i++){
            //String tmp=str;
            StringBuilder tmp=new StringBuilder(str);
            for(int j=0; j<posibleRemovals.get(i).length(); j++){
                //tmp=tmp.replace(Character.toString(posibleRemovals.get(i).charAt(j)),"");
                replaceAll(tmp,Character.toString(posibleRemovals.get(i).charAt(j)),"");
                if(tmp.length()==0)
                    continue;
                if(validString(tmp.toString())){
                    if(tmp.length()>maxLen){
                        maxLen=tmp.length();
                    }
                }
            }
        }
        return maxLen;
    }

    public static void replaceAll(StringBuilder builder, String from, String to)
    {
        int index = builder.indexOf(from);
        while (index != -1)
        {
            builder.replace(index, index + from.length(), to);
            index += to.length(); // Move to the end of the replacement
            index = builder.indexOf(from, index);
        }
    }

    private  void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            //System.out.println(prefix);
            posibleRemovals.add(prefix);
        }
        else {
            //System.out.println(prefix);
            posibleRemovals.add(prefix);
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    public List<Character> getAllChars(String str) {
        List<Character> res = new ArrayList<>();
        HashSet<Character> chrs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!chrs.contains(str.charAt(i))) {
                chrs.add(str.charAt(i));
                res.add(str.charAt(i));
            }
        }
        return res;
    }

    public String getAllCharsStr(String str) {
        StringBuilder res = new StringBuilder();
        HashSet<Character> chrs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!chrs.contains(str.charAt(i))) {
                chrs.add(str.charAt(i));
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public boolean validString(String str) {
        char x = str.charAt(0);
        HashSet<Character> chrs = new HashSet<>();
        chrs.add(x);
        for (int i = 1; i < str.length(); i++) {
            if (!chrs.contains(str.charAt(i)))
                chrs.add(str.charAt(i));

            if (chrs.size() > 2)
                return false;

            if (str.charAt(i) == x)
                return false;

            x = str.charAt(i);

        }
        return true;
    }
}
