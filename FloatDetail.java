public class FloatDetail{
	public static void main(String[] args){
		//1.folat型常量，后面必须加f/F
		//float num1 = 1.1;//不对
		float num2 = 1.1F;//可以
		//2.高转低可以，低转高不行
		double num3 = 1.1F;
		//科学记数法，5.12e2[5.12*10^2]  5.12E -2 [5.12/10^2]
		System.out.println(5.12e2);
		System.out.println(5.12E-2);
		//浮点型使用陷阱
		double num11 = 2.7;
		double num12 = 8.1 / 3;//接近2.7但不是2.7
		//得到一个重要的结论：当我们对运算结果是小数进行相等判断时，要小心
		//应该是以两个数的差值绝对值，在某个精度范围判断
		if( num11 == num12){
			System.out.println("错误的，不会输出");//不行
		}
		if (Math.abs(num11 - num12) < 0.000001){
			System.out.println("差值非常小，到我的规定精度，可以");
		}

	}
}