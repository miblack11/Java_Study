public class MethodDetail02{
	public static void main(String[] args){
		//�����ĵ���
		A a = new A();
		//a.sayOk();
		a.m1();
	}
}
class A {
	//ͬһ�����з������ã�ֱ�ӵ��ü���
	public void prink(int n){
		System.out.println("prink()����������n = " + n);
	}
	public void sayOk(){
		prink(10);
		System.out.println("����ִ�� sayOk()");
	}
	//�����еķ��� A ����� B �෽������Ҫͨ������������
	public void m1(){
		//���� B ����, Ȼ���ڵ��÷�������
		System.out.println("m1()����������");
		B b = new B();
		b.hi();
		System.out.println("m1() ����ִ��");
	}
}
//�����еķ������ã�
class B{
	public void hi(){

		System.out.println("B���е�hi()��ִ��");
	}
}