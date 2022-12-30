public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(555);
		int returnRes = p1.getSum(20,44);
		System.out.println("getSum 方法返回的值=" + returnRes);

	}
}
class Person{
	String naem;
	int age;
	//方法（成员方法）
	//添加speak成员方法，输出“我是一个好人”
	//public 表示方法是公开的
	//void 表示方法没有返回值
	//speak（） speak是方法名 （）形参列表
	//{} 方法体，可以写我们要执行的 代码
	//System.out.println("我是一个好人");表示我们的方法就是输出一句话
	public void speak(){
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int res = 0;
		for ( int i = 1; i <= 1000; i++){
			res += i;
		}
		System.out.println("res=" + res);
	}
	public void cal02(int n){
		//(int n) 形参列表，表示当前有一个形参n,可以接受用户输入数据
		System.out.println("=========");
		int res = 0;
		for ( int i = 1; i <= n; i++){
			res += i;
		}
		System.out.println("res=" + res);
	}
	//public 表示方法是公开的
	//getSum 方法名
	//(int num1, int num2)形参列表，可以接受用户传入的两个数
	//return res; 表示吧res的值， 返回
	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	}
