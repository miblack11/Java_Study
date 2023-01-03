public class HomeWork01{
	public static void main(String[] args){
		//编写类,定义方法max,实现求某个double数组的
		//最大值，并返回
		
		String arr2[] = {"j","ja","jack","zhu"};
		A02 a2 = new A02();
		System.out.println("返回的索引=" + a2.find("jack",arr2));
		double arr1[] = {12,1,44,556,6346,23};
		A01 a1 = new A01();
		Double res = a1.max(arr1);
		if( res != null){
		System.out.println("arr1的最大值=" + res);
	}else{
		System.out.println("arr1为null,arr1输入有误");
	}
		int arr[] = {12,4234,545,6436,66,77,34};
		A03 a3 = new A03();
		a3.copyArr(arr);
	}
}
//先完成代码需求
//在考虑代码健壮性
class A01{
		public Double max(double arr[]){
			if (arr.length > 0 && arr != null){
			double max = arr[0];//假定第一个元素就是最大值
			for ( int i = 1; i < arr.length; i++){
				if ( max < arr[i]){
					max = arr[i];
				}
			}
			return max;
	}else{
	return null;}
}
}
class A02{
	//编写一个A02类，定义一个find，实现查找某字符是否在字符串组
	//并返回索引，如果找不到，返回-1
	public int find(String findStr, String strs[]){
		for ( int i = 0; i < strs.length; i++){
			if ( findStr.equals(strs[i])){
				return i;
			}
		}
		return -1;
	}
}
class A03{
	//实现数组的复制功能copyArr,输入旧数组，返回一个新的数组
	//元素和旧数组一样
	public int[] copyArr(int arr[]){
		int copyArr[] = new int[arr.length];
		for ( int i = 0; i < arr.length; i++){
			copyArr[i] = arr[i];
		}
		System.out.println("复制的数组=");
		for ( int i = 0; i < copyArr.length; i++){
		
		System.out.print(copyArr[i] + " ");

		}
		return copyArr;
	}
}