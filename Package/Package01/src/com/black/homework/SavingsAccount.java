package com.black.homework;

public class SavingsAccount extends CheckingAccount {
    private double interest;//利息
    private int count = 3;//次数

    public SavingsAccount(double Balance, int service, double interest) {
        super(Balance, service);
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        if(count > 0){
            super.deposit(amount);
        }else{
            super.deposit(amount - getService());
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0){
            super.withdraw(amount);
        }else{
            super.withdraw(amount + getService());
        }
        count--;
    }
    public void yeaerCount(){
        count = 3;
        System.out.println(getBalance() * interest + getBalance());
    }

}

