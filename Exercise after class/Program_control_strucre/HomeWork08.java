public class HomeWork08{
	public static void main(String[] args){
		//100��1 99��2 97��3
		int sum = 0;
		for(int i = 100; i > 0; i--){
			for ( int j = i; j >= 1; j--){
				 sum +=j;
			}
		} 
		System.out.println(sum);
	}
}