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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            result = board[row][column] == 'X' || board[row][column] == ' ';
            if (board[0][column] != board[row][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
