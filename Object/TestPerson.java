public class TestPerson{
	public static void main(String[] args){
		Person98 p1 = new Person98("mary", 20);
		Person98 p2 = new Person98("mary", 20);
		System.out.println("p1 和 p2 比较的结果=" + p1.compareTo(p2));
	}
}
/*
定义 Person 类，里面有 name、age 属性，并提供 compareTo 比较方法，
用于判断是否和另一个人相等，提供测试类 TestPerson 用于测试, 
名字和年龄完全一样，就返回 true, 否则返回 false
*/
class Person98{
	String name;
	int age;
	//构造器
	public Person98(String name, int age){
		this.name = name;
		this.age = age;
	}
	// compareTo比较方法
	public boolean compareTo(Person98 p){
		//名字和年龄完全一样
		// if(this.name.equals(p.name) && this.age == p.age) {
		// return true;
		// } else {
		// return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}