public class HomeWork03{
	public static void main(String[] args){
		int arr[] = new int[10];
		int arrNew[] = new int[arr.length];
		int sum = 0;
		int max = 0;
		int index = 0;
		for ( int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100);//保存到数组
			if (max < arr[i]){
				max = arr[i];
				index = i;
			}
			if (arr[i] == 8){
				System.out.println("\n" + "随机生成的数有8");
			}
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println( " \n" + "逆序输出=");
		for ( int i = 0,j = arr.length - 1; i < arr.length; i++,j--){
			arrNew[i] = arr[j];
			System.out.print(arrNew[i] +" ");
		}
		System.out.println( "\n" + "平均值=" + sum / arr.length);
		System.out.println("最大值=" + max + "最大值的下标=" + index);
	}
}