package com.black.object_;

import com.black.poly_.polyparameter_.Manager;

/*
1) 基本介绍
默认返回：全类名+@+哈希值的十六进制，【查看 Object 的 toString 方法】
子类往往重写 toString 方法，用于返回对象的属性信息
2) 重写 toString 方法，打印对象或拼接对象时，都会自动调用该对象的 toString 形式
3) 当直接输出一个对象时，toString 方法会被默认的调用,
比如 System.out.println(monster)； 就会默认调用monster.toString()

 */
public class ToString_ {
    public static void main(String[] args) {
        /*
        Object 的 toString() 源码
        (1)getClass().getName() 类的全类名(包名+类名 )
        (2)Integer.toHexString(hashCode()) 将对象的 hashCode 值转成 16 进制字符串
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
        //默认返回：全类名+@+哈希值的十六进制
        Manager manager = new Manager("朱涵", 121, 12);
        System.out.println(manager.toString());
//        2) 重写 toString 方法，打印对象或拼接对象时，都会自动调用该对象的 toString 形式
//        3) 当直接输出一个对象时，toString 方法会被默认的调用,
//        比如 System.out.println(monster)； 就会默认调用monster.toString()
        System.out.println(manager);
    }
}
class Monster{
    String name;
    int age;
    String salay;

    public Monster(String name, int age, String salay) {
        this.name = name;
        this.age = age;
        this.salay = salay;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salay='" + salay + '\'' +
                '}';
    }
}
