public class TwoDimensionalArray01{
	public static void main(String[] args){
			//���ö�ά�����������ͼ��:
			// 0 0 0 0 0 0
			// 0 0 1 0 0 0
			// 0 2 0 3 0 0
			// 0 0 0 0 0 0		
			// ����ĳ��Ԫ�أ�
			int arr[][] = {{0 ,0 ,0 ,0 ,0 ,0}, {0 ,0 ,1 ,0 ,0 ,0}, 
			               {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
			               System.out.println(arr[2][3]);//3
               for ( int i = 0; i < arr.length; i++){//������ά�����ÿ��Ԫ�أ�һά���飩
               	//arr.length��ʾ�� ��ά����ĳ���
               	//arr[i].length��ʾ����λ�����е�i��Ԫ�صĳ���
               	for ( int j = 0; j < arr[i].length; j++){//����һά�����ÿ��Ԫ��
               		System.out.print(arr[i][j] + " ");
               	}
               	System.out.println();
               }
	}
}