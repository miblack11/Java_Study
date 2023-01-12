package com.black.homework;

public class Lecturer extends Teach{
    public Lecturer(String name, int age, String post, double salary, double zhicheng) {
        super(name, age, post, salary, zhicheng);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}
