public class BitOperator02{
	public static void main(String[] args){
	//�������� >>����λ���,����λ����,���÷���λ������ĸ�λ
	//�������� <<: ����λ����,��λ�� 0
	//>>> �߼�����Ҳ���޷�������,���������: ��λ�������λ�� 0	
	int a = 1>>2; //1 => 00000001 => 00000000 ���� 1 / 2 / 2 =0
	int b = 23>>>2;
	int c = 1<<2; //1 => 00000001 => 00000100 ���� 1 * 2 * 2 = 4
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
		}
}