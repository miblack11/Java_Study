import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args){
		//有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩
		//下最后一个元素，提示，不能再缩减。
		int[] arr = {1 , 2, 3, 4, 5}; 
		Scanner scanner = new Scanner(System.in);
		int k = 1;
		while(true){
			System.out.println("是否缩减一个元素, y / n");
			char key = scanner.next().charAt(0);
			if (k == 5){
				System.out.println("不能再缩减");
				break;
			}else if (key == 'n'){
				System.out.println("退出缩减程序");
				break;
			}
			int[] newArr = new int[arr.length - 1];
			for ( int i = 0; i < newArr.length; i++){
				newArr[i] = arr[i];
			}
			arr = newArr;
			k++;
			System.out.println("缩减效果图");
			for ( int j = 0; j < arr.length; j++){
				System.out.print(arr[j]);
			}
			System.out.println(" ");
		}
		System.out.print("最后的结果为\t");
		for (int b = 0; b < arr.length; b++){
			System.out.print(arr[b] + "\t");
		}
	}
}