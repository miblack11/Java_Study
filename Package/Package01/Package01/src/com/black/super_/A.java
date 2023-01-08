package com.black.super_;

public class A extends Base {
    //4个属性
    public int n1 = 11;
    protected int n2 = 22;
    int n3 = 33;
    private int n4 = 44;
    //三个构造器

    public A() {//无参构造器
         }
    public A(int age) {//有参构器
         }
    public A(int age,String name) {//有参构造
         }

    //4个方法
    public void test100(){
        System.out.println("test100()");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    public void cal(){
        System.out.println("A类的cal()方法");
    }
}
