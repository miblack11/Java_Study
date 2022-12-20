public class BitOperator02{
	public static void main(String[] args){
	//算术右移 >>：低位溢出,符号位不变,并用符号位补溢出的高位
	//算术左移 <<: 符号位不变,低位补 0
	//>>> 逻辑右移也叫无符号右移,运算规则是: 低位溢出，高位补 0	
	int a = 1>>2; //1 => 00000001 => 00000000 本质 1 / 2 / 2 =0
	int b = 23>>>2;
	int c = 1<<2; //1 => 00000001 => 00000100 本质 1 * 2 * 2 = 4
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
		}
}