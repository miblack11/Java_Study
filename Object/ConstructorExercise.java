public class ConstructorExercise{
	public static void main(String[] args){
		Person30 p1 = new Person30();
		System.out.println("p1��name=" + p1.name + "����=" + p1.age);
		Person30 p2 = new Person30("mike",34);
		System.out.println("p2��name=" + p2.name + "����=" + p2.age);
	}
}
class Person30 {
	String name = "jack";
	int age = 45;
	//��һ�����������޲ι����� 
	//����age���Գ�ʼֵ��Ϊ18
	public Person30(){
		age = 18;
	}
	//�ڶ����� pName �� pAge ���������Ĺ�������ʹ��ÿ�δ��� Person30 
	//�����ͬʱ��ʼ������� age ����ֵ�� name ����ֵ��
	public Person30(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}