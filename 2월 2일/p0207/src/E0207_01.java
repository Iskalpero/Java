public class E0207_01 {

	public static void main(String[] args) {
		
		Deck d = new Deck(); // deck construct.
		Card c = d.pick(0); // Diamond,1 
		System.out.println(c); // c.toString() 
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);	

	}

	
	
}

class Deck{
	
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];  // cardArr[52];
	
	Deck() {// construct
		
		int i = 0;
		
		for(int k = Card.KIND_MAX; k>0; k--)
			for(int n=0; n<Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1); // cardArr[0] = 4 - Diamond , 1 = (0+1)
	}
	
	Card pick(int index) {
		return cardArr[index]; //target position(index) one card pick & return;		
	}
	
	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index); // Random pick
	}
	
	void shuffle() {
		for(int i = 0; i< cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
		
	}
	
}


class Card{
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card(){ //constructer
		this(SPADE,1);
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;		
	}
	
	public String toString() {
		
		String[] kinds = {"", "CLOVER", "HEART", "SPADE", "DIAMOND"};
		String numbers = "0123456789XJQK"; // x means number 10
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
				
	}
	
	
}


