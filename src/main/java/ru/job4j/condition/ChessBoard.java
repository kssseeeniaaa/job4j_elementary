package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int result = ChessBoard.way(1, 5, 2, 4);
        System.out.println(result);
        result = ChessBoard.way(2, 4, 1, 5);
        System.out.println(result);
    }
}