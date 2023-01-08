package com.black.override;
//方法覆盖（重写）就是 子类有一个方法
//和父类的某个方法的名称 返回类型 参数
//一样，我们就说子类的这个方法覆盖率
//父类的方法
public class Animal {

    public void cry(){
        System.out.println("动物叫唤");
    }
    public Object m1(){
        return null;
    }
    private void m2(){
        System.out.println(" ");
    }
    public AAA m3(){
        return null;
    }
}
class AAA{

}
class BBB extends AAA{

}
