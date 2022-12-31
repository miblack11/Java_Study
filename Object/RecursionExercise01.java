public class RecursionExercise01{
	public static void main(String[] args){
		//쳲������� 1,1,2,3,5,8,13����һ������n���������ֵ�����
		Y y1 = new Y();
		int n = 40;
		int res = y1.fibonacci(n);
		System.out.println("��n=" + n + "ʱ��Ӧ��쳲�������=" + res);
		int day = 1;
		 int peachNum = y1.peach(day);
		 System.out.println(peachNum);
	}
}
class Y {
	/*
	��ʹ�õݹ�ķ�ʽ���쳲������� 1,1,2,3,5,8,13...����һ������ n���������ֵ�Ƕ�
	˼·����
	1. �� n = 1 쳲������� �� 1
	2. �� n = 2 쳲������� �� 1
	3. �� n >= 3 쳲������� ��ǰ�������ĺ�
	 */
	public int fibonacci( int n){
		if ( n == 1 || n == 2){
			return 1;
		}else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	/*
		���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
		�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ���������� 10 ��ʱ��
		���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ����⣺��������ٸ����ӣ�
		˼·���� ����
		1. day = 10 ʱ �� 1 ������
		2. day = 9 ʱ �� (day10 + 1) * 2 = 4
		3. day = 8 ʱ �� (day9 + 1) * 2 = 10
		4. ���ɾ��� ǰһ������� = (��һ������� + 1) *2//�������ǵ�����
		*/
	public int peach(int day){
		if ( day == 10){
			return 1;
		}else{
			return (peach(day+1) + 1) * 2;
		}
	}
}
