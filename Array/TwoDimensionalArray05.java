public class TwoDimensionalArray05{
	public static void main(String[] args){
	//int arr[][]={{4,6},{1,4,5,7},{-2}};
	// �����ö�ά���飬���õ���
	int arr[][]={{4,6},{1,4,5,7},{-2}};
	int sum = 0;
	for(int i = 0; i < arr.length; i++){
			for ( int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}