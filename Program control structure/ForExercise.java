import java.util.Scanner;
public class ForExercise{
	public static void main(String[] args){
		//����
		////��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� �� �ܺ�.[����Ϊ��,�������]
		//�Ϻ����������˼��(����)
		//1. ����Ϊ�� : �������ӵ����󣬲��ɼ򵥵���������� ��� = ˼�� --��ϰ-> ����
		//2. ������� : �ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = scanner.nextInt();
		System.out.println("�������������");
		int end = scanner.nextInt();
		System.out.println("��������ٱ���");
		int multiple = scanner.nextInt();
		int count = 0;
		int sum = 0;
		for (int i = start; i <= end; i++){
			if ( i % multiple == 0){
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		System.out.println("�ܸ���" + count);
		System.out.println("�ϼ�" + sum);

	}
}