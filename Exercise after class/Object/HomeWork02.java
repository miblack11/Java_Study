public class HomeWork02{
	public static void main(String[] args){
		Book b = new Book("百年孤独",129);
		b.updatePrice();
	}
}
class Book{
	//定义方法updatePrice,实现更改某本书的价格，具体：
	//如果价格>150,则更改价格为150,如果价格>100,更改为100
	//否则不变
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	//没有局部变量可以不写this
	public void updatePrice(){
		if(price > 150){
			price = 150;
		}else if (price > 100){
			price = 100;
		}
		System.out.println("价格更改后的价格=" + price);
	}
}
