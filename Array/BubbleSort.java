public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {24, 69, 80, 57, 13, 33, 55, 66666, 7777444};
		int temp = 0;
		for ( int i = 0; i <= arr.length - 1; i++){//循环次数
			for ( int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1] ){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("\n" + "第"+ ( i + 1) +"轮======");
			for ( int k = 0; k < arr.length; k++){
			System.out.print(arr[k] + "\t");
		}
		}
		
	}
}