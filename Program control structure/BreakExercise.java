import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
		//1-100 ���ڵ�����ͣ���� ���� ��һ�δ��� 20 �ĵ�ǰ��
		int sum = 0;
		for ( int i = 1; i <= 100; i++){
			sum += i;
			if ( sum > 20){
				System.out.println(i);
				break;
			}
		}
		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ��ʹ�� for+break
        //���
        Scanner scanner = new Scanner(System.in);
       for ( int i = 2; i >= 0; i--){
       		System.out.println("�������û���");
       		String name =scanner.next();
       		if ("����".equals(name)){
       			System.out.println("����������");
       			int possword = scanner.nextInt();
       			if (possword == 666){
       				System.out.println("��ϲ����");
       				break;
       			}
       		}else{
       			System.out.println("�㻹��" + i + "�λ���");
       		}
       }
	}
}