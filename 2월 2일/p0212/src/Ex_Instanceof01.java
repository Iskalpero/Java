
public class Ex_Instanceof01 {

	public static void main(String[] args) {
		// instanceof �����ڴ� (��������) instanceof (Ÿ��[Ŭ������]) �������� ���ǰ�
		// ����� boolean ���� true(����ȯ����),false(�Ұ���) �� �ִ�.
		
		FireEngine fe = new FireEngine(); // Ex_Polymorphism01�� �ִ� FireEngine
		
		if(fe instanceof FireEngine) // FireEngine�� �����ϴ� ��ü�̹Ƿ� ����ȯ�� ������.
			System.out.println("FireEngine instance");
		
		if(fe instanceof Car) // FireEngine�� ����Ŭ������ Car�̹Ƿ� ����ȯ�� ������.
			System.out.println("Car instance");
		
		if(fe instanceof Object) // �ְ�������� Object�̹Ƿ� ����ȯ�� ������.
			System.out.println("Object instance");
		
		System.out.println(fe.getClass().getName()); // Ŭ������ �̸��� ���.

	}

}

