
public class Ex_Polymorphism01 {

	public static void main(String[] args) {
		Car car = null; // ��ü car ����.
		FireEngine fe = new FireEngine(); // ��ü fe����.
		FireEngine fe2 = null; 
		
		fe.water(); 
		car = fe; // ����ȯ ���� ���� (������ car = (FireEngine)fe) ���󿡼� �ڽ��� ����� ���
		// ���⼭ car�� fe���� Car�� �ν��Ͻ��� color,door �޼ҵ��� drive,stop�� �����´�. water��
		// Car�� ���ǿ� �ش����� �����Ƿ� ������ �� ����.
		//car.water(); // car������ FireEngine�� water�� ȣ���� �� ����.
		fe2 = (FireEngine)car; // ����ȯ�� �ʿ��ϴ�. �ڽĿ��� ������ ����� ���
		fe2.water();

	}

}


class Car{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrrr~");
	}
	
	void stop() {
		System.out.println("Brake");
	}
}


class FireEngine extends Car{ // Car�� ��ӹ��� color,door, drive(), stop()�� ��� ����.
	
	void water() {
		System.out.println("�Ѹ���");
	}
	
}