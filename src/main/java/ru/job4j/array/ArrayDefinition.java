package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[40];
        System.out.println("Размер массива равен ages: " + ages.length);
        System.out.println("Размер массива равен surnames: " + surnames.length);
        System.out.println("Размер массива равен price: " + price.length);
        String[] names = new String[4];
        names[0] = "Василий Иванов";
        names[1] = "Андрей Петров";
        names[2] = "Алексей Зайцев";
        names[3] = "Владимир Лосев";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
