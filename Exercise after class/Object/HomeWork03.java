public class HomeWork03{
	public static void main(String[] args){
		Circle c1 = new Circle(5);
		c1.c();
		c1.s();
	}
}
class Circle{
	//�������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ���c
	//�ṩ��ʾԲ����ķ���s
int r;
	public Circle(int r){
		this.r = r;
	}public void c(){
		System.out.println("Բ�ܳ�=" + 2 * r * Math.PI);
	}
	public void s(){
		System.out.println("Բ���=" + r * r * Math.PI);
	}
}