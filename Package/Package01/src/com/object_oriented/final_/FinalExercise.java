package com.object_oriented.final_;

/**
 * 需求：
 * 编写一个程序能够计算圆形的面积 ，要求圆周率为3.14，赋值的位置
 * 3个方式都要写
 */
public class FinalExercise {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.radius = 3;
//        System.out.println("圆形面积为" + circle.radius * circle.radius * circle.Π1);
//        Circle circle = new Circle(3, 3.14);
//        System.out.println("圆形面积为" + circle.radius * circle.radius * circle.Π2);
        Circle circle = new Circle();
        circle.radius = 3;
        System.out.println("圆形面积为" + circle.radius * circle.radius * circle.Π3);

    }
}

class Circle {
    double radius;//半径
    //直接定义：
//     final double Π1 = 3.14;
    //构造器定义
//    final double Π2;
//
//    public Circle(double radius, double π2) {
//        this.radius = radius;
//        Π2 = π2;
//    }
//
    //代码块定义：
    final double Π3;

    {
        Π3 = 3.14;
    }

}
