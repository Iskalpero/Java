import java.util.*;

//using for class scanner

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example an use switch ~ case
		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��ϼ���");
				
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
			user = "����";
			break;
		case 2:
			user = "����";
			break;
		case 3:
			user = "��";
			break;
		default:
			System.out.println("���߿� �ϳ��� ������.");
			break;		
		}
		
		switch(com_int) {
		
		case 1:
			com = "����";
			break;
		case 2:
			com = "����";
			break;
		case 3:
			com = "��";
			break;
		default:
			System.out.println("���� �߻�.");
			break;		
		}
		
		System.out.println("����� �� �� " + user);
		System.out.println("Com�� �� �� " + com);
		
		switch(user_int - com_int) {
		
		case 0:
			System.out.println("���");
			break;
		case -1: case 2:
			System.out.println("��");
			break;
		case 1: case -2:
			System.out.println("�̱�");
			break;
		}
	
		sc.close();
	}
}
