public class HomeWork03{
	public static void main(String[] args){
		int arr[] = new int[10];
		int arrNew[] = new int[arr.length];
		int sum = 0;
		int max = 0;
		int index = 0;
		for ( int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100);//���浽����
			if (max < arr[i]){
				max = arr[i];
				index = i;
			}
			if (arr[i] == 8){
				System.out.println("\n" + "������ɵ�����8");
			}
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println( " \n" + "�������=");
		for ( int i = 0,j = arr.length - 1; i < arr.length; i++,j--){
			arrNew[i] = arr[j];
			System.out.print(arrNew[i] +" ");
		}
		System.out.println( "\n" + "ƽ��ֵ=" + sum / arr.length);
		System.out.println("���ֵ=" + max + "���ֵ���±�=" + index);
	}
}