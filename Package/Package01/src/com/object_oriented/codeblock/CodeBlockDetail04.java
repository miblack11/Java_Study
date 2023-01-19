package com.object_oriented.codeblock;

/**
 * 创建子类对象（继承关系）：调用顺序
 * 1父类的静态代码块和静态属性
 * 2子类的静态代码块和静态属性
 * 3父类的普通代码块和普通属性
 * 4父类类的构造方法
 * 5子类的普通代码块和普通属性
 * 6子类的构造方法
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        B02 b02 = new B02();
    }
}
class A02{//父类
    private static int n1 = getN1();//父类的静态初始化
    static {//父类的静态代码块
        System.out.println("A02的一个静态代码块");
    }
    private int n2 = getN2();//父类普通的属性初始化
    {
        System.out.println("A02的一个普通代码块");

    }
    public static int getN1(){
        System.out.println("父类静态属性初始化getN1()属性初始化");
        return 10;
    }
    public int getN2(){
        System.out.println("父类普通属性初始化getN2()属性初始化");
        return 20;
    }

    public A02() {
        System.out.println("A02的构造器");
    }
}
class C02{
    private int n1 = 100;
    private static int n2 = 200;
    public void m1(){

    }
    public static void m2(){

    }
    static {
        //静态代码块  只能调用静态成员
//        System.out.println(n1);
        System.out.println(n2);
        m2();
    }
    {
        //普通代码块可以调用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();m2();
    }
}
class B02 extends A02{
    private static int n3 = getN3();
    static {
        System.out.println("子类B02的静态代码块");
    }
    private int n4 = getN4();
    {
        System.out.println("子类B02的普通代码块");
    }
    public static int getN3(){
        System.out.println("子类的getN3()静态属性初始化");
        return 300;
    }
    public int getN4(){
        System.out.println("子类的getN4()属性初始化");
        return 400;
    }

    public B02() {
        System.out.println("B02的构造器");
    }
}