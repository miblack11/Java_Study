package com.object_oriented.codeblock;

/**
 * 构造器的最前面其实隐含了super()和调用普通代码块，静态相关的
 * 代码块 ，属性初始化，在加载时，就执行完毕
 *因此时优先于构造器和普通代码快执行的
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
class AAA {
    {
        System.out.println("AAA 的普通代码块");
    }
    public AAA() {//构造器
        //这里有隐藏的执行要求
        //1 super（）
        //2调用普通代码块
        System.out.println("AAA（）构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB 的普通代码块");
    }

    public BBB() {
        System.out.println("BBB（）构造器被调用");
    }
}