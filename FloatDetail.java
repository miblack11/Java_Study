public class FloatDetail{
	public static void main(String[] args){
		//1.folat�ͳ�������������f/F
		//float num1 = 1.1;//����
		float num2 = 1.1F;//����
		//2.��ת�Ϳ��ԣ���ת�߲���
		double num3 = 1.1F;
		//��ѧ��������5.12e2[5.12*10^2]  5.12E -2 [5.12/10^2]
		System.out.println(5.12e2);
		System.out.println(5.12E-2);
		//������ʹ������
		double num11 = 2.7;
		double num12 = 8.1 / 3;//�ӽ�2.7������2.7
		//�õ�һ����Ҫ�Ľ��ۣ������Ƕ���������С����������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ����ֵ����ĳ�����ȷ�Χ�ж�
		if( num11 == num12){
			System.out.println("����ģ��������");//����
		}
		if (Math.abs(num11 - num12) < 0.000001){
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ�����");
		}

	}
}