package com.black.homework.homework08;

public class Student extends Person{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, char gender, int age, int id) {
        super(name, gender, age);
        this.id = id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        System.out.print("学生");
        return super.play() + "爱玩足球";
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " 学生号为" + id;
    }
}
