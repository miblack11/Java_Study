public class HomeWork04{
	public static void main(String[] args){
		Cale c = new Cale();
		c.addition(12,23);
		Text t = new Text();
		t.text(c);
	}
}
class Cale{
	//�����ж�������������ʾ����������,�����ĸ�����
	//ʵ�����,��,��,��(Ҫ�����Ϊ0,Ҫ��ʾ),
	//��������������,�ֱ����
	public void addition(double i, double j){
		double and = i + j;
		System.out.println("�ӷ�����:" + and);
	}
	public void subtraction(double i, double j){
		double difference = i - j;
		System.out.println("��������:" + difference);
	}
	public void multiplication(double i, double j){
		double ride = i * j;
		System.out.println("�˷�����:" + ride);
	}
	public void division(double i, double j){
		if ( j == 0){
			System.out.println("��ʾ����");	
		}
		double except = i / j;
		System.out.println("��������:" + except);
	}
}
class Text{
	
	public void text(Cale p){
		p.addition(12,23);
		p.division(45,34);
	}
}