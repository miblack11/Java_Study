public class HomeWork05{
	public static void main(String[] args){
		Dog d = new Dog("����","��ɫ",3);
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
		System.out.println("Dog�Ļ�����Ϣ:" + "name=" + name + " " + "color=" + color + " " + "age=" + age);
	}
}