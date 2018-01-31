import java.util.*;

//using for class scanner

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example an use if ~ 
		
		int input;
		
		System.out.println("숫자를 입력. > ");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		// save tmp an input type String data on screen;
		input = Integer.parseInt(tmp);
		// tmp data is a char, than change to char->int
		// if you write a not int type, then error occured.
		if(input == 0)
			System.out.println("입력하신 숫자는 0입니다.");
		
		if(input != 0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		
		System.out.printf("입력하신 숫자는 %d 입니다.", input);
		
		
	}

}
