package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean rs1 = LogicNot.isEven(3);
        System.out.println(rs1);
        rs1 = LogicNot.isPositive(3);
        System.out.println(rs1);
        rs1 = LogicNot.notEven(3);
        System.out.println(rs1);
        rs1 = LogicNot.notPositive(3);
        System.out.println(rs1);
        rs1 = LogicNot.notEvenAndPositive(3);
        System.out.println(rs1);
        rs1 = LogicNot.evenOrNotPositive(3);
        System.out.println(rs1);

    }
}
