import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		//�ж�һ����Ϊ���ڣ����ڣ�С��0 �� ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scanner.nextInt();
		if (num > 0){
			System.out.println("����һ������0������");
		}else if ( num < 0){
			System.out.println("����һ��С��0������");
		}else{
			System.out.println("����0");
		}
	}
}