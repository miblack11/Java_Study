package com.black.poly_.objectpoly;

public class poly01 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();//小狗汪汪叫
        animal = new Cat();
        animal.cry();//小猫喵喵叫
        animal = new Animal();
        animal.cry();//动物嗡嗡叫
    }
}
