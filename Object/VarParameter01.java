public class VarParameter01{
	public static void main(String[] args){
	 //看一个案例 类 HspMethod，方法 sum 
	 //可以计算 2 个数的和，3 个数的和 ， 4. 5，
	  HspMethod hm = new HspMethod();
	  System.out.println(hm.sum(23,43,124));
	}
}
class HspMethod{
	//方法重载
	// public int sum ( int i, int j){
	// 	return i + j;
	// }
	// public int sum ( int i, int j, int k){
	// 	return i + j + k;
	// }
	// 使用可变参数
	public int sum( int...nums){
		System.out.println("接收的参数个数为" + nums.length);
		int res = 0;
		for ( int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
}