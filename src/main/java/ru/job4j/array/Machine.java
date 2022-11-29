package ru.job4j.array;

import java.util.Arrays;

public class Machine { //купюра из кармана; //цена покупки
    public static int[] change(int money, int price) {
        int[] coins = {1, 5, 2, 10}; //массив монет в автомате
        int[] rsl = new int[100]; //сдача в виде массива монет
        int size = 0; //размер массива rsl, которого он достигнет
        // после того, как автомат отдаст всю сдачу
        int[] coinsmax = SortSelected.sortforMax(coins);
        int sum = money - price;
        for (int index = 0; index < coinsmax.length; index++) {
            while (sum >= coinsmax[index]) {
                rsl[size] = coinsmax[index];
                sum = sum - coinsmax[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}