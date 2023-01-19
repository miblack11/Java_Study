package com.object_oriented.codeblock;

/**
 * 1).static代码块也叫静态代码块，作用就是对类进行初始化，并且它随着
 * 类的加载而执行，并且只会执行一次，如果是普通的代码块，每创建一个
 * 对象就执行一次
 * 2）类是什么时候被加载[背]
 * 1.创建对象实列时（new)
 * 2.创建子类对象实列，父类也会被加载
 * 3.使用类的静态成员时
 * 3）普通代码块，在创建对象实列时，会被隐式调用
 * 被创建一次，就会调用一次
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类加载对象实列：
        //1.创建对象实列时：
        AA aa1 = new AA();
        //2.创建子类对象实列时，父类也会被加载吗，而且父类先被加载，子类在加载
        AA aa2 = new AA();
        //3.使用类的静态成员时（静态属性，静态方法）
        System.out.println(Cat.n1);
        Cat.info();
        //静态代码块，是在类加载时执行，并且只会执行一次
        DD dd1 = new DD();
        DD dd2 = new DD();
        //普通代码块，在创建对象实列时，会被隐式调用
        //被创建一次就调用一次
        //如果只是使用类的静态成员时，普通代码块不会执行
        System.out.println(DD.n1);//静态代码块一定执行
    }
}
class DD{
    static int n1 = 2222;
    static {
        System.out.println("DD的静态代码1 被执行");
    }
    {
        System.out.println("DD的普通代码1 被执行");
    }
}
class Cat {
     static int n1 = 100;//静态属性
    public static void info(){
        System.out.println("Cat的静态info()方法 被执行");
    }
    static {//静态代码块
        System.out.println("Cat的静态代码1 被执行");
    }
        }
class BB{
    //静态代码块
    static {
        System.out.println("BB的静态代码1 被执行");
    }
}
class AA extends BB{
    //静态代码块
    static{
        System.out.println("AA的静态代码1 被执行");
    }
}
