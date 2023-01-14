package com.black.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jim", 22, "老司机");
        people[1] = new Person("mike", 32, "老师");
        people[2] = new Person("black", 12, "司机");
        System.out.println("没排序前");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("排序后");
        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[i].getAge() < people[i + 1].getAge()) {
                    temp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
