package com.object_oriented.final_;

/**
 * fianl 可以修饰类 属性 方法 和局部变量
 * 需求：
 * 1.当不希望类被继承时，可以用fianl
 * 2.当不希望父类的某个方法被子类重写时候 可以用final修饰
 * 3.当不希望类的某个属性值被修改时，可以用final修饰
 * 4.当不希望某个局部变量被修改，可以用final修饰
 */
public class Final01 {
}
//当不希望类被继承时：
final class A{}
//class B extends A{}
class C{
    //当不希望父类某的方法被重写时
    public final void hi(){}
}
class D extends C{
//    @Override
//    public void hi() {
//        super.hi();
//    }
}
class E{
    //当不希望某个属性值被修改时
    public final int AA_VV = 10;
//    AA_VV = 22;
}
class F{
    //当不希望某个局部变量被修改时
    public void hello(){
       final int QQ_EE_C=22;//局部变量
//        QQ_EE_C = 2;
    }
}