import java.util.Scanner;
public class WhileExercise{
	public static void main(String[] args){
		//����
		//1) ��ӡ 1��100 ֮�������ܱ� 3 �������� [ʹ�� while, ��ʦ���� ]
 		//2) ��ӡ 40��200 ֮�����е�ż�� [ʹ�� while, �κ���ϰ]
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("�����뿪ʼ����");
	 int start = scanner.nextInt();
	 System.out.println("�������������");
	 int end = scanner.nextInt();
	 System.out.println("�����뱶��");
	 int multiple = scanner.nextInt();		
	 int i = start;
	 while(i <= end){
	 	if (i % multiple == 0){
	 		System.out.println(i);
	 	}
	 	i++;
	 }
	}
}