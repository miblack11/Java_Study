import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		//���󣺸���������������ӡƱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = scanner.nextInt();
		System.out.println("����������");
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