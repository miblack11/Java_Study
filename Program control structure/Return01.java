public class Return01{
	public static void main(String[] args){
		for ( int i = 1; i <= 5; i++){
			if ( i == 3){
				System.out.println("���");
				return;//return ʹ���ڷ�������ʾ�������ڵķ���
			}
			System.out.println("hello");
		}
		System.out.println("world");
	}
}