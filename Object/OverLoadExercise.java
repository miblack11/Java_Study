public class OverLoadExercise{
	public static void main(String[] args){
		Methods method = new Methods();
		method.m(3);
		method.m(3,6);
		method.m("���Ͱ�");
		int max1 = method.max(34,53);
		double max2 = method.max(3.3,5.3);
		double max3 = method.max(3.3,5.3,66);
		System.out.println(max1 + " "+ max2 + " " + max3);
	}
}
class Methods{
	public void m(int n){
		System.out.println("���=" + n * n);
	}
	public void m(int i,int j){
       System.out.println("���=" + (i * j));
	}
	public void m(String a){
		System.out.println("����ַ���=" + a);
	}
	public int max( int i, int j){
		return i > j ? i : j; 
	}public double max( double i, double j){
		return i > j ? i : j;
	}public double max ( double i, double j, double k){
		
	   double max = i > j ? i : j;
	   return max > k ? max : k;
	}

}