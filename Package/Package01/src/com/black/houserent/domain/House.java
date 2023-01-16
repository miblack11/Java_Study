package com.black.houserent.domain;

/**
 * House的对象表示一个房屋信息
 */
public class House {
    //编号 房主 电话  地址 月租 状态
    private int id;
    private String name;
    private String phone;
    private String address;
    private double monthlyrent;
    private String state;

    public House(int id, String name, String phone, String address, double monthlyrent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.monthlyrent = monthlyrent;
        this.state = state;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return
                 id +
                "\t\t" + name  +
                "\t" + phone +
                "\t" + address  +
                "\t" + monthlyrent +
                "\t" + state;


    }

}
