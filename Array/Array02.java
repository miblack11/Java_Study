import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		//��ʾ �������� ������[]=new ��������[��С]
		//ѭ������ 5 ���ɼ������浽 double ����,�����
		//��һ��
		double[] scores = new double[5];
		//�ڶ���
		// double[] scores; �ȶ���һ������
		// scores = new double[5]; ����ռ�
		// ѭ������
		Scanner scanner = new Scanner(System.in);
		for ( int i = 0; i < scores.length; i++){
			System.out.println("�������"+(i+1)+"λͬѧ�ɼ�");
			 scores[i] = scanner.nextDouble();
			System.out.println("��"+(i + 1)+"λͬѧ�ɼ�=" + scores[i]);
		}
	}
}