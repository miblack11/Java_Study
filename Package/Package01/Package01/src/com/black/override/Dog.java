package com.black.override;

public class Dog extends Animal {
    public void cry(){//子类的方法 名称 返回类型
        //参数和父类的一样
        System.out.println("小狗汪汪");
    }
    public String m1(){//方法的名称 参数和父类一样
        //返回类型只要是父类返回类型的子类就行（可以不一样）
        return null;
    }
    public void m2(){
        //细节：子类方法不能缩小父类方法的
        //访问权限但是可以扩大或者等于
    }
    //返回类型只要是父类返回类型的子类或者相等就可以
    public BBB m3(){
        return null;
    }
}
