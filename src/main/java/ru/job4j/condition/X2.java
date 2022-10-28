package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int rs1 = X2.calc(10, 0, 0, 2);
        System.out.println("rs1 = : " + rs1);
        rs1 = X2.calc(1, 1, 1, 1);
        System.out.println("rs2 = : " + rs1);
        rs1 = X2.calc(0, 1, 1, 1);
        System.out.println("rs3 = : " + rs1);
        rs1 = X2.calc(1, 1, 0, 1);
        System.out.println("rs4 = : " + rs1);
        rs1 = X2.calc(1, 1, 1, 0);
        System.out.println("rs5 = : " + rs1);
    }
}