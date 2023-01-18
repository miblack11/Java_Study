package com.object_oriented.static_;
//访问静态属性
public class VisitStatic {
    public static void main(String[] args) {
        //类名：类变量名
        // 说明：类变量随着类的加载而创建
        //所以没有创建对象实列也可以访问
        System.out.println(A.name);
        A a = new A();
        //通过对象名.类变量名
        System.out.println(a.name);
    }
}
class A{
    //类变量
    //类变量的访问，必须遵守相关的访问权限

    public static String name = "你好";
    //普通属性 普通成员变量 非静态属性 非静态成员变量 实列变量
    private int num = 10;

}
