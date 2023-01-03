public class HomeWork07{
	public static void main(String[] args){
		//Çó³ö1/1- 1/2 + 1/3 - 1/4 1/(i)
		//-1*-1/1 + -1 * 1 / 2   x * -1/i + 
		int x = 1;
		double sum = 0;
		for(double i = 1; i <= 100; i++){
			x = x * (-1);
			sum += x * (-1) / i;
		}
		System.out.println(sum);
	}
}