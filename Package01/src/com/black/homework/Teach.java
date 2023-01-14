package com.black.homework;

public class Teach {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double zhicheng;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(double zhicheng) {
        this.zhicheng = zhicheng;
    }

    public Teach(String name, int age, String post, double salary, double zhicheng) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.zhicheng = zhicheng;
    }
    public String introduce(){
        return "姓名=" +name + "  年龄=" + age + "  职称=" + post + "  薪水="
                + salary * zhicheng + "  级别" + zhicheng;
    }
}