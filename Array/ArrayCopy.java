public class ArrayCopy{
	public static void main(String[] args){
	//将 int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, 
	//要求数据空间是独立的.
	int[] arr1 = {10,20,30};
	int[] arr2 = new int[arr1.length];
	for ( int i = 0; i < arr1.length; i++){
		arr2[i] = arr1[i];
		System.out.println(arr2[i]);
	}
	arr2[1] = 222;
	for ( int i = 0; i < arr1.length; i++){
		System.out.println(arr2[i]);
	}
	System.out.println(arr1[1]);
	}
}