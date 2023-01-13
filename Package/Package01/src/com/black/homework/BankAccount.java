package com.black.homework;

public class BankAccount {
    private int balance;//余额

    public BankAccount(int balance) {
        this.balance = balance;
    }
    //存款
    public double deposit(double amount){
       return balance += amount;

    }
    //取款
    public double withdraw(double amount){
        balance -= amount;
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
