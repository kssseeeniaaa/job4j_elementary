package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rs1;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 5, 5);
        System.out.println("result (1,1) to (5,5) " + result);
    }
}
