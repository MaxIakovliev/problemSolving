package com.problems.leetcode;

/**
 * Created by Maks on 12/25/2017.
 */
public class SurroundedRegions {
    public char[][] solve(char[][] board) {
        if (board.length==0)
            return null;
        for (int j = 0; j < board[0].length; j++) {
            markBorders(board, 0, j);
            markBorders(board, board.length - 1, j);
        }

        for (int i = 0; i < board.length; i++) {
            markBorders(board, i, 0);
            markBorders(board, i, board[0].length - 1);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='O') {
                    board[i][j] = 'X';
                }

                else if(board[i][j]=='1') {
                    board[i][j]='O';
                }
            }
        }

        print(board);
        return board;
    }

    private void markBorders(char[][] board, int i, int j) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1)
            return;

        if (board[i][j] == 'O' && (
                   i == 0
                || j == 0
                || i == board.length - 1
                || j == board[0].length - 1
                || board[i - 1][j] == '1'
                || board[i + 1][j] == '1'
                || board[i][j - 1] == '1'
                || board[i][j + 1] == '1'
        )) {
            board[i][j] = '1';
            markBorders(board, i - 1, j);
            markBorders(board, i + 1, j);
            markBorders(board, i, j - 1);
            markBorders(board, i, j + 1);
        }

    }

    private void print(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print((char) board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
