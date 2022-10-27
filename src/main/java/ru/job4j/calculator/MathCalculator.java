package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difPlusDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double sumPlusMultiPlusDifPlusDiv(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма + умножение: " + sumAndMultiply(10, 20));
        System.out.println("Разность + деление: " + difPlusDivide(10, 20));
        System.out.println("Сумма + умножение + разность + деление: " + sumPlusMultiPlusDifPlusDiv(10, 20));
    }
}
