import java.util.*; // Vector를 사용하기 위한 import

/*
 Vector는 보통 생성 Vector()하면 10개의 객체를 저장할 수 있다. 수가 많으면 크기는 동적으로 증가하는 형식이다.
 add(넣을거) 로 추가 remove(뺄거) 로 삭제
 isEmpty()로 비어있는지 boolean으로 결과를 체크해준다.
 size()는 벡터의 크기(개수)값을 리턴.
 */


class Product {
	int price;
	int bonusPoint;
	
	Product(int price){ // 생성자
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	
	Tv() {super(100);} // 조상클래스의 Product(100)와 같
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
	Vector item = new Vector(); // Vector 객체 선언.
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // 해당 제품을 벡터에 저장.
		System.out.println(p + "구입 완료");
	}
	
	void Refund(Product p) {
		
		if(item.remove(p)) { // 대상 제품을 벡터에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품 완료");
		}
		else {
			System.out.println("해당 제품을 구입하시지 않으셨습니다. 도둑이군요.");
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
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		System.out.println("보너스 포인트는 " +  bonusPoint + "만입니다.");
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
