public class Return01{
	public static void main(String[] args){
		for ( int i = 1; i <= 5; i++){
			if ( i == 3){
				System.out.println("你好");
				return;//return 使用在方法，表示跳出所在的方法
			}
			System.out.println("hello");
		}
		System.out.println("world");
	}
}