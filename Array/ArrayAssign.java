public class ArrayAssign{
	public static void main(String[] args){
		//基本数据赋值方式位值拷贝
		int i = 1;
		int a = 1;
		a = 60;
		System.out.println(a);//60
		System.out.println(i);//1
		//数组在默认情况下是引用传递，赋的是地址
		int[] arr1 = {1, 2, 4};
		int[] arr2 = arr1;
		arr2[0] = 12;
		for ( int b = 0; b < arr1.length; b++){
			System.out.println(arr1[b]);//12 2 4
		}
		
	}
}