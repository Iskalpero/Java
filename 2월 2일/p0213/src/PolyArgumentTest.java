import java.util.*; // Vector�� ����ϱ� ���� import

/*
 Vector�� ���� ���� Vector()�ϸ� 10���� ��ü�� ������ �� �ִ�. ���� ������ ũ��� �������� �����ϴ� �����̴�.
 add(������) �� �߰� remove(����) �� ����
 isEmpty()�� ����ִ��� boolean���� ����� üũ���ش�.
 size()�� ������ ũ��(����)���� ����.
 */


class Product {
	int price;
	int bonusPoint;
	
	Product(int price){ // ������
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	
	Tv() {super(100);} // ����Ŭ������ Product(100)�� ��
	public String toString() {return "Tv";}
	
}

class Computer extends Product{
	
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	
	Audio() {super(50);}
	public String toString() {return "Audio";}
	
}

class Buyer{
	
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // Vector ��ü ����.
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // �ش� ��ǰ�� ���Ϳ� ����.
		System.out.println(p + "���� �Ϸ�");
	}
	
	void Refund(Product p) {
		
		if(item.remove(p)) { // ��� ��ǰ�� ���Ϳ��� ����
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " ��ǰ �Ϸ�");
		}
		else {
			System.out.println("�ش� ��ǰ�� �����Ͻ��� �����̽��ϴ�. �����̱���.");
		}
		
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " +p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("���ʽ� ����Ʈ�� " +  bonusPoint + "���Դϴ�.");
	}
	
	
}


public class PolyArgumentTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Buyer b = new Buyer(); //
		Computer com = new Computer();
		Audio audio = new Audio();
	
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		b.Refund(tv);
		b.summary();
		

	}

}
