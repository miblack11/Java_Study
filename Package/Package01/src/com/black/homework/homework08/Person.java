package com.black.homework.homework08;

public class Person {
    private String name;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }



    public String play(){
        return  name ;
    }
    public String printInfo(){
        return "姓名为" + name + " 性别为" + gender + " 年龄为" + age;
    }
}
