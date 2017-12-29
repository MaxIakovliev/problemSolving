package com.problems.leetcode;

import java.util.*;

/**
 * Created by Maks on 12/29/2017.
 * https://leetcode.com/problems/word-ladder/description/
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord))
            return 1;

        Set<String> dict = new HashSet<>();
        for (String word : wordList) {
            dict.add(word);
        }
        if (!dict.contains(endWord))
            return 0;// not possible to build ladder

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        queue.add(null);
        dict.remove(beginWord);

        int level = 1;
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if( cur==null){
                level++;
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                continue;
            }
            for (int i = 0; i < cur.length(); i++) {
                char[] curArr = cur.toCharArray();
                for (char j = 'a'; j <= 'z'; j++) {
                    curArr[i] = j;
                    String newStr = new String(curArr);
                    if (newStr.equals(endWord))
                        return level + 1;

                    if (dict.contains(newStr)) {
                        queue.add(newStr);
                        dict.remove(newStr);
                    }
                }
            }
        }
        return 0;
    }

}
