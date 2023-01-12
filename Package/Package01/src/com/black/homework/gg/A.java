package com.black.homework.gg;

import com.black.homework.HomeWork02;

public class A {
    public void i(){
        HomeWork02 homeWork02 = new HomeWork02();
        System.out.println(homeWork02.n1);
    }
}
class B extends HomeWork02{
    public void b(){
        System.out.println(n1 + n2);
    }
}
