public class MethodExercise01{
	public static void main(String[] args){
		//1) 编写类 AA ，有一个方法：
		//判断一个数是奇数 odd 还是偶数, 返回 boolean
		AA a = new AA();
		if(a.isOdd(55)){//T
			System.out.println("是奇数");
		}else{
			System.out.println("是偶数");
		}
		a.print(4,4,'$');
	}
}
class AA {
	public boolean isOdd(int num){
		// if (num % 2 != 0){
		// 	return true;
		// }else {
		// 	return false;
		// }
		//三元运算符：
		return num % 2 != 0 ?  true : false;
	}
	// 2) 根据行、列、字符打印 对应行数和列数的字符，
	// 比如：行：4，列：4，字符#,则打印相应的效果
	public void print(int row,int col,char c){
		for (int i = 1; i<= row; i++){
			for ( int j = 1; j <= col; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}