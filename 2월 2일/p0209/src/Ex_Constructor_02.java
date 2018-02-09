class Car{
	
	String color;
	String gearType;
	int door;
	
	Car(){
		
		this("white","auto",4); 
		
	} //�⺻ ������ Default Constructor
	
	Car(String color){
		this(color, "auto", 4);		
	} // �����ڿ��� ���� ������ �� �ְ� ������ ���ڴ� �⺻��
	// only color effect while call Constructor and etc gearType, door are default "auto", 4
	
	Car(String color, String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;		
	} // �����ڿ� ������ ���ڵ��� ��� �ִ�����.
	//insert all instance when call Constructor.
	
}


public class Ex_Constructor_02 {
	// �����ڿ��� this(), this�� ����ϴ� ����
	// how to use at constructor this(), this an example
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1�� color = " + c1.color + ", gearType = " + c1.gearType
				+ ", door = " + c1.door);
		
		System.out.println("c2�� color = " + c2.color + ", gearType = " + c2.gearType
				+ ", door = " + c2.door);
		
	}

}
