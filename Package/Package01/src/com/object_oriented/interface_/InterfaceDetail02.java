package com.object_oriented.interface_;

/**
 * 5.一个类可以同时实现多个接口
 * 6.接口中的属性是能是final的，而且是public static final 修饰的
 * 7.接口不能继承其他类，但是可以继承多个接口
 * 9.接口的修饰符，只能是public 和 默认 这点和类的修饰符一样
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        // * 6.接口中的属性是能是final的，
        // 而且是public static final 修饰的
        System.out.println(IB.id);
    }
}
interface IB{
   int id = 11;
}
// * 9.接口的修饰符，只能是public 和 默认 这点和类的修饰符一样
interface IC{

}
// * 5.一个类可以同时实现多个接口
class A implements IB,IC{

}
// * 7.接口不能继承其他类，但是可以继承多个接口
interface ID extends IB,IC{

}
