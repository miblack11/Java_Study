public class BreakDetail{
	public static void main(String[] args){
		//break �����ڶ��Ƕ��ʱ�򣬿���ͨ����ǩ(label)ָ��Ҫ
		//��ֹ�����ǲ�ѭ��
		//һ�㲻�Ƽ�ʹ��label
		label1:
		for (int i = 0; i < 4; i++){
			label2:
			for ( int j = 0; j < 5; j++){
				if ( j == 3){
					break;
				}
				System.out.println("i = " + i + "j = " + j);
			}
		}
	}
}