import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		// 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏
		// ：从键盘中任意输入一个名称，判断数列中是否
		// 包含此名称【顺序查找】 要求: 如果找到了，就提示找到，并给出下标值。	
		String arr[] = { "白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查找的名称");
		String name = scanner.next();
		int index = -1;
		for ( int i = 0; i < arr.length; i++){
			if ( name.equals(arr[i])){
				System.out.println("有" + "\n" + "找到了在第" + i + "处下标");
				index = i;
				break;	
			  }//else if (i == arr.length - 1){
			// 	System.out.println("没有");
			//}	
		}
		if (index == -1){
				System.out.println("没有");
			}
	}
}