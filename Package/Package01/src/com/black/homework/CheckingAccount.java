package com.black.homework;

public class CheckingAccount extends BankAccount{
    private int service;

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public double deposit(double amount) {
       super.deposit(amount);
        --amount;
        return getBalance();
    }

    @Override
    public double withdraw(double amount) {
        super.withdraw(amount);
        --amount;
        return getBalance();
    }
}
