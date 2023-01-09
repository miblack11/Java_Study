package com.black.poly_.polyparameter_;

public class Staff extends Employee {
    public Staff(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "摸鱼大法");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
