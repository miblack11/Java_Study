public class TwoDimensionalArray02{
	public static void main(String[] args){
		//��ά����ı�﷽ʽ��
		//��һ��
		int arr[][] = new int[3][3];
		arr[1][1] = 3;//��ֵ
		//�ڶ���:
		// int arrNew[][];//������ά����
		// arrNew = new int[][];�ٿ��ռ�
		for ( int i = 0; i < arr.length; i++){
			for ( int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}