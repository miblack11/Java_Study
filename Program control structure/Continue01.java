public class Continue01{
	public static void main(String[] args){
		int i = 1;
		while( i <= 6){
			i++;
			if (i == 3){
				continue;//���ڽ�������ѭ��������ִ����һ��ѭ����
			}
			System.out.println("i = " + i);
		}
	}
}