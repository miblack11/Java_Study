import java.util.Scanner;
public class DoWhileExercise01{
	public static void main(String[] args){
		//����:
		//1.��ӡ 1��100 [ѧ����]
		// 2) ���� 1��100 �ĺ� [ѧ����]
		// 3) ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = scanner.nextInt();
		System.out.println("�������������");
		int end = scanner.nextInt();
		int i = start;
		int sum = 0;
		int count = 0;
		do{
			if (i % 5 == 0 && i % 3 != 0){
				System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}while(i <= end);
		System.out.println("�ܺ�" + sum);
		System.out.println("�ܸ���" + count);
	}
}