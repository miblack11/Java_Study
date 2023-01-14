package com.black.homework;

public class Teacher extends Staff {
    private int classDay;
    private double classSal;
    public Teacher(double sarlay, String type, int classDay, double classSal) {
        super(sarlay, type);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void print() {
        System.out.println("教师工资=" + (classDay * classSal + (getSarlay() * 12)));
    }
}
