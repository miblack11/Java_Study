import java.util.Scanner;
public class ForExercise{
	public static void main(String[] args){
		//需求：
		////打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.[化繁为简,先死后活]
		//老韩的两个编程思想(技巧)
		//1. 化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成 编程 = 思想 --练习-> 代码
		//2. 先死后活 : 先考虑固定的值，然后转成可以灵活变化的值
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入开始数字");
		int start = scanner.nextInt();
		System.out.println("请输入结束数字");
		int end = scanner.nextInt();
		System.out.println("请输入多少倍数");
		int multiple = scanner.nextInt();
		int count = 0;
		int sum = 0;
		for (int i = start; i <= end; i++){
			if ( i % multiple == 0){
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		System.out.println("总个数" + count);
		System.out.println("合计" + sum);

	}
}