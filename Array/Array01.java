public class Array01{
	public static void main(String[] args){
		//��ͳ����
		//���ǵ����طֱ��� 3kg,5kg,1kg,3.4kg,2kg,50kg ��
		//��������ֻ�����������Ƕ���?ƽ�������Ƕ���?
			// double hen1 = 3;
			// double hen2 = 5;
			// double hen3 = 1;
			// double hen4 = 3.4;
			// double hen5 = 2;
			// double hen6 = 50;
			// double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
			// double avgWeight = totalWeight / 6;
			// System.out.println("������=" + totalWeight
			// + "ƽ������=" + avgWeight);
			//1. ���ǿ���ͨ�� hens[�±�] �����������Ԫ��
			// �±��Ǵ� 0 ��ʼ��ŵı����һ��Ԫ�ؾ��� hens[0]
			// �� 2 ��Ԫ�ؾ��� hens[1] , ��������
			//2. ͨ�� for �Ϳ���ѭ���ķ��� �����Ԫ��/ֵ
			////��ʦ��ʾ�� ����ͨ�� ������.length �õ�����Ĵ�С/����
			double[] hens = {3 , 4 , 1 , 1.1 , 4.5};
			double totalWeight = 0;
			for (int i = 0; i < hens.length; i++){
				totalWeight += hens[i];
			}
			System.out.println("�ܵ�����Ϊ" + totalWeight + "ƽ������Ϊ" + totalWeight / hens.length);
	}
}