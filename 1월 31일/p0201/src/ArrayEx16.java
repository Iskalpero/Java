import javax.swing.*;
// JOptionPane.showInputDialog()��� �⺻ �Է�â�� ����ϱ�
// ���� ����Ű���� ����Ѵ�.

public class ArrayEx16 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100) + 1;
		//use Math.random to between 1~100 save answer variable;
		
		
		int input = 0; // variable for user's input data
		String temp = ""; // variable for user's input data to temp;
		int count = 0; // count for how many try..
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("1~100 ������ ���ڸ� �Է��ϼ���."
					+ " �������� -1�� �Է��ϼ���.");
			
			// user input -1 or button cancel click than this do~ while exit 

			if(temp == null || temp.equals("-1")) break;
			
			System.out.println("�Է°� : " + temp);	
			
			// user input variable is type String, must have to change type int
			
			input = Integer.parseInt(temp);
			
		}while(true);
	

	}

}
