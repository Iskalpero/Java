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

 ������ ������Ʈ�� �񱳺м��ϴ� ������ ����� ��
 ������Ʈ���� �� �����ؾߵ����� ��Ŭ������ ���� ���� �߿��� �� ������Ʈ ���� ���� �ִ� .project �̴�.
 �̰� notepad++�� ����
 <projectDescription>
	<name>������Ʈ��</name>
	... ���� ������Ʈ���� ��������� �Ѵ�.



*/