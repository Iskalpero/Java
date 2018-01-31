import java.util.*;

//using for class scanner

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example an use switch ~ case
		System.out.println("현재 월을 입력. > ");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		// save month an type int data on screen;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(" 봄 ");
			break;
		case 6: case 7: case 8:
			System.out.println(" 여름 ");
			break;
		case 9: case 10: case 11:
			System.out.println(" 가을 ");
			break;
		case 12: case 1: case 2:
			System.out.println(" 겨울 ");
			break;
		default:
			System.out.println(" 아뇨 뚱인데요 ");
			break;
		}
		
		
		sc.close();
	}

}
