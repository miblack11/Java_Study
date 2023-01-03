import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		//需求：根据旺季淡季，打印票价
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		int piaojia = 60;
		if (month >= 4 && month <= 10){
			if ( age < 18){
				System.out.println(piaojia / 2);
			}else if ( age >= 18 && age <= 60){
				System.out.println(piaojia);
			}else {
				System.out.println(piaojia / 3);
			}
		}else{
			if (age >= 18 && age <= 60){
				System.out.println(40);
			}else {
				System.out.println(20);
			}
		}
	}
}