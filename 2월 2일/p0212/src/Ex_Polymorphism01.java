
public class Ex_Polymorphism01 {

	public static void main(String[] args) {
		Car car = null; // 객체 car 선언.
		FireEngine fe = new FireEngine(); // 객체 fe선언.
		FireEngine fe2 = null; 
		
		fe.water(); 
		car = fe; // 형변환 생략 가능 (원래는 car = (FireEngine)fe) 조상에서 자식을 사용할 경우
		// 여기서 car는 fe에서 Car의 인스턴스인 color,door 메소드인 drive,stop을 가져온다. water는
		// Car의 정의에 해당하지 않으므로 가져올 수 없다.
		//car.water(); // car에서는 FireEngine인 water를 호출할 수 없다.
		fe2 = (FireEngine)car; // 형변환이 필요하다. 자식에서 조상을 사용할 경우
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


class FireEngine extends Car{ // Car를 상속받음 color,door, drive(), stop()를 사용 가능.
	
	void water() {
		System.out.println("뿌린다");
	}
	
}