public class Method02{
	public static void main(String[] args){
		//�����һ������ , �������ĸ���Ԫ��ֵ
		//��ͳ�취
		//: ����һ���� MyTools ,Ȼ��дһ����Ա���������÷���ʵ��,����Ч������Ρ�
		//1) ��ߴ���ĸ�����
		//2) ���Խ�ʵ�ֵ�ϸ�ڷ�װ������Ȼ�������û������ü���
		//����
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