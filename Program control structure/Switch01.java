import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		/*
		案例：Switch01.java
		请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		a 表示星期一，b 表示星期二 …
		根据用户的输入显示相应的信息.要求使用 switch 语句完成
		*/
	 	Scanner scanner = new Scanner(System.in);
	 	System.out.println("请输入字符a-g");
	 	char n1 = scanner.next().charAt(0);
	 	switch (n1){
	 		case 'a':
	 		System.out.println("今天是星期一");
	 		break;
	 		case 'b' :
	 		System.out.println("今天是星期二");
	 		break;
	 		case 'c' :
	 		System.out.println("今天是星期三");
	 		break;
	 		case 'd' :
	 		System.out.println("今天是星期四");
	 		break;
	 		case 'e' :
	 		System.out.println("今天是星期五");
	 		break;
	 		case 'f' :
	 		System.out.println("今天是星期六");
	 		break;
	 		case 'g' :
	 		System.out.println("今天是星期日");
	 		break;
	 		default : 
	 		System.out.println("输入错误");
	 		break;
	 	}
	}
}