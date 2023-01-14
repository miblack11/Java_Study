package com.black.homework;

public class Staff {
    private double sarlay;
    private String type;

    public Staff(double sarlay, String type) {
        this.sarlay = sarlay;
        this.type = type;
    }

    public double getSarlay() {
        return sarlay;
    }

    public void setSarlay(double sarlay) {
        this.sarlay = sarlay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("工种=" + type + " 工资=" + sarlay * 12);
    }
}
