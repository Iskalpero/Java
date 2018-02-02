class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelup() { channel++;}
	void channeldown() { channel--;}
	
}


public class TvTest {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		tv.color = "Black";
		tv.channel = 6;
		tv.channelup();
		
		System.out.println("channel? : " + tv.channel +"\n color? : " + tv.color);
		
		

	}

}
