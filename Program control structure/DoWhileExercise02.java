import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		//����
		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
		Scanner scanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("�Ϻ�ʹ��������");
			System.out.println("��Ǯ��(y/n)��");
			answer = scanner.next().charAt(0);
		}while(answer != 'y');
		System.out.println("���ڻ�Ǯ�ˣ����Ҿʹ�����");
	}
}