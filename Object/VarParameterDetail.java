public class VarParameterDetail{
	public static void main(String[] args){
		//ϸ�ڣ��ɱ������ʵ�ο���������
		int arr[] = {2,4,5};
		Vpd v = new Vpd();
		v.sum(arr);
	}
}
class Vpd{
	public void sum(int...nums){
		System.out.println("����=" + nums.length);
	}
	//ϸ�ڣ��ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б�
	//�����뱣֤�ɱ���������
	//�ɱ�����ı��ʾ�������
	public void sum1(double n, double...ns){
		//����
	}
	// public void sum2(double...ns, int n){
	// 	������
	// }
}