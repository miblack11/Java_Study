package com.black.pag;

import com.black.modifier.A;

public class Text {
    public static void main(String[] args) {
        //在不同包类  只能访问public
        A a = new A();
        System.out.println(a.n1);
        a.m1();//
    }

}
