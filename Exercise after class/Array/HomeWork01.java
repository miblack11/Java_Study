import java.util.Scanner;
public class HomeWork01{
	public static void main(String[] args){
		//��֪�и����������
		//Ҫ�����һ��Ԫ��
		//������˳����Ȼ������
		int arrApp[] = {10,12,45,90};
		int arrNew[] = new int[arrApp.length + 1];
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ�����Ԫ��");
		int arrNum = scanner.nextInt();
		arrNew[arrNew.length - 1] = arrNum;
		int temp = 0;
		for ( int i = 0; i < arrApp.length; i++){
			arrNew[i] = arrApp[i];
		}
		for ( int i = 0; i < arrNew.length -1; i++){
			for ( int j = 0; j < arrNew.length - 1 - i; j++){
				if ( arrNew[j] > arrNew[j + 1]){
					temp = arrNew[j];
					arrNew[j] = arrNew[j + 1];
					arrNew[j + 1] = temp;
				}
			}
		}
		arrApp = arrNew;
		for ( int i = 0; i < arrApp.length; i++){
			System.out.print(arrApp[i] + " ");
		}
	}
}