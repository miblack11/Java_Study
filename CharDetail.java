public class CharDetail{
	public static void main(String[] args){
		//在Java中，char的本质是一个整数，在默认输出时，是Unicode码对应的字符
		char c1 = 99;
		System.out.println(c1);//a
		//要输出对应的数字可以用(int)强转
		char c2 = 'a';//输出a对应的数字
		System.out.println((int)c2);
		//char类型可以进行运算的，相当与一个整数
		char c3 = 'a' + 3;
		System.out.println(c3);//d
		System.out.println((int)c3);//100

	}
}