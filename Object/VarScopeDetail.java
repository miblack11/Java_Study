public class VarScopeDetail{
	public static void main(String[] args){
		Person11 p1 = new Person11();
		/*
	�����������ڽϳ��������Ŷ���Ĵ����������������Ŷ�������ٶ����١�
	�ֲ��������������ڽ϶̣����������Ĵ�����ִ�ж�������
	�����Ŵ����Ľ��������١�����һ�η������ù�����
	*/
	p1.say();//��ִ�� say ����ʱ��say �����ľֲ��������� name,�ᴴ������ say ִ����Ϻ�
	//name �ֲ�����������,��������(ȫ�ֱ���)��Ȼ����ʹ��
//
		T3 t = new T3();
		t.test();//��һ�ֿ�����ʶ������Է�ʽ
		t.test2(p1);//�ڶ��ֿ�����ʷ�ʽ
	}
}
class T3{
	//ȫ�ֱ���/���ԣ����Ա�����ʹ�ã�����������ʹ�ã�ͨ��������ã�
	public void test(){
		Person11 p1 = new Person11();
		System.out.println(p1.name);//jack
	}
	public void test2(Person11 p){
		System.out.println(p.name);
	}
}
class Person11{
	//ϸ�ڣ����Կ��Լ����η���public protected private...)
	//�ֲ��������ܼ����η�
	public int age = 20;
	String name = "jack";
	public void say(){
		//ϸ�� ���Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "king";
		System.out.println("say()name=" + name);
	}
	public void hi(){
		String address = "����";
		// String address = "�Ϻ�";�����ظ��������
		String name = "zh";//����

	}
}