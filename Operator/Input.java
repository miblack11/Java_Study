import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//���볢��
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.next();
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("������нˮ");
		double sal = scanner.nextDouble();
		System.out.println("�˵���Ϣ����");
		System.out.println("name=" + name + "age=" + age + "sal=" + sal);
	}
}