import java.util.Scanner;
public class ArrayAdd01{
	public static void main(String[] args){
		//要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
		// 1) 原始数组使用静态分配 int[] arr = {1,2,3}
		// 2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
		// 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
		int[] arr = {1, 2, 3};
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("你要扩容的数为");
			int newNum = scanner.nextInt();
		int[] arrNew = new int[arr.length + 1];//遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
		for ( int j = 0; j < arr.length; j++){
			arrNew[j] = arr[j];
		  }
		arrNew[arrNew.length - 1] = newNum;
		arr = arrNew;
		System.out.println("是否继续扩容'y'/'n'");
		char key = scanner.next().charAt(0);
		if ( key == 'n'){
		 break;
		}	
		}while(true);
		// 将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
		// //. 让 arr 指向 arrNew ; arr = arrNew; 那么 原来 arr 数组就被销毁
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}