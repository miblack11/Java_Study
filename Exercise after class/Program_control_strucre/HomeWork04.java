import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������100-999����");
		int num = scanner.nextInt();
		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;
		if (num == g * g * g + s * s * s + b * b * b){
			System.out.println(num + "��ˮ�ɻ���");
		}else {
			System.out.println(num + "����ˮ�ɻ���");
		}
		
	}
}