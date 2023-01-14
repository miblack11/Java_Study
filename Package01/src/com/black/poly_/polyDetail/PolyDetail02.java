package com.black.poly_.polyDetail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说
        //访问属性看编译内存
        //访问方法看运行内存
        Bass bass = new Sub();//向上转型
        System.out.println(bass.n);
        Sub sub = new Sub();
        System.out.println(sub.n);
    }
}
class Bass{
int n = 20;
}
class Sub extends Bass{
    int n = 10;
}