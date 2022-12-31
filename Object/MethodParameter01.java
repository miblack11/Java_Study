public class MethodParameter01{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA obj = new AA();
		obj.swap(a,b);
		System.out.println("main 方法 a=" + a + "b=" + b);
	}
}
class AA {
	public void swap(int a, int b){
		System.out.println("\n a 和 b 交换前的值\n a=" + a + "b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\n a 和 b 交换后的值\n a=" + a + "b=" + b);
	}
}