package com.object_oriented.static_;

/**
 * 1.什么时候我们需要类变量？
 * 当我们需要让某个类的所有对象都共享一个变量时
 * 2.类变量和实列变量的区别：
 * 类变量时该类所有对象共享的，实列变量时每个对象独享的
 * 3.加上static称为类变量 或者静态变量
 * 4.类变量可以通过类名.类变量名 或者对象名.类变量名来访问
 * 必须满足访问权限
 * 5.实列变量不能通过类名.类变量名访问
 * 6.类变量实在类加载时就初始化了  即使没有对象名也可以访问
 * 7.类变量的生命周期随类的加载开始  随类的消亡而消亡
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.n1);//只能通过对象名来访问
        //静态变量是类加载的时候，就创建了,所以我们没有创建对象实例
        //也可以通过类名.类变量名来访问
        System.out.println(B.n2);
        System.out.println(C.address);
    }
}
class B{
    public int n1 = 100;
    public static int  n2 = 200;

}
class C{
    public static String address = "贵州";
}