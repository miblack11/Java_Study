package com.object_oriented.static_;

/**
 * 思考: 如果,设计一个 int count 表示总人数,
 * 我们在创建一个小孩时，就把 count 加 1,并且 count
 * 是所有对象共享的就 ok 了!
 * 我们使用类变量来解决 ChildGame.java 改进
 */
public class ChildGame {
    public static void main(String[] args) {
//定义一个变量 count, 统计有多少小孩加入了游戏
//        int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
//count++;
        //第一种调用静态属性的方式
//        child1.count++;
        //第二种调用静态属性的方式（推荐）
        Child.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
//count++;
//        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
//count++;
//        child3.count++;
//===========
//类变量，可以通过类名来访问
//        System.out.println("共有" + Child.count + " 小孩加入了游戏...");
        System.out.println("child1.count=" + child1.count);//3
        System.out.println("child2.count=" + child2.count);//3
        System.out.println("child3.count=" + child3.count);//3
    }
}

class Child {
    private String name;
    //定义一个静态变量，
    //静态变量最大的特点是可以被这个类所有对象共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");

    }
}
