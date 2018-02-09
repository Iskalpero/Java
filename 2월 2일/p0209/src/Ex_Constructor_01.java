class Data1{
	int value; 
} // 생성자가 없는 클래스 Data1
// Data1 what have not constructor in class

class Data2{
	int value;
	
	Data2(int x){
		value = x;
	}
	
}
// 생성자가 존재하는 Data2, 그러나 기본생성자는 구현 x
// Data2 what have constructor in class, but haven't default class

public class Ex_Constructor_01 {

	public static void main(String[] args) {
		
		
		//Data1 d1 = new Data1(); 
		//Data2 d2 = new Data2(); 
		// D2만 에러가 발생.
		// D1또한 생성자가 없어 오류가 발생해야 하지만. 컴파일러에서는 생성자가 없을 경우 자동적으로 기본생성자를 만들어 준다.
		// 하지만 D2의 경우에는 생성자가 이미 존재하므로 생성자를 만들어 주지 않고, 위의 선언문은 생성자의 조건에 맞지 않아 컴파일 에러 발생
		
		// Compile error for D2
		// D1 also haven't constructor in class, but compiler create auto default constructor
		// when haven't constructor
		// however, case of D2 already have constructor then compiler not auto create
		// occur compile error
		

	}

}
