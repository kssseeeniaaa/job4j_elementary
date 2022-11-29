package ru.job4j.array;

public class Max {
    public static int findMax(int[] array, int start, int finish) {
        int max = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] rsl = new int[] {1, 5, 2, 1};
        int rsl1 = findMax(rsl, 0, 2);
            System.out.println(rsl1);
    }
}
