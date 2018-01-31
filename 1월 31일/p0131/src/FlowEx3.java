import java.util.*;

//using for class scanner

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example an use if ~ 
		
		System.out.println("숫자를 입력. > ");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		// save input an input type int data on screen;
		
		if(input == 0)
			System.out.println("입력하신 숫자는 0입니다.");
		
		if(input != 0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		
		//if you write a zero, result a first if~ execute,
		// if not, result a secone if~ execute
		
		scanner.close();
	}

}
