public class ArrayReverse{
	public static void main(String[] args){
		// Ҫ�󣺰������Ԫ�����ݷ�ת�� 
		// arr {11,22,33,44,55,66} {66, 55,44,33,22,11}
		// ��һ�ַ������ҹ���
		// arr[0] �� arr [5] ����
		// arr[1] �� arr [4] ����
		// arr[2] �� arr [3] ����
		// ����3��length/2
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		// int temp = 0;
		// for ( int i = 0; i < arr1.length/2; i++){
		// 	temp = arr1[arr1.length - 1 - i];
		// 	arr1[arr1.length - 1 - i] = arr1[i];
		// 	arr1[i] = temp;
			
		// }
		// for (int j = 0; j < arr1.length; j++){
		// 	System.out.println(arr1[j]);
		// }
		//�ڶ��ַ���
		//�������
		int[] arr2 = new int[arr1.length];
		System.out.println("=================");
		for ( int a = arr1.length - 1, b = 0; a >= 0; a--, b++){
			arr2[b] = arr1[a];
		}
		//5. �� arr ָ�� arr2 ���ݿռ�, ��ʱ arr ԭ�������ݿռ��û�б�������
// �ᱻ��������������
		arr1 = arr2;
		System.out.println("====arr ��Ԫ�����=====");
		//6. ��� arr ����
		for(int c = 0; c < arr1.length; c++) {
				System.out.println(arr1[c]);
			}
		}
	}