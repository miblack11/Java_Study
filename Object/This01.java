public class This01{
	public static void main(String[] args){
		Dogi dog = new Dogi("����",3);
		System.out.println("dog�� hashCode=" + dog.hashCode());
		dog.info();
		System.out.println("========");
		Dogi dog2 = new Dogi("���", 2);
		System.out.println("dog2��hashCode=" + dog2.hashCode());
		dog2.info();
	}
}
class Dogi{
	String name;
	int age;
	// public Dogi(String dName, int dAge){//������
	// name = dName;
	// age = dAge;
	// }
	//������ǹ��������βΣ��ܹ�ֱ��д�����������͸�����
	//���ǳ�����һ�����⣬���ݱ�����������ԭ��
	//�������� name �Ǿֲ�����������������
	//�������� age �Ǿֲ�����������������
	//==> ���� this �ؼ��������
	public Dogi(String name, int age){
		//this.name ���ǵ�ǰ���������name
		this.name = name;
		//this.age ���ǵ�ǰ���������age
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	}
	public void info(){//��Ա������������� ��Ϣ
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}