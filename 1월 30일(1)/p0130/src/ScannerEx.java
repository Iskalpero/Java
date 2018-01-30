import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input the Integer.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("input something  : "+input);
		System.out.printf("num=%d\n", num);
		
		scanner.close();
		//Warnings : Resource leak: 'scanner' is never closed fixed
		// Reduce the resource leak;
		
	}
}
