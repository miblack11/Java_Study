public class TwoDimensionalArray01{
	public static void main(String[] args){
			//请用二维数组输出如下图形:
			// 0 0 0 0 0 0
			// 0 0 1 0 0 0
			// 0 2 0 3 0 0
			// 0 0 0 0 0 0		
			// 查找某个元素：
			int arr[][] = {{0 ,0 ,0 ,0 ,0 ,0}, {0 ,0 ,1 ,0 ,0 ,0}, 
			               {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
			               System.out.println(arr[2][3]);//3
               for ( int i = 0; i < arr.length; i++){//遍历二维数组的每个元素（一维数组）
               	//arr.length表示： 二维数组的长度
               	//arr[i].length表示：二位数组中第i个元素的长度
               	for ( int j = 0; j < arr[i].length; j++){//遍历一维数组的每个元素
               		System.out.print(arr[i][j] + " ");
               	}
               	System.out.println();
               }
	}
}