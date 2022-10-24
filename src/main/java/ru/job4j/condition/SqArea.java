package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rs1 = p / (2 * (k + 1));
        rs1 = rs1 * rs1 * k;
        return rs1;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
