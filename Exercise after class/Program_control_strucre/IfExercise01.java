import java.util.Scanner;
public class IfExercise01{
	public static void main(String[] args){
		//需求：参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
		//并且根据性别提示进入男子组或女子组。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = scanner.nextDouble();
				if (score > 8.0 ){
		System.out.println("亲输入性别");
		char gender = scanner.next().charAt(0);

			if(gender == '男'){
				System.out.println("恭喜进入男子决赛");
			}else if(gender == '女'){
				System.out.println("恭喜进入女子决赛");
			}else{
				System.out.println("输入错误");
			}
		}else {System.out.println("抱歉，你被淘汰了");
	  }
	}
}