
public class E0205_01 {

	public static void main(String[] args) {
		
		//type static variable is just once reset,
		//almost use to variable of class(static)
		
		//class variable must do access to classname.classvariablename
		//
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		//print  how long width, height an card 
		
		Card c1 = new Card(); // Object c1 declaration;
		c1.Kind = "Heart";
		c1.number = 9;
		
		
		Card c2 = new Card(); // Object c2 declaration;
		c2.Kind = "Spade";
		c2.number = 6;
		
		System.out.println("c1�� " + c1.Kind + ", " + c1.number
				+ "�̸�, ũ��� (" + c1.width + ", " + c1.height +")" );
		System.out.println("c2�� " + c2.Kind + ", " + c2.number
				+ "�̸�, ũ��� (" + c2.width + ", " + c2.height +")" );
		
		System.out.println("c1�� height�� width�� ���� 80,50���� ����");
		c1.width = 50;
		c1.height = 80;
		
		//
		//this code width,height value just not c1, because width,height are static value
		//and effect up to class card, c1 and c2 
		
		
		System.out.println("c1�� " + c1.Kind + ", " + c1.number
				+ "�̸�, ũ��� (" + c1.width + ", " + c1.height +")" );
		System.out.println("c2�� " + c2.Kind + ", " + c2.number
				+ "�̸�, ũ��� (" + c2.width + ", " + c2.height +")" );
		
	}
		
}


class Card{
	
	String Kind;
	int number;
	static int width = 100;
	static int height = 250;
	
	
}