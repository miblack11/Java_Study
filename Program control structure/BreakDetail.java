public class BreakDetail{
	public static void main(String[] args){
		//break 出现在多层嵌套时候，可以通过标签(label)指明要
		//终止的是那层循环
		//一般不推荐使用label
		label1:
		for (int i = 0; i < 4; i++){
			label2:
			for ( int j = 0; j < 5; j++){
				if ( j == 3){
					break;
				}
				System.out.println("i = " + i + "j = " + j);
			}
		}
	}
}