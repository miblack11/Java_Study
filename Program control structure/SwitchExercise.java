import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		//1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符");
		char zhuanhuan = scanner.next().charAt(0);
		switch (zhuanhuan){
			case 'a' :
			System.out.println('A');
			break; 
			case 'b' :
			System.out.println('B');
			break;
			case 'c' :
			System.out.println('C');
			break;
			case 'd' :
			System.out.println('D');
			break;
			case 'e' :
			System.out.println('E');
			break;
			default:
			System.out.println("other");
		}
		 //2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。
        //(注：输入的成绩不能大于 100), 提示 成绩/60
		System.out.println("请输入分数");
		int score = scanner.nextInt();
		switch (score / 60){
			case 1 :
			System.out.println("合格");
			break;
			case 0 :
			System.out.println("不合格");
			break;
		}
		//3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 
		//[课堂练习, 提示 使用穿透 ]
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		switch (month){
			case 3 :
			case 4 :
			case 5 :
			System.out.println("春季");
			break;
			case 6 :
			case 7 :
			case 8 :
			System.out.println("夏季");
			break;
			case 9 :
			case 10 :
			case 11 :
			System.out.println("秋季");
			break;
			case 12 :
			case 1 :
			case 2 :
			System.out.println("冬季");
			break;
		}
	}
}