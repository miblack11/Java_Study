public class VarScope{
	public static void main(String[] args){
		Cat00 c0 = new Cat00();
		c0.hi();
		c0.cry();
		c0.eat();
	}
}
class Cat00{
	//ȫ�ֱ�����Ҳ�������ԣ�������Ϊ��������
	//�����ڶ����ʱ�����ֱ�Ӹ�ֵ
	int age = 10;
	//ȫ�ֱ��������ԣ�Ҳ���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ
	double weight;
	public void hi(){
		//�ֲ��������븳ֵ��ʹ�ã���Ϊû��Ĭ��ֵ
		int num = 11;
		String address = "����";
		//��hi��������ʹ��ȫ�ֱ���
		System.out.println(weight);
	}
	public void cry(){
		//1.�ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		//2. n �� name ���Ǿֲ�����
		//3. n �� name ����������cry������
		int n = 11;
		String name = "javk";
		System.out.println("��cry��ʹ������age=" + age);
	}
	public void eat(){
		System.out.println("��eat��ʹ������age=" + age);
		//System.out.println("��eat��ʹ��cry�ı���name=" + name);������
	} 
}