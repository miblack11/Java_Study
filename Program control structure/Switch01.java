import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		/*
		������Switch01.java
		���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
		a ��ʾ����һ��b ��ʾ���ڶ� ��
		�����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������
		*/
	 	Scanner scanner = new Scanner(System.in);
	 	System.out.println("�������ַ�a-g");
	 	char n1 = scanner.next().charAt(0);
	 	switch (n1){
	 		case 'a':
	 		System.out.println("����������һ");
	 		break;
	 		case 'b' :
	 		System.out.println("���������ڶ�");
	 		break;
	 		case 'c' :
	 		System.out.println("������������");
	 		break;
	 		case 'd' :
	 		System.out.println("������������");
	 		break;
	 		case 'e' :
	 		System.out.println("������������");
	 		break;
	 		case 'f' :
	 		System.out.println("������������");
	 		break;
	 		case 'g' :
	 		System.out.println("������������");
	 		break;
	 		default : 
	 		System.out.println("�������");
	 		break;
	 	}
	}
}