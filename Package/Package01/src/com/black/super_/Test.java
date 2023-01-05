package com.black.super_;

public class Test {
    //super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用 super 去访问爷爷类的成员；
// 如果多个基类(上级类)中都有同名的成员，使用 super 访问遵循就近原则。A->B->C
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.n1);
    }
}
