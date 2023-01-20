package com.object_oriented.single_;

/**
 * 演示懒汉式单列模式
 * 1.将构造器私有化
 * 2.定义一个静态属性
 * 3.提供一个公共的静态方法
 * 4.懒汉式 只有当用户使用getInstance时 才可以返回对象
 * 后再在调用时 放回上次创建的对象
 * 区别：
 * 1.创建时机不同：饿汉式是在类加载就创建了对象实列而懒汉式是在使用的才创建
 * 2饿汉式不成在线程安全问题 懒汉式存在线程安全问题
 * 3.饿汉式存在资源浪费的可能
 * 4.在java SE 标准类中  Java.lang.Runtime就是经典的单列模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.getInstance());
    }
}
class Cat {
    private String name;
    //2.定义一个静态属性
    private static Cat cat;//默认是null

    //1.定义一个私有的构造器
    private Cat(String name) {
        this.name = name;
    }

    //3.提供一个公共私有的方法
    public static Cat getInstance() {
        if (cat == null) {//如果还没有创建cat对象
            cat = new Cat("大黄");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}