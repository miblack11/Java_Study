package com.black.poly_.dynamic;
//动态绑定机制
//1.当调用对象方法时候，该方法和该对象的内存地址/运行内存
//绑定
//2.当调用对象属性是，没有动态绑定机制，哪里声明。哪里调用
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型 A ， 运行内存B
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
class A{
    int i = 10;
    public int getI() {
        return i;
    }
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }

}
class B extends A{
    int i = 20;
//    public int sum(){
//        return i + 10;
//    }
    public int getI(){
        return i;
    }
//    public int sum1(){
//        return i + 10;
//    }
}