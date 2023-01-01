public class MiGong{
	public static void main(String[] args){
		//思路：
		//先创建一个二维数组map
		int map[][] = new int[8][7];

		for ( int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for ( int i = 0; i < 8; i ++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1; //测试回溯
		// map[2][1] = 1;
		// map[2][2] = 1;
		// map[1][2] = 1;
		System.out.println("迷宫地图情况");
		for ( int i = 0; i < map.length; i++){
			for ( int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		 P p = new P();
		p.findWay(map,1,1);//方法1
		// p.findWay2(map,1,1);
		System.out.println("\n====找路的情况如下=====");
		for(int i = 0; i < map.length; i++) {
		for(int j = 0; j < map[i].length; j++) {
		System.out.print(map[i][j] + " ");//输出一行
		}
		System.out.println();
		}
		}
}
class P {
//使用递归回溯的思想来解决老鼠出迷宫
//1. findWay 方法就是专门来找出迷宫的路径
//2. 如果找到，就返回 true ,否则返回 false
//3. map 就是二维数组，即表示迷宫
//4. i,j 就是老鼠的位置，初始化的位置为(1,1)
//5. 因为我们是递归的找路，所以我先规定 map 数组的各个值的含义
// 0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
//6. 当 map[6][5] =2 就说明找到通路,就可以结束，否则就继续找. //7. 先确定老鼠找路策略 
//下->右->上->左
	public boolean findWay(int map[][],int i, int j){
		if ( map[6][5] == 2){
			return true;
		}else{
			if ( map[i][j] == 0){
				map[i][j] = 2;
				if(findWay(map,i + 1, j)){
					return true;
				}else if(findWay(map, i, j + 1)){
					return true;
				}else if ( findWay(map,i - 1, j)){
					return true;
				}else if ( findWay(map,i, j - 1)){
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
	public boolean findWay2(int map[][], int i, int j){
		//c策略  上 右 下 左 
		if (map[6][5] == 2){
			return true;
		}else {
			if ( map[i][j] == 0){
				map[i][j] = 2;
				if ( findWay2(map,i - 1, j)){
					return true;
				}else if ( findWay2(map, i, j + 1)){
					return true;
				}else if (findWay2(map, i + 1, j)){
					return true;
				}else if ( findWay2(map, i, j - 1)){
					return true;
				}else {
					map[i][j] = 3;
					return false;
				}
			}else {
				return false;
			}
		}
	}
}