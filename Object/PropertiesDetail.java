public class PropertiesDetail{
	public static void main(String[] args){
		//����Person����
		//P1 �Ƕ��������������ã�
		//new Person() �����Ķ���ռ䣨���ݣ����������Ķ���
		Person p1 = new Person();
		//���������Ĭ��ֵ�������������
		//int 0��short 0, byte 0, long 0, float 0.0,double 0.0��
		//char \u0000��boolean false��String null
		System.out.println("\n" + "age=" + p1.age + " " + "name=" + 
			p1.name  + " "+ "sal=" + p1.sal +  " " + "isPass=" + p1.isPass + 
			" " + "a=" + p1.a);
	}
}
class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	char a;
}