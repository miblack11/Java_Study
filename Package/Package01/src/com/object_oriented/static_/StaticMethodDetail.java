package com.object_oriented.static_;

/**
 * 1.类方法和普通方法都是随着类的加载而加载，将结构幸喜存储到方法区
 * 类方法中没有this参数 和 super
 * 2.类方法可以通过类名调用 ，可有通过对象名调用
 * 3.类方法中 只能访问静态方法和静态变量
 * 4.普通方法都可以访问
 */
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//ok
//非静态方法，不能通过类名调用
//D.say();, 错误，需要先创建对象，再调用
        new D().say();//可以
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;

    public void say() {
        //非静态方法
    }

    public static void hi() {
        //静态方法
        //类方法中不允许使用和对象有关的关键字，
        //比如 this 和 super。普通方法(成员方法)可以
//        System.out.println(this.n1);
    }

    //类方法(静态方法)中 只能访问 静态变量 或静态方法
//口诀:静态方法只能访问静态成员.
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);

        //System.out.println(this.n2);不能使用
        hi();//OK
        //say();//错误
    }

    public void ok() {
//非静态成员
        System.out.println(n1);
        say();
//静态成员
        System.out.println(n2);
        hello();
    }
}