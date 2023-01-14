package com.black.homework;

public class HomeWork02 {
    //同类 同包 子类 不同包
    public int n1;//同类 同包 子类 不同包
    protected int n2;//同类 同包 子类
    int n3;//同类 同包
    private int n4;//同类
    public void a(){
        System.out.println(n1 + n2 + n3 + n4);
    }
}
class Text extends HomeWork02{
    public void tt(){
        System.out.println(n1+ n2 + n3 );
    }
}
class Q{
    public void t(){
        HomeWork02 homeWork02 = new HomeWork02();
        System.out.println(homeWork02.n1 + homeWork02.n2 + homeWork02.n3);
    }
}