package com.black.poly_.polyparameter_;

public class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + "调戏女员工");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
