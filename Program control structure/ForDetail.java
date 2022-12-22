public class ForDetail{
	public static void main(String[] args){
		// 1) 循环条件是返回一个布尔值的表达式
		// 2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
		// 3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代
		// 语句，中间用逗号隔开
		int i = 1;
		for (; i <= 10;){
				System.out.println("hello,world");
				i++;
		}
		
		for (int j = 1 , n = 1; j <= 5; j++,n += 3){
			System.out.println("j=" + j + "n=" + n);
		}
	}
}