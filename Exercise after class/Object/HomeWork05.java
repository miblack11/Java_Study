public class HomeWork05{
	public static void main(String[] args){
		Dog d = new Dog("旺财","黄色",3);
		d.show();
	}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show(){
		System.out.println("Dog的基本信息:" + "name=" + name + " " + "color=" + color + " " + "age=" + age);
	}
}