import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args){
		//�ж�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		int year = scanner.nextInt();
		if ( year % 4 == 0 && year % 100 != 0){
			System.out.println( year + "������");
		}else if ( year % 400 == 0){
			System.out.println( year + "����������");
		}
		else{
			System.out.println( year + "�겻������");
		}
	}
}