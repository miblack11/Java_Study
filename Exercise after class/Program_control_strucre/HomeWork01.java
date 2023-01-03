import java.util.Scanner;
public class HomeWork01{
	public static void main(String[] args){
		//某人有100000元，没经过一次路口，需要缴费，规则：
		//1.当现金大于50000时，每次交5%
		//2.当现金<=50000时，每次交1000
		//计算该人可以经过几次路口
		//用while + break
		int count = 0;//记录次数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的money");
		int money = scanner.nextInt();
		while(true){
			if (money > 50000 ){
				money *= 0.95;
				count++;
			}else if (money >= 1000){
				money -= 1000;
				count++;
			}else {
				break;
			}
			
		}
		System.out.println("可以经过" + count + "次路口");
	}
}