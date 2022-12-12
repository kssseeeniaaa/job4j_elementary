package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + square(4, 1));
        System.out.println(" p = 6, k = 2, s = 2, real = " + square(6, 2));
        System.out.println(" p = 8, k = 7, s = 1.75, real = " + square(8, 7));
    }
}
