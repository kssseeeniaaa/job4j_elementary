package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rs1 = (a + b + c) / 2;
        rs1 = Math.sqrt(rs1 * (rs1 - a) * (rs1 - b) * (rs1 - c));
        return rs1;
    }

    public static void main(String[] args) {
        double rs1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rs1);
    }
}
