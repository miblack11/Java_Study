public class CharDetail{
	public static void main(String[] args){
		//��Java�У�char�ı�����һ����������Ĭ�����ʱ����Unicode���Ӧ���ַ�
		char c1 = 99;
		System.out.println(c1);//a
		//Ҫ�����Ӧ�����ֿ�����(int)ǿת
		char c2 = 'a';//���a��Ӧ������
		System.out.println((int)c2);
		//char���Ϳ��Խ�������ģ��൱��һ������
		char c3 = 'a' + 3;
		System.out.println(c3);//d
		System.out.println((int)c3);//100

	}
}