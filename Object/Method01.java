public class Method01{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(555);
		int returnRes = p1.getSum(20,44);
		System.out.println("getSum �������ص�ֵ=" + returnRes);

	}
}
class Person{
	String naem;
	int age;
	//��������Ա������
	//���speak��Ա���������������һ�����ˡ�
	//public ��ʾ�����ǹ�����
	//void ��ʾ����û�з���ֵ
	//speak���� speak�Ƿ����� �����β��б�
	//{} �����壬����д����Ҫִ�е� ����
	//System.out.println("����һ������");��ʾ���ǵķ����������һ�仰
	public void speak(){
		System.out.println("����һ������");
	}
	public void cal01(){
		int res = 0;
		for ( int i = 1; i <= 1000; i++){
			res += i;
		}
		System.out.println("res=" + res);
	}
	public void cal02(int n){
		//(int n) �β��б���ʾ��ǰ��һ���β�n,���Խ����û���������
		System.out.println("=========");
		int res = 0;
		for ( int i = 1; i <= n; i++){
			res += i;
		}
		System.out.println("res=" + res);
	}
	//public ��ʾ�����ǹ�����
	//getSum ������
	//(int num1, int num2)�β��б����Խ����û������������
	//return res; ��ʾ��res��ֵ�� ����
	public int getSum(int num1, int num2){
		int res = num1 + num2;
		return res;
	}
	}
