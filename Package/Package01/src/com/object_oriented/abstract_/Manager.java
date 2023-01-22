package com.object_oriented.abstract_;

public class Manager extends Employee {
    private int bouns;
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("经理：" + getName() + "奖金：" + bouns);
    }
}
