import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		// ��һ�����У���üӥ������ëʨ����������������������������Ϸ
		// ���Ӽ�������������һ�����ƣ��ж��������Ƿ�
		// ���������ơ�˳����ҡ� Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ��	
		String arr[] = { "��üӥ��", "��ëʨ��", "��������", "��������"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		String name = scanner.next();
		int index = -1;
		for ( int i = 0; i < arr.length; i++){
			if ( name.equals(arr[i])){
				System.out.println("��" + "\n" + "�ҵ����ڵ�" + i + "���±�");
				index = i;
				break;	
			  }//else if (i == arr.length - 1){
			// 	System.out.println("û��");
			//}	
		}
		if (index == -1){
				System.out.println("û��");
			}
	}
}