import java.util.Scanner;
public class WhileExercise{
	public static void main(String[] args){
		//需求：
		//1) 打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ]
 		//2) 打印 40—200 之间所有的偶数 [使用 while, 课后练习]
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("请输入开始数字");
	 int start = scanner.nextInt();
	 System.out.println("请输入结束数字");
	 int end = scanner.nextInt();
	 System.out.println("请输入倍数");
	 int multiple = scanner.nextInt();		
	 int i = start;
	 while(i <= end){
	 	if (i % multiple == 0){
	 		System.out.println(i);
	 	}
	 	i++;
	 }
	}
}