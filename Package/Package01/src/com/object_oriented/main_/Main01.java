package com.object_oriented.main_;

public class Main01 {
    //静态属性
    private static String name="朱涵";
    //非静态属性
    private int n1 = 100;
    //静态方法
    public static void hi(){
        System.out.println("静态方法hi()");
    }
    //非静态方法
    public void hello(){
        System.out.println("非静态方法hello()");
    }

    public static void main(String[] args) {
        //静态属性中可以直接调用静态方法和静态属性
        System.out.println(name);
        hi();
        //若是要调用非静态方法和属性 要创建一个对象实列  在调用
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.hello();
    }
}
