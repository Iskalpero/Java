import java.util.*;

//using for class scanner

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example an use if ~ 
		
		int input;
		
		System.out.println("���ڸ� �Է�. > ");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		// save tmp an input type String data on screen;
		input = Integer.parseInt(tmp);
		// tmp data is a char, than change to char->int
		// if you write a not int type, then error occured.
		if(input == 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		
		if(input != 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		
		System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�.", input);
		
		
	}

}
