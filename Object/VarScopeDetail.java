public class VarScopeDetail{
	public static void main(String[] args){
		Person11 p1 = new Person11();
		/*
	属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。
	局部变量，生命周期较短，伴随着它的代码块的执行而创建，
	伴随着代码块的结束而销毁。即在一次方法调用过程中
	*/
	p1.say();//当执行 say 方法时，say 方法的局部变量比如 name,会创建，当 say 执行完毕后
	//name 局部变量就销毁,但是属性(全局变量)仍然可以使用
//
		T3 t = new T3();
		t.test();//第一种跨类访问对象属性方式
		t.test2(p1);//第二种跨类访问方式
	}
}
class T3{
	//全局变量/属性：可以被本类使用，或者其他类使用（通过对象调用）
	public void test(){
		Person11 p1 = new Person11();
		System.out.println(p1.name);//jack
	}
	public void test2(Person11 p){
		System.out.println(p.name);
	}
}
class Person11{
	//细节：属性可以加修饰符（public protected private...)
	//局部变量不能加修饰符
	public int age = 20;
	String name = "jack";
	public void say(){
		//细节 属性和局部变量可以重名，访问时遵循就近原则
		String name = "king";
		System.out.println("say()name=" + name);
	}
	public void hi(){
		String address = "北京";
		// String address = "上海";错误，重复定义变量
		String name = "zh";//可以

	}
}