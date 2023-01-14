package com.black.homework;

public class Scientist extends Staff {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Scientist(double sarlay, String type, int bonus) {
        super(sarlay, type);
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("科学家工资=" + (bonus + getSarlay() * 12));
    }
}
