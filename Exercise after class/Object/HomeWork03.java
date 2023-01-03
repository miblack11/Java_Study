public class HomeWork03{
	public static void main(String[] args){
		Circle c1 = new Circle(5);
		c1.c();
		c1.s();
	}
}
class Circle{
	//定义属性：半径，提供显示圆周长功能的方法c
	//提供显示圆面积的方法s
int r;
	public Circle(int r){
		this.r = r;
	}public void c(){
		System.out.println("圆周长=" + 2 * r * Math.PI);
	}
	public void s(){
		System.out.println("圆面积=" + r * r * Math.PI);
	}
}