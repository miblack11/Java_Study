public class TwoDimensionalArray03{
	public static void main(String[] args){
		/*
		��һ�����󣺶�̬���������ά���飬�����
		i = 0: 1
		i = 1: 2 2
		i = 2: 3 3 3 һ��������һά����, ÿ��һά�����Ԫ���ǲ�һ����
		*/
		int arr[][] = new int[3][];
		for ( int i = 0; i < arr.length; i ++){//���ռ�
			arr[i] = new int[i + 1];//���û�и�һά���� new ,��ô arr[i]���� null
			for ( int j = 0; j < arr[i].length; j++){//����ÿ��һά���飬
				arr[i][j] = i + 1;//��ֵ
			}
		}
		for ( int i = 0; i < arr.length; i ++){
			for ( int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

	}
}