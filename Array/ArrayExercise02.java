public class ArrayExercise02{
	public static void main(String[] args){
		//请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。
		int maxArr = 0;
		int index = 1;
		int[] arr = {4, -1, 9, 10, 7};
		for ( int i = 0; i < arr.length; i++){
			if ( arr[i] > maxArr){
				maxArr = arr[i];
				index = i;
			}
		} 
		System.out.println(maxArr + " " + index);
	}
}