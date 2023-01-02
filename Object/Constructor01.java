public class Constructor01{
	public static void main(String[] args){
		Person99 p1 = new Person99("mike",33);
		System.out.println("p1信息如下：");
		System.out.println("p1的name=" + p1.name);
		System.out.println("p1的age=" + p1.age);
	}
}
/*
1) 构造器的修饰符可以默认， 也可以是 public protected private
2) 构造器没有返回值
3) 方法名 和类名字必须一样
4) 参数列表 和 成员方法一样的规则
5) 构造器的调用,
 */
/*
基本语法：
[修饰符] 方法名(形参列表){
方法体;
}

 */
//构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化
class Person99{
	String name;
	int age;
	public Person99(String pName ,int pAge){
		name = pName;
		age = pAge;
	}
}