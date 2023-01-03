import java.util.Scanner;
public class HomeWork05{
	public static void main(String[] args){
		//判读能否被5整除
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = scanner.nextInt();
		if (num % 5 == 0){
			System.out.println(num + "可以被5整除");
		}else{
			System.out.println(num + "不可以被5整除");
		}
	}
}