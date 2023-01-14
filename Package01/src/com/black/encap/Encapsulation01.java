package com.black.encap;

import java.util.Scanner;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("maksssi",222,4334435);
//        person.setName("aksldf");
//        person.setAge(22);
//        person.setSalary(30000);
        person.info();
    }
}

/*
那么在 java 中如何实现这种类似的控制呢?
请大家看一个小程序
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
提供一份get方法，用于获取属性的值
提供一个公共的set方法，用于对属性判断并赋值

*/
class Person {
    public String name;//名字公开
    private int age;//名字私有化
    private double salary;//薪水私有化

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //添加一个判断属性
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入有误，提供一个默认的姓名jack");
            this.name = "jack";
        }
    }
    int mima = 33;
    Scanner scanner = new Scanner(System.in);
    public Integer getAge() {
        System.out.println("请输入密码，查看年龄");
        int shuru = scanner.nextInt();
        if (shuru == mima) {
            return age;
        } else {
            System.out.println("密码输入错误");
            return null;
        }
    }

    public void setAge(int age) {
        //增加一个判断
        if (age > 0 & age <= 120) {
            this.age = age;
        } else {
            System.out.println("输入有误，年龄不符合");
        }
    }

    public Double getSalary() {
        System.out.println("请输入密码，查看薪水");
        int shuru = scanner.nextInt();
        if (shuru == mima){
        return salary;
    }else{
            return null;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void info(){
        System.out.println("name=" +name + "   age=" + age + "  salary=" + salary);
    }
}