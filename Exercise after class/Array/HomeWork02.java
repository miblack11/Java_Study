import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		//已知有个升序的数组
		//要求插入一个元素
		//该数组顺序依然是升序
		int arrApp[] = {10,12,45,90};
		int index = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要插入的元素");
		int arrNum = scanner.nextInt();
		for ( int i = 0; i < arrApp.length; i++){
			if(arrNum <= arrApp[i]){
				index = i;
				break;
			}else{
				index = arrApp.length;
			}
		}
		int arrNew[] = new int[arrApp.length + 1]; 
		for ( int i = 0, j = 0; i < arrNew.length; i++){
			if ( i != index){
				arrNew[i] = arrApp[j];
				j++;
			}else{
				arrNew[index] = arrNum; 
			}
		}
        arrApp = arrNew;
        for ( int i = 0; i < arrApp.length; i++){
        	System.out.print(arrApp[i] + " ");
        }
		}
}