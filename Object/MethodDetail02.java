public class MethodDetail02{
	public static void main(String[] args){
		//方法的调用
		A a = new A();
		//a.sayOk();
		a.m1();
	}
}
class A {
	//同一个类中方法调用：直接调用即可
	public void prink(int n){
		System.out.println("prink()方法被调用n = " + n);
	}
	public void sayOk(){
		prink(10);
		System.out.println("继续执行 sayOk()");
	}
	//跨类中的方法 A 类调用 B 类方法：需要通过对象名调用
	public void m1(){
		//创建 B 对象, 然后在调用方法即可
		System.out.println("m1()方法被调用");
		B b = new B();
		b.hi();
		System.out.println("m1() 继续执行");
	}
}
//跨类中的方法调用：
class B{
	public void hi(){

		System.out.println("B类中的hi()被执行");
	}
}