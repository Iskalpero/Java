class Car{
	
	String color;
	String gearType;
	int door;
	
	Car(){
		
		this("white","auto",4); 
		
	} //기본 생성자 Default Constructor
	
	Car(String color){
		this(color, "auto", 4);		
	} // 생성자에서 색깔만 선언한 걸 넣고 나머지 인자는 기본값
	// only color effect while call Constructor and etc gearType, door are default "auto", 4
	
	Car(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;		
	} // 생성자에 선언한 인자들을 모두 넣는형태.
	//insert all instance when call Constructor.
	
}


public class Ex_Constructor_02 {
	// 생성자에서 this(), this를 사용하는 예시
	// how to use at constructor this(), this an example
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType
				+ ", door = " + c1.door);
		
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType
				+ ", door = " + c2.door);
		
	}

}
