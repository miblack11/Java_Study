import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args){
		//��һ������ {1�� 2�� 3�� 4�� 5}�� ���Խ������������������ʾ�û��Ƿ����������ÿ����������Ǹ�Ԫ�ء���ֻʣ
		//�����һ��Ԫ�أ���ʾ��������������
		int[] arr = {1 , 2, 3, 4, 5}; 
		Scanner scanner = new Scanner(System.in);
		int k = 1;
		while(true){
			System.out.println("�Ƿ�����һ��Ԫ��, y / n");
			char key = scanner.next().charAt(0);
			if (k == 5){
				System.out.println("����������");
				break;
			}else if (key == 'n'){
				System.out.println("�˳���������");
				break;
			}
			int[] newArr = new int[arr.length - 1];
			for ( int i = 0; i < newArr.length; i++){
				newArr[i] = arr[i];
			}
			arr = newArr;
			k++;
			System.out.println("����Ч��ͼ");
			for ( int j = 0; j < arr.length; j++){
				System.out.print(arr[j]);
			}
			System.out.println(" ");
		}
		System.out.print("���Ľ��Ϊ\t");
		for (int b = 0; b < arr.length; b++){
			System.out.print(arr[b] + "\t");
		}
	}
}