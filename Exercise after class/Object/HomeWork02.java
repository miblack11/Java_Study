public class HomeWork02{
	public static void main(String[] args){
		Book b = new Book("����¶�",129);
		b.updatePrice();
	}
}
class Book{
	//���巽��updatePrice,ʵ�ָ���ĳ����ļ۸񣬾��壺
	//����۸�>150,����ļ۸�Ϊ150,����۸�>100,����Ϊ100
	//���򲻱�
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	//û�оֲ��������Բ�дthis
	public void updatePrice(){
		if(price > 150){
			price = 150;
		}else if (price > 100){
			price = 100;
		}
		System.out.println("�۸���ĺ�ļ۸�=" + price);
	}
}
