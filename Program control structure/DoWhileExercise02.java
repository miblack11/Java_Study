import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		//需求：
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
		Scanner scanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("老韩使出五连鞭");
			System.out.println("还钱吗(y/n)？");
			answer = scanner.next().charAt(0);
		}while(answer != 'y');
		System.out.println("终于还钱了，给我就打累了");
	}
}