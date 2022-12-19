public class VarDetail{
	public static void main(String[] args){
		//1.变量必须先声明，在使用，有顺序
		int a = 11;
		System.out.println(a);//可以
		//System.out.println(a);
		//int a = 11; 不可以，有顺序的
		//2.该区域的数据/值可以在同一类型范围内不断变化
		a = 99;
		System.out.println(a);//可以的
		//a = "nike";  不可以
		//
		//
		//3.变量在同一个作用域不能重名
		//int a = 22;不可以


	}
	// class Dog{
	// public static void main(String[] args){   
	// 		int a = 2;可以	}
	// 
	//   } 
}