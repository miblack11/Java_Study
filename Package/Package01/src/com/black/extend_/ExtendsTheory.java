package com.black.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /*
        按照查找关系来返回信息
        1.首先看子类是否有改属性
        2.如果子类有这个属性，并且可以访问，则返回信息
        3.如果子类没有这个属性，就看父类有没有这个属性（如果父类有这个
        属性，并且可以访问，就返回信息）
        4.如果父类没有就按照（3）的规则继续找上级，直到Objeck..
         */
        System.out.println(son.name);
        //System.out.println(son.age);
        //如果age是是私有的话，则使用如下方法访问：
        System.out.println(son.getAge());
        System.out.println(son.hoppy);
        System.out.println(son.hoppy);
    }
}
class GrandPa{
    String name = "小头爷爷";
    String hoppy = "旅游";
}
class Father extends GrandPa{
    String name = "中头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
class Son extends Father{
    String name = "大头儿子";
}