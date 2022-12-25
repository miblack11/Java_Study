public class ArrayExercise01{
	public static void main(String[] args){
		//1) 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。提示：char 类型
		//数据运算 'A'+2 -> 'C
		char[] chars = new char[26];
		for (int i = 0; i < chars.length;i++){
		chars[i] = (char)('A' + i);
		System.out.print(chars[i]);
	}
	for( char a = 'a'; a <= 'z'; a++){
		System.out.print(a);
	}
	}
}