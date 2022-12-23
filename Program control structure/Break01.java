public class Break01{
	public static void main(String[] args){
		//测试代码
		for ( int i = 0; i < 10; i++){
			if (i == 3) {
				break;//跳出最近的循环
			}
			System.out.println("i=" + i);
		}
	}
}