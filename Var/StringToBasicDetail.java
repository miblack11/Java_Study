public class StringToBasicDetail{
	public static void main(String[] args){
		String str = "123";
		//String str = "hello";格式不正确，就会抛出异常
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
	}
}