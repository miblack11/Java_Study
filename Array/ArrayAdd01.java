import java.util.Scanner;
public class ArrayAdd01{
	public static void main(String[] args){
		//Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
		// 1) ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
		// 2) ���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4}
		// 3) �û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n
		int[] arr = {1, 2, 3};
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("��Ҫ���ݵ���Ϊ");
			int newNum = scanner.nextInt();
		int[] arrNew = new int[arr.length + 1];//���� arr ���飬���ν� arr ��Ԫ�ؿ����� arrNew ����
		for ( int j = 0; j < arr.length; j++){
			arrNew[j] = arr[j];
		  }
		arrNew[arrNew.length - 1] = newNum;
		arr = arrNew;
		System.out.println("�Ƿ��������'y'/'n'");
		char key = scanner.next().charAt(0);
		if ( key == 'n'){
		 break;
		}	
		}while(true);
		// �� 4 ���� arrNew[arrNew.length - 1] = 4;�� 4 ���� arrNew ���һ��Ԫ��
		// //. �� arr ָ�� arrNew ; arr = arrNew; ��ô ԭ�� arr ����ͱ�����
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}