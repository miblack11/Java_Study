import java.util.Scanner;
public class HomeWork01{
	public static void main(String[] args){
		//ĳ����100000Ԫ��û����һ��·�ڣ���Ҫ�ɷѣ�����
		//1.���ֽ����50000ʱ��ÿ�ν�5%
		//2.���ֽ�<=50000ʱ��ÿ�ν�1000
		//������˿��Ծ�������·��
		//��while + break
		int count = 0;//��¼����
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������money");
		int money = scanner.nextInt();
		while(true){
			if (money > 50000 ){
				money *= 0.95;
				count++;
			}else if (money >= 1000){
				money -= 1000;
				count++;
			}else {
				break;
			}
			
		}
		System.out.println("���Ծ���" + count + "��·��");
	}
}