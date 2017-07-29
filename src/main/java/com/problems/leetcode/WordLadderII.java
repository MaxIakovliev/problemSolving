package com.problems.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Maks on 7/21/2017.
 * https://leetcode.com/problems/word-ladder-ii/#/description
 */
public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList();
        if (!wordList.contains(endWord)) { return res; } // better to clarify before writing this line.
        HashSet<String> start = new HashSet();
        HashSet<String> end = new HashSet();
        HashSet<String> dict = new HashSet(); // one line to change
        dict.addAll(wordList); // Changing the List<String> to Set<String> for faster search.
        start.add(beginWord);
        end.add(endWord);
        HashMap<String, List<String>> hm = new HashMap();
        List<String> onePath = new ArrayList();
        onePath.add(beginWord);
        if (findPath(start, end, dict, hm, false)) {
            buildPath(beginWord, endWord, onePath, hm, res);
        }
        return res;
    }

    public boolean findPath(HashSet<String> start, HashSet<String> end, HashSet<String> dict, HashMap<String, List<String>> hm, boolean swap) {
        if (start.size() > end.size()) {
            return findPath(end, start, dict, hm, !swap);
        }
        boolean foundPath = false;
        dict.removeAll(start);
        dict.removeAll(end);
        HashSet<String> next = new HashSet();
        for (String cur : start) {
            int n = cur.length();
            for (int i = 0; i < n; i++) {
                char[] arr = cur.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    arr[i] = c;
                    String temp = new String(arr);
                    if (end.contains(temp) || dict.contains(temp)) {
                        if (end.contains(temp)) {
                            foundPath = true;
                        } else {
                            next.add(temp);
                        }
                        String key = !swap ? cur : temp;
                        String value = !swap ? temp : cur;
                        if (hm.containsKey(key)) {
                            hm.get(key).add(value);
                        } else {
                            List<String> newList = new ArrayList();
                            newList.add(value);
                            hm.put(key, newList);
                        }
                    }
                }
            }
        }
        if (foundPath) { return true; }
        if (next.isEmpty()) { return false; }
        return findPath(next, end, dict, hm, swap);
    }

    public void buildPath(String begin, String end, List<String> onePath, HashMap<String, List<String>> hm, List<List<String>> res) {
        if (begin.equals(end)) {
            res.add(new ArrayList(onePath));
            return;
        }
        if (hm.containsKey(begin)) {
            for (String next : hm.get(begin)) {
                onePath.add(next);
                buildPath(next, end, onePath, hm, res);
                onePath.remove(onePath.size() - 1);
            }
        }
    }
}
