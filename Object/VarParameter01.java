public class VarParameter01{
	public static void main(String[] args){
	 //��һ������ �� HspMethod������ sum 
	 //���Լ��� 2 �����ĺͣ�3 �����ĺ� �� 4. 5��
	  HspMethod hm = new HspMethod();
	  System.out.println(hm.sum(23,43,124));
	}
}
class HspMethod{
	//��������
	// public int sum ( int i, int j){
	// 	return i + j;
	// }
	// public int sum ( int i, int j, int k){
	// 	return i + j + k;
	// }
	// ʹ�ÿɱ����
	public int sum( int...nums){
		System.out.println("���յĲ�������Ϊ" + nums.length);
		int res = 0;
		for ( int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
}