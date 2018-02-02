class Tve{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}

class TvTestO {
	public static void main(String[] args) {
		Tve t;
		t = new Tve();  // Tv t= new Tv();
		t.channel=7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
		
	}

}
