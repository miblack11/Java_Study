package com.object_oriented.abstract_;

/**
 * 5.抽象类可以有任何成员（抽象类的本质还是类）
 * 6.抽象方法不能有主体，即不能实现
 * 7.如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法
 * 除非他自己声明为abstract类
 * 8.抽象方法不能使用private final static 修饰 ，因为
 * 这些关键字都是和重写违背
 */
public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
abstract class C{
    // * 5.抽象类可以有任何成员（抽象类的本质还是类）
    //属性 方法
    private String name;
    public void hi(){
        System.out.println("方法");
    }

    public C(String name) {//构造器
        this.name = name;
    }
    // * 6.抽象方法不能有主体，即不能实现
    public abstract void hello();
}
abstract class D{
    // * 7.如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法
    public abstract void say1();
    public abstract void say2();
}
class E extends D{
    @Override
    public void say1() {

    }

    @Override
    public void say2() {

    }
}
// * 除非他自己声明为abstract类
abstract class F extends D{
    //8.抽象方法不能使用private final static 修饰 ，因为
    // * 这些关键字都是和重写违背
//    private abstract void hi1();
//    public final abstract void hi2();
//    public static abstract void hi3();
}

