import java.util.Scanner;
public class IfExercise01{
	public static void main(String[] args){
		//���󣺲μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭��
		//���Ҹ����Ա���ʾ�����������Ů���顣
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ�");
		double score = scanner.nextDouble();
				if (score > 8.0 ){
		System.out.println("�������Ա�");
		char gender = scanner.next().charAt(0);

			if(gender == '��'){
				System.out.println("��ϲ�������Ӿ���");
			}else if(gender == 'Ů'){
				System.out.println("��ϲ����Ů�Ӿ���");
			}else{
				System.out.println("�������");
			}
		}else {System.out.println("��Ǹ���㱻��̭��");
	  }
	}
}