package com.black.homework.homework08;

public class Teacher extends Person{
    private int workage;

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }

    public Teacher(String name, char gender, int age, int workage) {
        super(name, gender, age);
        this.workage = workage;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        System.out.print("老师");
        return super.play() + "爱玩象棋";
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " 教龄为" + workage;
    }
}
