
public class OperatorEx6 {
	
	public static void main(String[] args) {
		
		
		// Complie error an type problem
		
		byte a = 10;
		byte b = 20;
		
		//byte c = a + b; // problem occured
		// c type is byte but type of a+b a int
		byte c = (byte)(a+b);
		
		System.out.println(c);
		
		
	}
}
