import java.util.*;

//using for class scanner

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example an use if ~ 
		
		System.out.println("���ڸ� �Է�. > ");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		// save input an input type int data on screen;
		
		if(input == 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		
		if(input != 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		
		//if you write a zero, result a first if~ execute,
		// if not, result a secone if~ execute
		
		scanner.close();
	}

}
