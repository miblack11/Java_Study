public class Constructor01{
	public static void main(String[] args){
		Person99 p1 = new Person99("mike",33);
		System.out.println("p1��Ϣ���£�");
		System.out.println("p1��name=" + p1.name);
		System.out.println("p1��age=" + p1.age);
	}
}
/*
1) �����������η�����Ĭ�ϣ� Ҳ������ public protected private
2) ������û�з���ֵ
3) ������ �������ֱ���һ��
4) �����б� �� ��Ա����һ���Ĺ���
5) �������ĵ���,
 */
/*
�����﷨��
[���η�] ������(�β��б�){
������;
}

 */
//���췽���ֽй�����(constructor)�������һ������ķ�����������Ҫ��������ɶ��¶���ĳ�ʼ��
class Person99{
	String name;
	int age;
	public Person99(String pName ,int pAge){
		name = pName;
		age = pAge;
	}
}