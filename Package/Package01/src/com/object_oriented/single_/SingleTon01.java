package com.object_oriented.single_;

/**
 * 演示单列模式（饿汉式）
 * 1.将构造器私有化（防止直接new）
 * 2.类的内部直接创建对象
 * 3.向外暴露一个静态的公共方法
 *
 */
public class SingleTon01 {
    public static void main(String[] args) {
        System.out.println(GireFriend.getInstance());
    }
}
class GireFriend{
    private String name;
    //1.将构造器私有化

    private GireFriend(String name) {
        this.name = name;
    }
    //2.在类直接创建对象
    private static GireFriend gireFriend = new GireFriend("while");
    //3.提供一个公共的static方法 返回girefriend
    public static GireFriend getInstance(){
        return gireFriend;
    }

    @Override
    public String toString() {
        return "GireFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

