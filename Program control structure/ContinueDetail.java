public class ContinueDetail{
	public static void main(String[] args){
		label1:
		for ( int i = 1; i <= 3; i++){
			label2:
			for(int j = 1; j <= 5; j++){
				if ( j == 4){
					continue label1;//�������ڶ��Ƕ�׵�ѭ���������ʱ������ͨ����ǩָ��Ҫ����������һ��ѭ�� , �����ǰ��ı�ǩ��
							//ʹ�õĹ���һ��
				}
				System.out.println("j = " + j);
			}
		}
	}
}