
public class Ex_Binding01 {
	
	// 참조변수와 인스턴스의 연결 예제

	
	
	public static void main(String[] args) {
		// 멤버변수가 조상,자식 클래스에 중복으로 정의된 경우 조상타잎의 경우에는 조상 클래스에 선언된 멤버변수가 사용되고
		// 자식타잎의 경우에는 자식 클래스에 선언된 멤버변수가 사용된다.
		Parent p = new Child(); // 조상 타잎 자식 참조
		Child c = new Child(); // 자식 타잎,참조.
		
		System.out.println("p.x = " + p.x); // 조상값이 나옴
		p.method(); //자식값이 나옴.
		
		System.out.println("c.x = " + c.x); // 자식값이 나옴.
		c.method(); //자식값이 나옴.
		//메서드의 경우에는 타잎에 관계없이 선언된 멤버변수의 값을 따라간다.
		//밑에서 자식클래스 정의에 주석된 형식으로 할 시에는 메서드가 조상클래스를 따라간다.
				
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
		System.out.println("x= " + x); // this.x 와 동일
		System.out.println("super x =  " + super.x);
		System.out.println("this.x= " + this.x);
	}
}

//class Child extends Parent{}