public class Plus{
	public static void main(String[] args){
		//1.当左右两边都是数值型时，做加法运算
		System.out.println(11+33);
		//2.当左右两边有一边是字符串时，做拼接运算
		System.out.println("11" + 33);
		System.out.println(100 + 3 + "hello");
		//从左向右进行
		System.out.println("hello" + 111 + 2);
	}
}