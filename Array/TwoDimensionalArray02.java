public class TwoDimensionalArray02{
	public static void main(String[] args){
		//二维数组的表达方式：
		//第一种
		int arr[][] = new int[3][3];
		arr[1][1] = 3;//赋值
		//第二种:
		// int arrNew[][];//声明二维数组
		// arrNew = new int[][];再开空间
		for ( int i = 0; i < arr.length; i++){
			for ( int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}