public class ForceConvert{
	public static void main(String[] args){
		//强制转换
		//1.精度损失
		int n1 = (int)1.1;
		System.out.println("n1=" + n1);
		//2.数据溢出
		int n2 = 2222;
		byte n3 = (byte)n2;
		System.out.println("n3=" + n3);
	}
}