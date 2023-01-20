package com.object_oriented.final_;

/**
 * 细节：
 * 1）.fianl修饰属性又叫常量时  一般用XX_XX_X_来命名
 * 2）.fianl修饰属性在定义时，必须赋值，并且不能在修改，赋值可以在如下位置
 * 1.定义时：
 * 2.在构造器中
 * 3.在代码块中
 * 3）如果final修饰的属性是静态的 则初始化位置只能是
 * 1.定义时
 * 2.在静态代码块中，不能在构造器中
 * 4）.final类不能继承，但可以实列华对象
 * 5）.如果类不是final类 但是含有final方法，则该方法虽然不能重写，但是可以继承
 */
public class FianlDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();//实列化对象
       // 如果类不是final类 但是含有final方法，
        // 则该方法虽然不能重写，但是可以继承
        new EE().cla();
    }
}
class AA{
    //1）.final在修饰属性时 定义的方式为AAA_AA形式
    //2）.赋值方式
    //1.直接定义：
    public final int NUM = 1;
    //2.构造器赋值
    public final double ZH;
    public AA() {
        ZH = 22;
    }
    //3.代码块赋值：
    final String NAME;
    {
        NAME = "大黄";
    }
}
class BB{
    //静态属性赋值
    //直接定义
    public static double TAX_RATE = 1.3;
    //静态代码块赋值：
    public static double TAX_RATE2;
    static {
        TAX_RATE2 = 2.2;
    }
}
//final类不能继承，但是可以实列化对象
final class CC{}
//如果不是final类，但是含有final方法，则该方法虽然不能重写
//但是可以被继承，仍然遵守继承机制
class DD{
    public final void cla(){
        System.out.println("cla方法");
    }
}
class EE extends DD{

}

