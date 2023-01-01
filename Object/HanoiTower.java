public class HanoiTower{
	public static void main(String[] args){
		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}
class Tower{
	/*
	num 表示要移动的个数 a b c 表示 A塔 B塔 C塔
	 */
	public void move ( int num, char a, char b, char c){
		//如果只有一个盘 num = 1
		if ( num == 1 ){
			System.out.println(a + "->" + c);
		}else{
			//如果有多个盘，可以看成两个，最下面的那个和上面所有盘（num - 1)
			//先移动上面的盘到B 借助c
			move(num - 1, a,c,b);
			//在移动下面的盘，到c
			System.out.println(a + "->" + c);
			//在把b塔上所有盘移动到c
			move(num - 1, b, a, c);
		}
	}
}