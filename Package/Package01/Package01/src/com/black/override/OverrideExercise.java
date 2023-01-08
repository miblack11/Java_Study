package com.black.override;
/*
1.编写一个 Person 类，包括属性/private（name、age）
  构造器、方法 say(返回自我介绍的字符串）。
2.编写一个 Student 类，继承 Person 类，增加 id、score 属性/private
  以及构造器，定义 say 方法(返回自我介绍的信息)。
3.在 main 中,分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍代码
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("black",45);
        System.out.println( person.say());
        Student mike = new Student("mike", 22, 22200216, 145);
        System.out.println(mike.say());
    }
}
