
public class Ex_Polymorphism2 {

	public static void main(String[] args) {
		Car car = new Car(); // Ex_Polymorphism�� Car�� ����� �� �ִ� ������ default�� ������ ��Ű�����̹Ƿ� �ȴ�.
		// Car�� �ν��Ͻ��� �����Ѵ�.
		Car car2 = null;
		FireEngine fe = null; // car�� ���������� ���ȴ�.
		
		car.drive();
		fe = (FireEngine)car; // �������� �� ������ ������, ����Ÿ���� �ν��Ͻ��� �ڽĿ��� �����ϴ� �� ������ �ʴ´�.
		// �ùٸ��� ����ϱ� ���ؼ��� Car car = new FireEngine()�� ���� 
		fe.drive(); 
		car2 = fe;
		car2.drive();

	}

}

