public class TestPerson{
	public static void main(String[] args){
		Person98 p1 = new Person98("mary", 20);
		Person98 p2 = new Person98("mary", 20);
		System.out.println("p1 �� p2 �ȽϵĽ��=" + p1.compareTo(p2));
	}
}
/*
���� Person �࣬������ name��age ���ԣ����ṩ compareTo �ȽϷ�����
�����ж��Ƿ����һ������ȣ��ṩ������ TestPerson ���ڲ���, 
���ֺ�������ȫһ�����ͷ��� true, ���򷵻� false
*/
class Person98{
	String name;
	int age;
	//������
	public Person98(String name, int age){
		this.name = name;
		this.age = age;
	}
	// compareTo�ȽϷ���
	public boolean compareTo(Person98 p){
		//���ֺ�������ȫһ��
		// if(this.name.equals(p.name) && this.age == p.age) {
		// return true;
		// } else {
		// return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}