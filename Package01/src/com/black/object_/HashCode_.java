package com.black.object_;

/*
1) 提高具有哈希结构的容器的效率！
2) 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
3) 两个引用，如果指向的是不同对象，则哈希值是不一样的
4) 哈希值主要根据地址号来的！， 不能完全将哈希值等价于地址。
5) 案例演示[HashCode_.java]: obj.hashCode() [测试：A obj1 = new A(); A obj2 = new A(); A obj3 = obj1]
6) 后面在集合，中 hashCode 如果需要的话，也会重写, 在讲解集合时，老韩在说如何重写 hashCode()
 */
public class HashCode_ {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        //两个引用，如果指向的是不同对象，则哈希值是不一样的
        System.out.println("aa1.hashcode()=" + aa1.hashCode());
        System.out.println("aa2.hashcode()=" + aa2.hashCode());
        //两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
        System.out.println("aa3.hashcode()=" + aa3.hashCode());
    }
}
class AA{

}