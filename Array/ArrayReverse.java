public class ArrayReverse{
	public static void main(String[] args){
		// 要求：把数组的元素内容反转。 
		// arr {11,22,33,44,55,66} {66, 55,44,33,22,11}
		// 第一种方法：找规律
		// arr[0] 和 arr [5] 交换
		// arr[1] 和 arr [4] 交换
		// arr[2] 和 arr [3] 交换
		// 交换3次length/2
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		// int temp = 0;
		// for ( int i = 0; i < arr1.length/2; i++){
		// 	temp = arr1[arr1.length - 1 - i];
		// 	arr1[arr1.length - 1 - i] = arr1[i];
		// 	arr1[i] = temp;
			
		// }
		// for (int j = 0; j < arr1.length; j++){
		// 	System.out.println(arr1[j]);
		// }
		//第二种方法
		//逆序遍历
		int[] arr2 = new int[arr1.length];
		System.out.println("=================");
		for ( int a = arr1.length - 1, b = 0; a >= 0; a--, b++){
			arr2[b] = arr1[a];
		}
		//5. 让 arr 指向 arr2 数据空间, 此时 arr 原来的数据空间就没有变量引用
// 会被当做垃圾，销毁
		arr1 = arr2;
		System.out.println("====arr 的元素情况=====");
		//6. 输出 arr 看看
		for(int c = 0; c < arr1.length; c++) {
				System.out.println(arr1[c]);
			}
		}
	}