public class MethodParameter01{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA obj = new AA();
		obj.swap(a,b);
		System.out.println("main ���� a=" + a + "b=" + b);
	}
}
class AA {
	public void swap(int a, int b){
		System.out.println("\n a �� b ����ǰ��ֵ\n a=" + a + "b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\n a �� b �������ֵ\n a=" + a + "b=" + b);
	}
}