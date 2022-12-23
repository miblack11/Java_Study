public class MulForExercise02{
	public static void main(String[] args){
		//需求：99乘法表
		for ( int i = 1; i <= 9; i++){
			for ( int j = 1; j <=i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}