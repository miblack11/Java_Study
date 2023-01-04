package com.black.modifier;

public class A {
    //四个属性，分别使用不同的访问修饰符来修饰
    public int n1 = 11;
    protected int n2 = 22;
    int n3 = 33;
    private int n4 = 44;
    //在同一个类中，可以访问的 public protected 默认 private修饰属性的方法
    public void m1(){
        System.out.println("n1=" + n1 + "  n2=" + n2 + "  n3=" + n3 + "  n4=" + n4);
    }
    protected void m2(){ }
    void m3(){ }
    private void m4(){ }
    public void hi(){
        //在同一给类中可以访问的 public protected 默认 private 修饰方法
        m1();
        m2();
        m3();
        m4();
    }
}
//修饰符可以用修饰类中的属性，成员方法，类(public  默认)
//成语方法的访问和属性一样