package com.black.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        Employee black = new Employee("black", 2000, 10, 1.0, 1000);
        System.out.println(black.print());
        Employee mike = new Employee("mike", 10, 2000, 1.2, 1000);
        System.out.println(mike.print());
    }
}
