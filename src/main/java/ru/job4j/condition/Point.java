package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 5, 5);
        System.out.println("result (1,1) to (5,5) " + result);
        result = Point.distance(5, 2, 3, 5);
        System.out.println("result (5,2) to (3,5) " + result);
        result = Point.distance(1, 7, 2, 9);
        System.out.println("result (1,7) to (2,9) " + result);
        result = Point.distance(9, 1, 2, 4);
        System.out.println("result (9,1) to (2,4) " + result);
    }
}
