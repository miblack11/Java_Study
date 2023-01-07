package com.black.poly_.polyarr_;

public class Teach extends Person{
    private double salay;

    public Teach(String name, double salay) {
        super(name);
        this.salay = salay;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }
    public String say(){
        return "老师" + super.say() + salay;
    }
    public void ings(){
        System.out.println("老师" + getName() + "正在上课");
    }
}
