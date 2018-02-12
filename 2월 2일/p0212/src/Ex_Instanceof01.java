
public class Ex_Instanceof01 {

	public static void main(String[] args) {
		// instanceof 연산자는 (참조변수) instanceof (타잎[클래스명]) 형식으로 사용되고
		// 결과는 boolean 값인 true(형변환가능),false(불가능) 가 있다.
		
		FireEngine fe = new FireEngine(); // Ex_Polymorphism01에 있는 FireEngine
		
		if(fe instanceof FireEngine) // FireEngine를 참조하는 객체이므로 형변환이 가능함.
			System.out.println("FireEngine instance");
		
		if(fe instanceof Car) // FireEngine의 조상클래스인 Car이므로 형변환이 가능함.
			System.out.println("Car instance");
		
		if(fe instanceof Object) // 최고조상격인 Object이므로 형변환이 가능함.
			System.out.println("Object instance");
		
		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력.

	}

}

