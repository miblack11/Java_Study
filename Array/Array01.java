public class Array01{
	public static void main(String[] args){
		//传统方法
		//它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
		//请问这六只鸡的总体重是多少?平均体重是多少?
			// double hen1 = 3;
			// double hen2 = 5;
			// double hen3 = 1;
			// double hen4 = 3.4;
			// double hen5 = 2;
			// double hen6 = 50;
			// double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
			// double avgWeight = totalWeight / 6;
			// System.out.println("总体重=" + totalWeight
			// + "平均体重=" + avgWeight);
			//1. 我们可以通过 hens[下标] 来访问数组的元素
			// 下标是从 0 开始编号的比如第一个元素就是 hens[0]
			// 第 2 个元素就是 hens[1] , 依次类推
			//2. 通过 for 就可以循环的访问 数组的元素/值
			////老师提示： 可以通过 数组名.length 得到数组的大小/长度
			double[] hens = {3 , 4 , 1 , 1.1 , 4.5};
			double totalWeight = 0;
			for (int i = 0; i < hens.length; i++){
				totalWeight += hens[i];
			}
			System.out.println("总的体重为" + totalWeight + "平均体重为" + totalWeight / hens.length);
	}
}