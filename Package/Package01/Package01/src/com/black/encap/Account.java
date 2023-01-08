package com.black.encap;

public class Account {
    //封装
   private String name;
   private double balance;
   private String password;
//提供一个无参构造器
    public Account() {
    }
//提供构造器
    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字输入错误,提供一个默认姓名black");
            this.name = "black";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不足，请充值");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
        this.password = password;
    }else{
            System.out.println("密码输入错误，返回一个默认值000000");
            this.password = "000000";
        }
    }
    //提供一个方法输出信息
    public void info(){
        System.out.println("name=" + name +"  balance=" + balance + "  password=" + password);
    }
}
