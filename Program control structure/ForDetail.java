public class ForDetail{
	public static void main(String[] args){
		// 1) ѭ�������Ƿ���һ������ֵ�ı��ʽ
		// 2) for(;ѭ���ж�����;) �еĳ�ʼ���ͱ�����������д�������ط����������ߵķֺŲ���ʡ�ԡ�
		// 3) ѭ����ʼֵ�����ж�����ʼ����䣬��Ҫ������һ���������м��ö��Ÿ�����ѭ����������Ҳ�����ж�����������
		// ��䣬�м��ö��Ÿ���
		int i = 1;
		for (; i <= 10;){
				System.out.println("hello,world");
				i++;
		}
		
		for (int j = 1 , n = 1; j <= 5; j++,n += 3){
			System.out.println("j=" + j + "n=" + n);
		}
	}
}