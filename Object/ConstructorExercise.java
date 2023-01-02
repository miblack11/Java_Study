public class ConstructorExercise{
	public static void main(String[] args){
		Person30 p1 = new Person30();
		System.out.println("p1的name=" + p1.name + "年龄=" + p1.age);
		Person30 p2 = new Person30("mike",34);
		System.out.println("p2的name=" + p2.name + "年龄=" + p2.age);
	}
}
class Person30 {
	String name = "jack";
	int age = 45;
	//第一个构造器：无参构造器 
	//设置age属性初始值都为18
	public Person30(){
		age = 18;
	}
	//第二个带 pName 和 pAge 两个参数的构造器：使得每次创建 Person30 
	//对象的同时初始化对象的 age 属性值和 name 属性值。
	public Person30(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}