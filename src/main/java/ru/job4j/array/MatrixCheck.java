package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            result = board[row][cell] == 'X' || board[row][cell] == ' ';
            if (board[row][0] != board[row][cell]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
