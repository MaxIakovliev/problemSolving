package com.problems.leetcode;

/**
 * Created by Maks on 1/22/2018.
 * https://leetcode.com/problems/word-search/description/
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isExist(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isExist(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length())
            return true;

        if (i < 0 || j < 0|| i == board.length || j == board[i].length)
            return false;

        if(board[i][j]!=word.charAt(idx))
            return  false;

        board[i][j]='@';


        boolean res= isExist(board, i + 1, j, word, idx + 1)
                || isExist(board, i - 1, j, word, idx + 1)
                || isExist(board, i, j +1, word, idx + 1)
                || isExist(board, i, j - 1, word, idx + 1);
        board[i][j]=word.charAt(idx);

        return  res;
    }
}
