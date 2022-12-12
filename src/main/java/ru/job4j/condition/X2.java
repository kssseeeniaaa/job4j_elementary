package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        System.out.println("rs1 = : " + calc(10, 0, 0, 2));
        System.out.println("rs2 = : " + calc(1, 1, 1, 1));
        System.out.println("rs3 = : " + calc(0, 1, 1, 1));
        System.out.println("rs4 = : " + calc(1, 1, 0, 1));
        System.out.println("rs5 = : " + calc(1, 1, 1, 0));
    }
}