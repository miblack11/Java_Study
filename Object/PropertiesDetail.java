public class PropertiesDetail{
	public static void main(String[] args){
		//创建Person对象
		//P1 是对象名（对象引用）
		//new Person() 创建的对象空间（数据）才是真正的对象
		Person p1 = new Person();
		//对象的属性默认值，遵守数组规则：
		//int 0，short 0, byte 0, long 0, float 0.0,double 0.0，
		//char \u0000，boolean false，String null
		System.out.println("\n" + "age=" + p1.age + " " + "name=" + 
			p1.name  + " "+ "sal=" + p1.sal +  " " + "isPass=" + p1.isPass + 
			" " + "a=" + p1.a);
	}
}
class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	char a;
}