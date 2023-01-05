package com.black.extend_;

//父类
public class Base extends ToBase{
    //四个属性
    public int n1 = 11;
    protected int n2 = 22;
    int n3 = 33;
    private int n4 = 44;
/*
当创建子类对象时，不管使用子类的那个构造器，默认情况
下总会调用父类的无参构造器，如果父类没有提供无参构造器
则必须在子类的构造器中用super去指定使用父类的那个
构造器完成父类的初始化工作，否则，编译不会通过
 */
    //Object 是所有类的基类
    //使用ctrl + H 可以看到继承关系
    public Base() {//无参构造器
        System.out.println("父类Base()被调用...");
    }

    public Base(String name,int age) {
        System.out.println("父类Base(String name,int age)被调用...");
    }

    public Base(String name) {
        System.out.println("父类Base(String name)被调用...");
    }
    //提供一个公共的方法就可以访问
    public int getN4() {
        return n4;
    }

    //四个方法
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void callTest400(){
        test400();
    }
}
