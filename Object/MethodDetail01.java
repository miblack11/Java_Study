public class MethodDetail01{
	public static void main(String[] args){
		AA a = new AA();
		int res[] = a.getSumAndSub(2,3);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
		//细节：调用带参数的方法时，一定对应着参数列表
		//传入相同类型或兼容类型的参数
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1,b2);//可以byte -> int
		//a.getSumAndSub(1.1,2.2);不可以 double->int
		//细节实参和形参的类型要一致或者兼容，个数，顺序必须一致
		//a.getSumAndSub(100);个数不一致
		a.f3("tom",10);//可以
		//a.f3(100,"jack");实际参数和形式参数顺序不对
		a.f2();
	}
}
class AA{
	//细节：方法不能被嵌套
	public void f4(){
		//public void f5(){
		//}
	}
	public void f3(String str, int n){

	}
	//1.一个方法最多有一个返回值，但是可以返回多个结果（数组）
	public int[] getSumAndSub(int n1, int n2){
		int resArr[] = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
	// 具体看 getSumAndSub
	//3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
	// 而且要求返回值类型必须和 return 的值类型一致或兼容
	public int f1(){
		double di = 1.1 * 3;
		int n = 100; 
		return n;//int -> double
		//return di; double -> int
	}
		//如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ;
		//老韩提示：在实际工作中，我们的方法都是为了完成某个功能，所以方法名要有一定含义
		//，最好是见名知意
	public void f2() {
		System.out.println("hello1");
		System.out.println("hello1");
		System.out.println("hello1");
		int n = 10;
		//return;
		}
}