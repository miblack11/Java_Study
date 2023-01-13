package com.black.homework;

public class Employee {
    private String name;
    private double daysalary;
    private int day;
    private double grade;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (grade == 1.2) {
            this.bonus = bonus;
        } else {
            this.bonus = 0;
        }
    }

    public Employee(String name, double daysalary, int day, double grade, int bonus) {
        this.name = name;
        this.daysalary = daysalary;
        this.day = day;
        this.grade = grade;
        this.bonus = bonus;
    }

    public String print() {
        return "姓名=" + name + "工资=" + (getBonus() + daysalary * day * grade);
    }
}
