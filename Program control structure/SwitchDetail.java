public class SwitchDetail{
	public static void main(String[] args){
		//1.表达式数据类型，应和case后的常量类型一 致，或者是可以自动转成可以相互比较的
		//类型，比如输入的是字符，而常量是int
		//// 	4. default子句是可选的，当没有匹配的case时，执行default 
		///5. break语句用来在执行完一 个case分支后使程序跳出switch语句块;如果没有写
		///break,程序会顺序执行到switch结尾，除非遇到break;穿刺
		char n1 = 'a';
		switch(n1){
			case 1 :
			System.out.println("可以");
			break;
			default://可以写也可以不写
		}
		//2. switch(表达式)中表达式的返回值必须是: (byte,short,int,char,enum[枚举],String)
		//double n = 1.1;
		//switch(n1){
		//case : 1.1
		//System.out.println("不可以");
		//break;}
		//3. case子包中的值必须是常量,而不能是变量
		//char n1 = 'a';
		// switch(n1){
		// 	case n1 :
		// 	System.out.println("可以");
		// 	break;
		//}
		
	}
}