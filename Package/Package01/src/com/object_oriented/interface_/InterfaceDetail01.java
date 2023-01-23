package com.object_oriented.interface_;

/**
 * 1.接口不能被实列化
 * 2.接口中所有的方法是public方法，接口中抽象方法，可以不用abstract修饰
 * 3.一个普通类实现接口，就必须将接口的所有方法实现
 * 4.抽象类实现接口，可以不用实现接口方法
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {
        // * 1.接口不能被实列化
        //new IA();
    }
}
interface IA{
    // * 2.接口中所有的方法是public方法，
    // 接口中抽象方法，可以不用abstract修饰
    void say();
}

class Test01 implements IA {
    // * 3.一个普通类实现接口，就必须将接口的所有方法实现

    @Override
    public void say() {

    }
}
abstract class Test02{
     //* 4.抽象类实现接口，可以不用实现接口方法
}
