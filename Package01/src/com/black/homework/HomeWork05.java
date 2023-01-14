package com.black.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        Staff staff = new Worker5(20000, "工人");
        staff.print();
        staff = new Peasant(15000,"农名");
        staff.print();
        staff = new Teacher(4000,"老师",20,100);
        staff.print();
        staff = new Scientist(100000,"科学家",100000);
        staff.print();
        staff = new Waiter(5000,"服务员");
        staff.print();
    }
}
