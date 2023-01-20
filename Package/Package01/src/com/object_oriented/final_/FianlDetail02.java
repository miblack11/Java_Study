package com.object_oriented.final_;

/**
 * 5).一般来说，如果一个类已经是是final类 就没有必要在将方法修饰成final方法
 * 6）.final不能修饰构造方法（及构造器）
 * 7）.final 和 static 往往搭配使用，效率高，不会导致类加载
 * 底层编译器做了优化处理
 * 8）.包装类（Integer,Double ,Float,Boolean等都是final),String也是final类
 */
public class FianlDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB{
    //final 和 static 往往搭配使用，效率高，不会导致类加载
    //底层编译器做了优化处理
    public final static int num = 100;
    static {
        System.out.println("BBB 静态代码块");
    }
}
final class AAA{
    //一般来说，如果一个类已经是final类了  就没有必要把发方法修饰成final方法
//    public final void cry(){
//
//    }
}
