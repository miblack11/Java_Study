import java.util.Scanner;
public class YanHui{
	public static void main(String[] args){
		//
		//1
		//11
		//121
		//1331
		//14641
		//规律：第一和最后一个输出1
		//从第三行开始中间的数= 上一列的相同位置数+ 上一列的相同位置-1的数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入几行");
		int hang = scanner.nextInt();
		int arr[][] = new int[hang][];
		for ( int i = 0; i < arr.length; i++){
			arr[i] = new int[ i + 1];
			for ( int j = 0; j < arr[i].length; j++){
				if ( j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}