public class Method02{
	public static void main(String[] args){
		//请遍历一个数组 , 输出数组的各个元素值
		//传统办法
		//: 定义一个类 MyTools ,然后写一个成员方法，调用方法实现,看看效果又如何。
		//1) 提高代码的复用性
		//2) 可以将实现的细节封装起来，然后供其他用户来调用即可
		//代码
		int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		MyTools tool = new MyTools();
		// for ( int i = 0; i < map.length; i++){
		// 	for ( int j = 0; j < map[i].length; j++){
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		tool.printArr(map);
		// for ( int i = 0; i < map.length; i++){
		// 	for ( int j = 0; j < map[i].length; j++){
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		tool.printArr(map);
		// for ( int i = 0; i < map.length; i++){
		// 	for ( int j = 0; j < map[i].length; j++){
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		tool.printArr(map);
	}
}
class MyTools{
	public void printArr(int[][] map) {
		System.out.println("========");
		for ( int i = 0; i < map.length; i++){
			for ( int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}