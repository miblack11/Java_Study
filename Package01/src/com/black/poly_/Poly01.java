package com.black.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master mike = new Master("mike");
        Animal animal = new Dog("大黄");
        Food food = new Bone("大骨头");
       mike.feed(animal,food);
       animal = new Cat("大黄猫");
       food = new Fish("鱼");
       mike.feed(animal,food);
    }
}
