public class ContinueDetail{
	public static void main(String[] args){
		label1:
		for ( int i = 1; i <= 3; i++){
			label2:
			for(int j = 1; j <= 5; j++){
				if ( j == 4){
					continue label1;//语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环 , 这个和前面的标签的
							//使用的规则一样
				}
				System.out.println("j = " + j);
			}
		}
	}
}