package com.black.extend_;

public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("第一次=====");
        Sub sub = new Sub();
        System.out.println("第二次=====");
        Sub sub2 = new Sub("asff");
        System.out.println("第三次=====");
        Sub sub3 = new Sub("asff", 12);
        //sub.sayOk();
    }
}
