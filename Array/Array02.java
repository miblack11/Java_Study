import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		//演示 数据类型 数组名[]=new 数据类型[大小]
		//循环输入 5 个成绩，保存到 double 数组,并输出
		//第一种
		double[] scores = new double[5];
		//第二种
		// double[] scores; 先定义一个数组
		// scores = new double[5]; 分配空间
		// 循环输入
		Scanner scanner = new Scanner(System.in);
		for ( int i = 0; i < scores.length; i++){
			System.out.println("请输入第"+(i+1)+"位同学成绩");
			 scores[i] = scanner.nextDouble();
			System.out.println("第"+(i + 1)+"位同学成绩=" + scores[i]);
		}
	}
}