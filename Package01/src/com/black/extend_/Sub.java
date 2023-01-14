package com.black.extend_;

//子类
public class Sub extends Base {
    public Sub() {
        //在使用super时，必须放在构造器的第一行
        //在使用构造器时，super和this不能共存
        //指定调用父类的构造器
        //如果像调用父类的无参构造器如下所示，或者不写super
        super();
        System.out.println("子类Sub()被调用...");
    }
    public Sub(String name) {
        //调用父类的的String name,int age构造器
        super("asfk",11);
        System.out.println("子类Sub(String name)被调用...");
    }
    public Sub(String name,int age) {
        //调用父类的的String name
        super("asfk");
        System.out.println("子类Sub(String name,int age)被调用...");
    }


    public void sayOk(){//子类方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性和方法不能再子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        //提供一个父类的公共的方法访问
        System.out.println(getN4());
        test100();
        test200();
        test300();
        //test400();错误
        //提供一个父类的公共的方法访问
        callTest400();
    }
}