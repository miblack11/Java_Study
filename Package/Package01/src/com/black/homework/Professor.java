package com.black.homework;

public class   Professor extends Teach{
    public Professor(String name, int age, String post, double salary, double zhicheng) {
        super(name, age, post, salary, zhicheng);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}
