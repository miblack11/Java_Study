import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		//����1) ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
		// 2) ͳ�������༰��������ÿ������ 5 ��ͬѧ��
		Scanner scanner = new Scanner(System.in);
		int count = 0;//ͳ�Ƽ�������
		double sums = 0;//�ܵ�ƽ����
		System.out.println("�������ܹ��ж��ٰ༶");
		int classNum = scanner.nextInt();//�����ܵļ����༶
		System.out.println("������ÿ���༶�ж�����");
		int stydyNum = scanner.nextInt();//����ÿ��������
		for (int i = 1; i <= classNum; i++){
			double sum = 0;
			for (int people = 1; people <= stydyNum; people++){
				System.out.println(i + "���" + people + "�˳ɼ�");
				double score = scanner.nextDouble(); 
				if (score >= 60){
					count++;
				}
				sum += score;
				sums += score;
			}
			System.out.println(i + "��ƽ����Ϊ" + sum/stydyNum);
		}
		System.out.println(classNum  + "���༰������Ϊ" + count);
		System.out.println(classNum + "����ƽ����Ϊ" + sums/(classNum * stydyNum));
	}
}