public class HomeWork01{
	public static void main(String[] args){
		//��д��,���巽��max,ʵ����ĳ��double�����
		//���ֵ��������
		
		String arr2[] = {"j","ja","jack","zhu"};
		A02 a2 = new A02();
		System.out.println("���ص�����=" + a2.find("jack",arr2));
		double arr1[] = {12,1,44,556,6346,23};
		A01 a1 = new A01();
		Double res = a1.max(arr1);
		if( res != null){
		System.out.println("arr1�����ֵ=" + res);
	}else{
		System.out.println("arr1Ϊnull,arr1��������");
	}
		int arr[] = {12,4234,545,6436,66,77,34};
		A03 a3 = new A03();
		a3.copyArr(arr);
	}
}
//����ɴ�������
//�ڿ��Ǵ��뽡׳��
class A01{
		public Double max(double arr[]){
			if (arr.length > 0 && arr != null){
			double max = arr[0];//�ٶ���һ��Ԫ�ؾ������ֵ
			for ( int i = 1; i < arr.length; i++){
				if ( max < arr[i]){
					max = arr[i];
				}
			}
			return max;
	}else{
	return null;}
}
}
class A02{
	//��дһ��A02�࣬����һ��find��ʵ�ֲ���ĳ�ַ��Ƿ����ַ�����
	//����������������Ҳ���������-1
	public int find(String findStr, String strs[]){
		for ( int i = 0; i < strs.length; i++){
			if ( findStr.equals(strs[i])){
				return i;
			}
		}
		return -1;
	}
}
class A03{
	//ʵ������ĸ��ƹ���copyArr,��������飬����һ���µ�����
	//Ԫ�غ;�����һ��
	public int[] copyArr(int arr[]){
		int copyArr[] = new int[arr.length];
		for ( int i = 0; i < arr.length; i++){
			copyArr[i] = arr[i];
		}
		System.out.println("���Ƶ�����=");
		for ( int i = 0; i < copyArr.length; i++){
		
		System.out.print(copyArr[i] + " ");

		}
		return copyArr;
	}
}