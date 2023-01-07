package com.black.poly_.polyarr_;

public class Study extends Person{
    private double score;

    public Study(String name, double score) {
        super(name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say() {
        return "学生" + super.say() + score;
    }
    public void ings(){
        System.out.println("学生" + getName() + "正在上课");
    }
}
