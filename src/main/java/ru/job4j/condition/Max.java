package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int rs1 = Max.max(4, 5);
        System.out.println(rs1);
    }
}
