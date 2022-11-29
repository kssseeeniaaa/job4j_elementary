package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {1, 5, 2, 10};
        int[] rsl = new int[100];
        int size = 0;
        int[] max = SortSelected.sortforMax(coins);
        int sum = money - price;
        for (int index = 0; index < max.length; index++) {
            while (sum >= max[index]) {
                rsl[size] = max[index];
                sum = sum - max[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}