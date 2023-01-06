package com.black.override;
/*
2.编写一个 Student 类，继承 Person 类，增加 id、score 属性/private
  以及构造器，定义 say 方法(返回自我介绍的信息)。
 */
public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String say(){
        return super.say() + "id=" + id + " score=" + score;
    }
}
