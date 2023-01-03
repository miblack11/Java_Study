import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		//判断一个数为大于，等于，小于0 的 数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = scanner.nextInt();
		if (num > 0){
			System.out.println("这是一个大于0的整数");
		}else if ( num < 0){
			System.out.println("这是一个小于0的整数");
		}else{
			System.out.println("等于0");
		}
	}
}