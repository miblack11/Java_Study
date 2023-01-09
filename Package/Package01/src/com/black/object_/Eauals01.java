package com.black.object_;
//==判断地址是否相等，equals 判断数值是否相等
public class Eauals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b);
        System.out.println(a == c);
        B b1 = a;
        System.out.println(b1 == c);
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断是否相等
        "hello".equals("afjk");//
    }
}
class B{}
class A extends B{

}

