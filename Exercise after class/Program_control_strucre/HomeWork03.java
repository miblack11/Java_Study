import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args){
		//判读闰年
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		if ( year % 4 == 0 && year % 100 != 0){
			System.out.println( year + "是闰年");
		}else if ( year % 400 == 0){
			System.out.println( year + "是世纪闰年");
		}
		else{
			System.out.println( year + "年不是闰年");
		}
	}
}