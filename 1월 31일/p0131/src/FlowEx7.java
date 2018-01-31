import java.util.*;

//using for class scanner

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example an use switch ~ case
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요");
				
		Scanner sc = new Scanner(System.in);
		
		// play vs cpu Rock Paper Scissors
		int user_int = sc.nextInt();
		int com_int = (int)(Math.random()*3) +1;
		//cpu use between 1~3
		String user = null;
		String com = null;
		// change user_int,com_int into user,com string 
		switch(user_int) {
			
		case 1:
			user = "가위";
			break;
		case 2:
			user = "바위";
			break;
		case 3:
			user = "보";
			break;
		default:
			System.out.println("셋중에 하나만 내세요.");
			break;		
		}
		
		switch(com_int) {
		
		case 1:
			com = "가위";
			break;
		case 2:
			com = "바위";
			break;
		case 3:
			com = "보";
			break;
		default:
			System.out.println("오류 발생.");
			break;		
		}
		
		System.out.println("당신이 낸 건 " + user);
		System.out.println("Com이 낸 건 " + com);
		
		switch(user_int - com_int) {
		
		case 0:
			System.out.println("비김");
			break;
		case -1: case 2:
			System.out.println("짐");
			break;
		case 1: case -2:
			System.out.println("이김");
			break;
		}
	
		sc.close();
	}
}
