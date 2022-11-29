package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static int[] sortforMax(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int max = Max.findMax(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, max, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 7};
        int[] max = sortforMax(array);
        for (int i : max) {
            System.out.println(i);
        }
    }
}