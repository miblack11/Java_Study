import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		//需求：1) 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		// 2) 统计三个班及格人数，每个班有 5 名同学。
		Scanner scanner = new Scanner(System.in);
		int count = 0;//统计及格人数
		double sums = 0;//总的平均分
		System.out.println("请输入总共有多少班级");
		int classNum = scanner.nextInt();//定义总的几个班级
		System.out.println("请输入每个班级有多少人");
		int stydyNum = scanner.nextInt();//定义每个班人数
		for (int i = 1; i <= classNum; i++){
			double sum = 0;
			for (int people = 1; people <= stydyNum; people++){
				System.out.println(i + "班第" + people + "人成绩");
				double score = scanner.nextDouble(); 
				if (score >= 60){
					count++;
				}
				sum += score;
				sums += score;
			}
			System.out.println(i + "班平均分为" + sum/stydyNum);
		}
		System.out.println(classNum  + "个班及格人数为" + count);
		System.out.println(classNum + "个班平均分为" + sums/(classNum * stydyNum));
	}
}