package com.problems.hackerrank.algorithms.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maks on 11/15/2017.
 */
public class GameOfThrones {
    public String solve(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) + 1 : 1);
        }
        boolean allowed = str.length() % 2 > 0;
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getValue() % 2 > 0 && allowed) {
                allowed = false;
            } else if (en.getValue() % 2 > 0 && !allowed) {
                return "NO";
            }
        }
        return "YES";

    }
    public static void main(String[] args) {
        GameOfThrones gt=new GameOfThrones();
        System.out.println(gt.solve("aaabbbb"));
        System.out.println(gt.solve("cdefghmnopqrstuvw"));
        System.out.println(gt.solve("cdcdcdcdeeeef"));
    }

}
