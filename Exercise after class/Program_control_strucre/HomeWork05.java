import java.util.Scanner;
public class HomeWork05{
	public static void main(String[] args){
		//�ж��ܷ�5����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = scanner.nextInt();
		if (num % 5 == 0){
			System.out.println(num + "���Ա�5����");
		}else{
			System.out.println(num + "�����Ա�5����");
		}
	}
}