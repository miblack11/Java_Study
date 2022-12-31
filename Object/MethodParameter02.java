public class MethodParameter02{
	public static void main(String[] args){
		B b = new B();
		// int arr[] = {1, 2, 3};
		// b.test100(arr);
		// System.out.println("main的arr数组");
		// for ( int i = 0; i < arr.length; i++){
		// 	System.out.print(arr[i] + " ");
		// }
		// System.out.println();
		// 测试
		 Person q = new Person();
		 q.name = "jack";
		 q.age = 10;
		 b.test200(q);
		 System.out.println("main的q.age=" + q.age + " q.name=" + q.name);

	}
}
class Person{
	String name;
	int age;
}
class B {
	public void test200(Person q){
		q.age = 10000;
		q.name = "black";
	}
	// public void test100(int arr[]){
	// 	arr[0] = 200;
	// 	System.out.println("test100的 arr数组");
	// 	for ( int i = 0; i < arr.length; i++){
	// 		System.out.print(arr[i] + " ");
	// 	}
	// 	System.out.println();
	// }
}