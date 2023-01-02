public class ConstructorDetail{
	public static void main(String[] args){
		Person45 p1 = new Person45("king",33);
		Person45 p2 = new Person45("tom");//第 2 个构造器
		Dog88 dog1 = new Dog88();//使用的是默认的无参构造器
	}
}
class Dog88{
	//如果程序员没有定义构造器，系统会自动给类生成一个默认的无参
	//构造器（也叫默认构造器）
	//使用javap 指令 反编译查看
	/*
	默认构造器：
	Dog88(){ 
	  }
	 */
	//一旦定义了自己的构造器，默认的构造器就会覆盖
	//就不能在使用默认的无参构造器
	//除非显示的定义一下，即 Dog88(){}写（这点很重要）
	public Dog88(String dName){
		//....
	}
	Dog88(){
		//显示的定义一下 ，无参构造器
	}
}
class Person45{
	String name;
	int age;
	//第一个构造器
	public Person45(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	//第二个构造器，只指定人名，不需要指定年龄
	public Person45(String pName){
		name = pName;
	}
}