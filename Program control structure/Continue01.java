public class Continue01{
	public static void main(String[] args){
		int i = 1;
		while( i <= 6){
			i++;
			if (i == 3){
				continue;//用于结束本次循环，继续执行下一次循环。
			}
			System.out.println("i = " + i);
		}
	}
}