public class ThisDetail{
	public static void main(String[] args){
		TestT t = new TestT();
		t.f2();
		t.f3();
		TestT t2 = new TestT();
	}
}
class TestT{
	String name = "jack";
	int age = 10;
	/*
	细节：访问构造器：this（参数列表）
	注意只能在构造器中使用（即只能在构造器中访问另外一个构造器
	使用这个语法必须放在构造器中的第一句
	 */
	public TestT(){
		this("jack",34);
		System.out.println("TestT()构造器");
	}
	public TestT(String name,int age){
		System.out.println("TestT(String name, int age )构造器");
	}
	//this 关键字访问本类属性
	//传统方法：
	public void f3(){
		String name = "mike";
		System.out.println("name=" + name + "  " + "age=" + age);
		//this方法：
		System.out.println("name=" + this.name + "  " + "age=" + this.age);
	}	
	//细节：访问成员的方法：this.方法名（参数列表）	
	public void f1(){
		System.out.println("f1() 方法..");
	}public void f2(){
		System.out.println("f2() 方法..");
		f1();
		this.f1();
	}
}