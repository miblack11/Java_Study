import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//输入尝试
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = scanner.next();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入薪水");
		double sal = scanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("name=" + name + "age=" + age + "sal=" + sal);
	}
}