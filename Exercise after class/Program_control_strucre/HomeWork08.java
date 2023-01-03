public class HomeWork08{
	public static void main(String[] args){
		//100¸ö1 99¸ö2 97¸ö3
		int sum = 0;
		for(int i = 100; i > 0; i--){
			for ( int j = i; j >= 1; j--){
				 sum +=j;
			}
		} 
		System.out.println(sum);
	}
}