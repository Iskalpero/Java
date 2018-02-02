class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelup() { channel++;}
	void channeldown() { channel--;}
	
}// class tv and parameters and function call


public class TvTest {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
		tv.color = "Black";
		tv.channel = 6;
		tv.channelup();
		//call
		System.out.println("channel? : " + tv.channel +"\n color? : " + tv.color);
		
		

	}

}
/*

 동일한 프로젝트를 비교분석하는 용으로 사용할 때
 프로젝트파일 명도 구분해야되지만 이클립스로 열때 가장 중요한 건 프로젝트 파일 내에 있는 .project 이다.
 이걸 notepad++로 열면
 <projectDescription>
	<name>프로젝트명</name>
	... 에서 프로젝트명을 구분지어야 한다.



*/