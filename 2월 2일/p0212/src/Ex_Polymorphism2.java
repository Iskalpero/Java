
public class Ex_Polymorphism2 {

	public static void main(String[] args) {
		Car car = new Car(); // Ex_Polymorphism에 Car를 사용할 수 있는 이유는 default의 범위는 패키지간이므로 된다.
		// Car의 인스턴스를 참조한다.
		Car car2 = null;
		FireEngine fe = null; // car와 마찬가지로 사용된다.
		
		car.drive();
		fe = (FireEngine)car; // 문법적인 건 문제가 없으나, 조상타잎의 인스턴스를 자식에서 참조하는 건 허용되지 않는다.
		// 올바르게 사용하기 위해서는 Car car = new FireEngine()와 같이 
		fe.drive(); 
		car2 = fe;
		car2.drive();

	}

}

