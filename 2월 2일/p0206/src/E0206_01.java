
public class E0206_01 {

	public static void main(String[] args) {
		
		//example for how to using overloading
		
		MyMath3 mm = new MyMath3();
		
		System.out.println("mm.add(3, 3); 결과 : " + mm.add(3,3));
		System.out.println("mm.add(3L, 3); 결과 : " + mm.add(3L,3));
		System.out.println("mm.add(3, 3L); 결과 : " + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L); 결과 : " + mm.add(3L,3L));
		
	}

}

class MyMath3{

	int add(int a, int b) {
		
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		
		System.out.print("long add(int a, long b) - ");
		return a+b;
	} // overloading method add
	
	long add(long a, int b) {
		
		System.out.print("long add(long a, int b) - ");
		return a+b;
	} // overloading method add(2)
	
	long add(long a, long b) {
		
		System.out.print("long add(long a, long b) - ");
		return a+b;
	} // overloading method add(3)
	
	
	int add(int[] a) { // overloading when method variable get array
						// and return to sum of value of each array value;
		System.out.print("int add(int[] a) - ");
		int result = 0;
		
		for(int i = 0; i<a.length; i++)
			result += a[i];
		
		return result;
	}
	
	
	
}
