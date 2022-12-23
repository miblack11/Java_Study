import java.util.Scanner;
public class DoWhileExercise01{
	public static void main(String[] args){
		//需求:
		//1.打印 1—100 [学生做]
		// 2) 计算 1—100 的和 [学生做]
		// 3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入开始的数");
		int start = scanner.nextInt();
		System.out.println("请输入结束的数");
		int end = scanner.nextInt();
		int i = start;
		int sum = 0;
		int count = 0;
		do{
			if (i % 5 == 0 && i % 3 != 0){
				System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}while(i <= end);
		System.out.println("总和" + sum);
		System.out.println("总个数" + count);
	}
}