package com.object_oriented.codeblock;

/**
 * 创建一个对象在一个类时的调用顺序是：
 * 1.调用静态代码块和静态初始化（优先级一样）按定义的顺序来调用
 * 2.调用普通代码和普通性初始化（优先级一样）按定义的顺序来调用
 * 3.调用构造器
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    {//普通代码块
        System.out.println("A 普通代码块01");
    }
    private int n2 = getN2();//普通初始化
    private static int n1 = getN1();//静态初始化
    static{//静态代码块
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1()被调用");
        return 20;
    }
    public int  getN2(){
        System.out.println("getN2()被调用");
        return 10;
    }
}
