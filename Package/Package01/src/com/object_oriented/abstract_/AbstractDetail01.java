package com.object_oriented.abstract_;

/**
 * 细节：
 * 1.抽象类不能被实列化
 * 2.抽象类不一定包含abstract方法，也就是说，抽象类可以没有abstract方法
 * 3.一旦类包含了abstract方法，则这个类必须声明为abstract
 * 4.abstract只能修饰类和方法，不能修饰属性和其他的
 */
public class AbstractDetail01 {
    public static void main(String[] args) {
        //abstaract类不能被实列化

    }
}
//  2.抽象类不一定包含abstract方法，也就是说，
// 抽象类可以没有abstract方法
 abstract class A{

}
abstract class B{
    // 3.一旦类包含了abstract方法，则这个类必须声明为abstract
    public abstract void hi();
     //* 4.abstract只能修饰类和方法，不能修饰属性和其他的
    //abstract int id;
}

