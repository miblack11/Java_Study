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
	ϸ�ڣ����ʹ�������this�������б�
	ע��ֻ���ڹ�������ʹ�ã���ֻ���ڹ������з�������һ��������
	ʹ������﷨������ڹ������еĵ�һ��
	 */
	public TestT(){
		this("jack",34);
		System.out.println("TestT()������");
	}
	public TestT(String name,int age){
		System.out.println("TestT(String name, int age )������");
	}
	//this �ؼ��ַ��ʱ�������
	//��ͳ������
	public void f3(){
		String name = "mike";
		System.out.println("name=" + name + "  " + "age=" + age);
		//this������
		System.out.println("name=" + this.name + "  " + "age=" + this.age);
	}	
	//ϸ�ڣ����ʳ�Ա�ķ�����this.�������������б�	
	public void f1(){
		System.out.println("f1() ����..");
	}public void f2(){
		System.out.println("f2() ����..");
		f1();
		this.f1();
	}
}