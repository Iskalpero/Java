
public class Ex_Binding01 {
	
	// ���������� �ν��Ͻ��� ���� ����

	
	
	public static void main(String[] args) {
		// ��������� ����,�ڽ� Ŭ������ �ߺ����� ���ǵ� ��� ����Ÿ���� ��쿡�� ���� Ŭ������ ����� ��������� ���ǰ�
		// �ڽ�Ÿ���� ��쿡�� �ڽ� Ŭ������ ����� ��������� ���ȴ�.
		Parent p = new Child(); // ���� Ÿ�� �ڽ� ����
		Child c = new Child(); // �ڽ� Ÿ��,����.
		
		System.out.println("p.x = " + p.x); // ������ ����
		p.method(); //�ڽİ��� ����.
		
		System.out.println("c.x = " + c.x); // �ڽİ��� ����.
		c.method(); //�ڽİ��� ����.
		//�޼����� ��쿡�� Ÿ�ٿ� ������� ����� ��������� ���� ���󰣴�.
		//�ؿ��� �ڽ�Ŭ���� ���ǿ� �ּ��� �������� �� �ÿ��� �޼��尡 ����Ŭ������ ���󰣴�.
				
	}
}

class Parent{
	
	int x = 200;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	
	int x = 100;
	
	void method() {
		System.out.println("Child Method");
		System.out.println("x= " + x); // this.x �� ����
		System.out.println("super x =  " + super.x);
		System.out.println("this.x= " + this.x);
	}
}

//class Child extends Parent{}