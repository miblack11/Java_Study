package com.houseren;

import java.util.Scanner;

public class HouseSen {
    private String name;
    private String phone;
    private String address;
    private double monthlyrent;
    private String state;

   HouseSen houseSen[] = new HouseSen[10];
    public HouseSen(String name, String phone, String address, double monthlyrent, String state) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.monthlyrent = monthlyrent;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthlyrent() {
        return monthlyrent;
    }

    public void setMonthlyrent(double monthlyrent) {
        this.monthlyrent = monthlyrent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Scanner scanner = new Scanner(System.in);
    public void m1(HouseSen[] houseSen){
        System.out.println("--------添加房屋---------");
        System.out.println("姓名：");
        String name = scanner.next();
        System.out.println("电话：");
        int phone = scanner.nextInt();
        System.out.println("地址：");
        String address = scanner.next();
        System.out.println("月租：");
        String monthlyrent = scanner.next();
        System.out.println("状态：");
        String state = scanner.next();
        System.out.println("---------添加完成------");
    }
}
