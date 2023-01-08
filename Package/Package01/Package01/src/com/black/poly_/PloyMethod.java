package com.black.poly_;

public class PloyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        B b = new B();
        //这里我们传入不同的参数，就会调用不同 sum 方法，就体现多态
        System.out.println(b.sum(10, 20));
        System.out.println(b.sum(10, 20, 30));
        //方法重写体现多态
        A a = new A();
        a.say();
        b.say();
    }
}
class A{//父类
    public void say(){
        System.out.println("A say()方法被调用");
    }
}
class B extends A{
    public int sum(int n1, int n2){//和下面的sum
        //构成方法的重载
        return n1 + n2;
    }
    public int sum(int n1, int n2,int n3){
        return n1 + n2 + n3;
    }
    public void say(){//方法的重写
        System.out.println("B say()方法被调用");
    }
}
