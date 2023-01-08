package com.black.super_;

/*
//n1 和 this.n1 查找的规则是
//(1) 先找本类，如果有，则调用
//(2) 如果没有，则找父类(如果有，并可以调用，则调用)
//(3) 如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
// 提示：如果查找属性的过程中，找到了，但是不能访问， 则报错, cannot access
// 如果查找属性的过程中，没有找到，则提示属性不存在
 */
public class B extends A {
    public int n1 = 111;

    //访问属性
    //super不能访问私有属性private n4
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    //编写测试方法
    public void test() {
        //super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员
        // 也可以使用 super 去访问爷爷类的成员；
        // 如果多个基类(上级类)中都有同名的成员，使用 super 访问遵循就近原则。A->B->C
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //super 访问方法
    public void ok() {
        super.test100();
        super.test300();
        super.test200();
        // super不能访问私有的private
        //super.test400();
    }

    //访问构造器
    public B() {
        //访问无参构造器，或者不写
        super();
        //访问有参构造器
//        super("d ",23);
//        super(88);
    }

    public void sum() {
        System.out.println("B类的sum()方法");
        //希望调用父类A的cal方法
        //因为子类B类没有cal重名的方法，所以有三种方法
        //第一种
        cal();
        //第二种
        this.cal();
        //第三种
        super.cal();
        /*
        //找 cal 方法时(cal() 和 this.cal())，顺序是:
        // (1)先找本类，如果有，则调用
        // (2)如果没有，则找父类(如果有，并可以调用，则调用)
        // (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
        // 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access
        // 如果查找方法的过程中，没有找到，则提示方法不存在
        //cal();
        this.cal(); //等价 cal
        //找 cal 方法(super.call()) 的顺序是直接查找父类，其他的规则一样
        //super.cal();
         */
    }
}
