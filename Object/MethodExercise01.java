public class MethodExercise01{
	public static void main(String[] args){
		//1) ��д�� AA ����һ��������
		//�ж�һ���������� odd ����ż��, ���� boolean
		AA a = new AA();
		if(a.isOdd(55)){//T
			System.out.println("������");
		}else{
			System.out.println("��ż��");
		}
		a.print(4,4,'$');
	}
}
class AA {
	public boolean isOdd(int num){
		// if (num % 2 != 0){
		// 	return true;
		// }else {
		// 	return false;
		// }
		//��Ԫ�������
		return num % 2 != 0 ?  true : false;
	}
	// 2) �����С��С��ַ���ӡ ��Ӧ�������������ַ���
	// ���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
	public void print(int row,int col,char c){
		for (int i = 1; i<= row; i++){
			for ( int j = 1; j <= col; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}