package com.problems.hackerrank.algorithms.string;

import java.util.*;

/**
 * Created by Maks on 11/26/2017.
 */
public class RichieRich {

    private HashSet<Integer> un = new HashSet<>();
    int glob = 0;

    public String solve(String str, Integer num) {
        if(str.length()<num){
            char[] chars = new char[str.length()];
            Arrays.fill(chars, '9');
            return  new String(chars);
        }
        int originalNum = num;
        StringBuilder sb = new StringBuilder(str);
        List<Map.Entry<Integer, Integer>> replace = howToFixPalindrome(str, num);
        if(replace.size()>num){
            return "-1";
        }
        int prevReplaceSize=-1;
        while (replace.size()<num&& prevReplaceSize!=replace.size()){
            prevReplaceSize=replace.size();
            int dif=num-replace.size();
            num=num-dif;
            int tmp=replace(sb, dif);
            if(tmp>0)
                num+=tmp;
            replace=howToFixPalindrome(sb.toString(),num);
        }
        replace=howToFixPalindrome(sb.toString(),num);
        for(int i=0;i<replace.size();i++){
            sb.setCharAt(replace.get(i).getKey(),replace.get(i).getValue().toString().charAt(0));
            num--;
            glob++;
            if (un.contains(replace.get(i).getKey())) {
                System.out.println("!!!!! " + replace.get(i).getKey());
            } else un.add(replace.get(i).getKey());
        }

        System.out.println(" globe= "+glob+" num= "+originalNum);
        return  sb.toString();
    }

    private boolean isPalindrome(StringBuilder sb) {
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    private Integer replace(StringBuilder sb, int num) {
        int start = 0;
        int end = sb.length() - 1;
        int count = 0;
        while (start < sb.length() - 1 && end > 0 && count < num) {
            if (sb.charAt(start) != '9' && count < num && !un.contains(start)) {
                sb.setCharAt(start, '9');
                glob++;
                if (un.contains(start)) {
                    System.out.println("!!!!! " + start);
                } else un.add(start);
                count++;

            }
            if (sb.charAt(end) != '9' && count < num && !un.contains(end)) {
                sb.setCharAt(end, '9');
                glob++;
                if (un.contains(end)) {
                    System.out.println("!!!!! " + end);
                } else un.add(end);
                count++;

            }
            start++;
            end--;
        }

        return num - count;
    }

    private List<Map.Entry<Integer, Integer>> howToFixPalindrome(String str, Integer num) {

        int start, end;
        List<Map.Entry<Integer, Integer>> res = new ArrayList<>();
        if (str.length() == 1 && num > 0) {
            res.add(new AbstractMap.SimpleEntry<>(0, 9));
            return res;
        }
        start = 0;
        end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                int x = Character.getNumericValue(str.charAt(start));
                int y = Character.getNumericValue(str.charAt(end));
                if (x > y)
                    res.add(new AbstractMap.SimpleEntry<>(end, x));
                else
                    res.add(new AbstractMap.SimpleEntry<>(start, y));
            }
            start++;
            end--;
        }

        if (res.size() == 0 && str.length() % 2 > 0 && num > 0) {
            res.add(new AbstractMap.SimpleEntry<>(str.length() / 2, 9));
        }
        return res;
    }
}
