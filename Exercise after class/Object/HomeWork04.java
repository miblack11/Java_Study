public class HomeWork04{
	public static void main(String[] args){
		Cale c = new Cale();
		c.addition(12,23);
		Text t = new Text();
		t.text(c);
	}
}
class Cale{
	//在其中定义两个变量表示两个操作数,定义四个方法
	//实现求和,差,乘,除(要求除数为0,要提示),
	//并创建两个对象,分别测试
	public void addition(double i, double j){
		double and = i + j;
		System.out.println("加法运算:" + and);
	}
	public void subtraction(double i, double j){
		double difference = i - j;
		System.out.println("减法运算:" + difference);
	}
	public void multiplication(double i, double j){
		double ride = i * j;
		System.out.println("乘法运算:" + ride);
	}
	public void division(double i, double j){
		if ( j == 0){
			System.out.println("提示错误");	
		}
		double except = i / j;
		System.out.println("除法运算:" + except);
	}
}
class Text{
	
	public void text(Cale p){
		p.addition(12,23);
		p.division(45,34);
	}
}