public class VarScope{
	public static void main(String[] args){
		Cat00 c0 = new Cat00();
		c0.hi();
		c0.cry();
		c0.eat();
	}
}
class Cat00{
	//全局变量：也就是属性，作用域为整个类体
	//属性在定义的时候可以直接赋值
	int age = 10;
	//全局变量（属性）也可以不赋值，直接使用，因为又默认值
	double weight;
	public void hi(){
		//局部变量必须赋值后使用，因为没有默认值
		int num = 11;
		String address = "北京";
		//在hi方法里面使用全局变量
		System.out.println(weight);
	}
	public void cry(){
		//1.局部变量一般是指在成员方法中定义的变量
		//2. n 和 name 就是局部变量
		//3. n 和 name 的作用域在cry方法中
		int n = 11;
		String name = "javk";
		System.out.println("在cry中使用属性age=" + age);
	}
	public void eat(){
		System.out.println("在eat中使用属性age=" + age);
		//System.out.println("在eat中使用cry的变量name=" + name);不可以
	} 
}