package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
                    System.out.print(array[row][cell]);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        multiple(3);
    }
}
