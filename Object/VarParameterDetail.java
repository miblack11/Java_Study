public class VarParameterDetail{
	public static void main(String[] args){
		//细节：可变参数的实参可以是数组
		int arr[] = {2,4,5};
		Vpd v = new Vpd();
		v.sum(arr);
	}
}
class Vpd{
	public void sum(int...nums){
		System.out.println("长度=" + nums.length);
	}
	//细节：可变参数可以和普通类型的参数一起放在形参列表
	//但必须保证可变参数在最后
	//可变参数的本质就是数组
	public void sum1(double n, double...ns){
		//可以
	}
	// public void sum2(double...ns, int n){
	// 	不可以
	// }
}