public class HanoiTower{
	public static void main(String[] args){
		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}
class Tower{
	/*
	num ��ʾҪ�ƶ��ĸ��� a b c ��ʾ A�� B�� C��
	 */
	public void move ( int num, char a, char b, char c){
		//���ֻ��һ���� num = 1
		if ( num == 1 ){
			System.out.println(a + "->" + c);
		}else{
			//����ж���̣����Կ�����������������Ǹ������������̣�num - 1)
			//���ƶ�������̵�B ����c
			move(num - 1, a,c,b);
			//���ƶ�������̣���c
			System.out.println(a + "->" + c);
			//�ڰ�b�����������ƶ���c
			move(num - 1, b, a, c);
		}
	}
}