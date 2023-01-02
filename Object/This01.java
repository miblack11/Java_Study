public class This01{
	public static void main(String[] args){
		Dogi dog = new Dogi("旺财",3);
		System.out.println("dog的 hashCode=" + dog.hashCode());
		dog.info();
		System.out.println("========");
		Dogi dog2 = new Dogi("大黄", 2);
		System.out.println("dog2的hashCode=" + dog2.hashCode());
		dog2.info();
	}
}
class Dogi{
	String name;
	int age;
	// public Dogi(String dName, int dAge){//构造器
	// name = dName;
	// age = dAge;
	// }
	//如果我们构造器的形参，能够直接写成属性名，就更好了
	//但是出现了一个问题，根据变量的作用域原则
	//构造器的 name 是局部变量，而不是属性
	//构造器的 age 是局部变量，而不是属性
	//==> 引出 this 关键字来解决
	public Dogi(String name, int age){
		//this.name 就是当前对象的属性name
		this.name = name;
		//this.age 就是当前对象的属性age
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	}
	public void info(){//成员方法，输出属性 信息
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}