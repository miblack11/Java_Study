public class OverLoad01{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(22,4.4));
	}
}
/*
���صĽ��ܣ�
java������ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ���β��б�һ��
���صĺô�
1.�������������鷳
2.�����˼������鷳
���ص�ϸ�ڣ�
1����������������ͬ
�β��б����벻ͬ���β����ͻ������˳��������һ����ͬ����������Ҫ��
�������ͣ���Ҫ��
 */
class MyCalculator{
	//���������ĺ�
public int calculate(int n1, int n2){
	return n1 + n2;
} 
//һ��������һ�� double �ĺ�
public double calculate(int n1, double n2){
	return n1 + n2;
} 
//һ�� double ,һ�� Int ��
public double calculate(double n1, int n2){
	return n1 + n2;
}
//���� int �ĺ�
public int calculate(int n1, int n2,int n3){
	return n1 + n2;
}
}