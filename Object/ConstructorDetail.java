public class ConstructorDetail{
	public static void main(String[] args){
		Person45 p1 = new Person45("king",33);
		Person45 p2 = new Person45("tom");//�� 2 ��������
		Dog88 dog1 = new Dog88();//ʹ�õ���Ĭ�ϵ��޲ι�����
	}
}
class Dog88{
	//�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ�ϵ��޲�
	//��������Ҳ��Ĭ�Ϲ�������
	//ʹ��javap ָ�� ������鿴
	/*
	Ĭ�Ϲ�������
	Dog88(){ 
	  }
	 */
	//һ���������Լ��Ĺ�������Ĭ�ϵĹ������ͻḲ��
	//�Ͳ�����ʹ��Ĭ�ϵ��޲ι�����
	//������ʾ�Ķ���һ�£��� Dog88(){}д��������Ҫ��
	public Dog88(String dName){
		//....
	}
	Dog88(){
		//��ʾ�Ķ���һ�� ���޲ι�����
	}
}
class Person45{
	String name;
	int age;
	//��һ��������
	public Person45(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	//�ڶ�����������ָֻ������������Ҫָ������
	public Person45(String pName){
		name = pName;
	}
}