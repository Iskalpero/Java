import java.util.*;


public class T_131_Arr {
	
	
	public static void main(String[] args) {
		
		/*
	
		 ����
		 
		 ����1. ������ ����ؼ� �л���� ����,����,���������� ����
		 ����2. �л��� �� 3��
		 ����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
		 ����4. �Ҽ����� �ִ� �Ǽ��� ���
	 
		
		�߰���
		
		1. �л����� �������� �Է¹޾� ���� 2���� �迭�� ���
		2. ���� ������ �Ȱ��� �߰���.
		3. ��������� �������ķ� �ϼ�. 
			
		������ �� ��
		
		1. ���� �����(.txt����) �� �л����� �����͸� �Է¹޾� �̸� ���.
		2. ������ ���� �ٿ��� �������� ���� �� ������ �ִ��� �غ���.
		3. 3�� �̻��� ���� �����ڰ� ���� ��� �̸� ����� ���н��Ѿߵ�.(��,��)
			- �������Ķ� ���� �����ڰ� �� ������ üũ�� ��, 3�� �̻��� �� �̵��� �������� ������ �з����Ѿ���.
		����
		
		1. ������ ���� ����� 3�� �̻��� ���, ���������� ���������� �迭���� ���� ���� �ִ�.(�ָ��� ����)
		2. �л� ���� 2������ �� ��� ���� ���� �� ���������� ����� ���������� ����.(�����Ϸ�)
		*/		
		
		// ���� ������ �迭��
		// ���� �Է¸����� 3���� ��� �� ����, ���, ������ ��½��Ѻ���.
		//�̸�,����,����,����,���,����,���
		// 
			String[][] Stu_Score = null;
			
			Scanner sc = new Scanner(System.in);
			
			int Student_Number;
			
			System.out.printf("�л� ���� ���ڷ� �Է��� �ּ��� : ");
			Student_Number = sc.nextInt();
			System.out.printf("�л� ���� %d �� �Դϴ�.\n ", Student_Number);
			Stu_Score = new String[Student_Number][7];
			
			int i,j;
			int total,Rank=1;
			double avr_origin,avr;
			
			//for(i=0; i<3; i++) {
			// ���� ����� ���� ���̰� 3�̹Ƿ� 3�� ���������� �ݺ��ǰ���.
			sc.nextLine();
			
			for(i = 0; i < Stu_Score.length; i++) {
				
				// Stu_Score�� ���� ���̰��� ���� for���� �ݺ�Ƚ���� �����ȴ�.
				// ���� ���̰��� �������� Stu_Score[x].length
				System.out.printf("�л� %d�� �̸� : ",i+1);
				Stu_Score[i][0] = sc.nextLine();
				//���⼭ nextInt() ���� nextLine()�� ����ϸ� ������ �߻��� ���α׷��� ���� ������ ���� �ʴ´�.
				// ������ nextInt()���� Enter�� ĥ �� �߻��ϴ� ���๮�ڸ� ó������ �ʰ� ���ۿ� ���ܿ� �̷� ������ ����ٰ� �Ѵ�.
				
				
				System.out.println("�������, ����, ����, ���� �����Դϴ�. ���� �Է��Ͻð� EnterŰ�� �����ּ��� ");
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
				
				for(j=1; j< 4; j++) {
					Stu_Score[i][j] = sc.nextLine();
				}
				
				total = Integer.parseInt(Stu_Score[i][1])
						+ Integer.parseInt(Stu_Score[i][2])
						+ Integer.parseInt(Stu_Score[i][3]);
				
				Stu_Score[i][4] = Integer.toString(total);
				
				avr_origin = (float)(total)/3.0;
				//��հ�.
				
				avr = Double.parseDouble(String.format("%.2f", avr_origin));
				//avr_origin�� ���� �״�� ����ϸ� �Ҽ����� �ſ� ��Գ��´�
				//�̸� ���̴� ����� Double.parseDouble(String.format())����
				//�̿��ؼ� �Ҽ����� �ٿ��� �� �ִ�.
				
				
				Stu_Score[i][5] = Double.toString(avr);
				// ���ڿ��� ��ȯ�ؼ� ����.
				
				Stu_Score[i][6] = "1";
				//�ʱⰪ�� 1����.
			}
			// �л��̸�, ����, ���, ������ �迭�� ���Խ�Ŵ
			
			String[] temp = new String[7];
			int Strong_Number = 1;
			
			
			for(i=0; i<Stu_Score.length; i++) {
				
				if(Stu_Score.length == 2) {
					
					if(Integer.parseInt(Stu_Score[0][4]) < Integer.parseInt(Stu_Score[1][4])){
						temp = Stu_Score[0];
						Stu_Score[0] = Stu_Score[1];
						Stu_Score[0][6] = Integer.toString(Rank);
						Rank++;
						Stu_Score[1] = temp;
						Stu_Score[1][6] = Integer.toString(Rank);
						break;
					} // ���� ���̰� �� ���
					else if(Integer.parseInt(Stu_Score[0][4]) == Integer.parseInt(Stu_Score[1][4])){
						if(Integer.parseInt(Stu_Score[0][1]) == Integer.parseInt(Stu_Score[1][1])) {
							Stu_Score[0][6] = Integer.toString(Rank);
							Stu_Score[1][6] = Integer.toString(Rank);
						}
						else if(Integer.parseInt(Stu_Score[0][1]) > Integer.parseInt(Stu_Score[1][1])){
								Stu_Score[0][6] = Integer.toString(Rank);
								Rank++;
						}
						else {
							temp = Stu_Score[0];
							Stu_Score[0] = Stu_Score[1];
							Stu_Score[0][6] = Integer.toString(Rank);
							Rank++;
							Stu_Score[1] = temp;
							Stu_Score[1][6] = Integer.toString(Rank);
							break;							
						}
					} // ������ �� �� ���� �� ���������� ����
					else {
						Stu_Score[0][6] = Integer.toString(Rank);
						Rank++;
					}
					// 2���� ��� �ι�° �͸� �� ����̹Ƿ� �ٷ� �ӽÿ� ���.
				}
				else {
					for(j=i+1; j<Stu_Score.length; j++) {
						
						if(j+1 <= Stu_Score.length-1) {
						// ������ ���� �񱳰� �������� 
							if(Integer.parseInt(Stu_Score[j][4]) < Integer.parseInt(Stu_Score[j+1][4])) {
								// ũ�� �� ū ���� ��ġ�� ����صֶ�.
								Strong_Number = j+1;
							}
							//������ �� �������� ��������.
							else
								Strong_Number = j;
						}
						else {
							//������ �ٵ����� ��� ����
							if(Integer.parseInt(Stu_Score[i][4]) < Integer.parseInt(Stu_Score[Strong_Number][4])){
								//i���� �������� Strong_Number���� ���������� ������.
								temp = Stu_Score[i];
								Stu_Score[i] = Stu_Score[Strong_Number];
								Stu_Score[i][6] = Integer.toString(Rank);
								Rank++;
								Stu_Score[Strong_Number] = temp;								
							}
							else {
								//i���� �������� Strong_Number���� ���������� ���ų� ������
								if(Integer.parseInt(Stu_Score[i][1]) == Integer.parseInt(Stu_Score[Strong_Number][1])
										&& Integer.parseInt(Stu_Score[i][4]) == Integer.parseInt(Stu_Score[Strong_Number][4])) {
									
									
									Stu_Score[i][6] = Integer.toString(Rank);
									Rank++;
									i++;
									temp = Stu_Score[i];
									Stu_Score[i] = Stu_Score[Strong_Number];
									Stu_Score[i][6] = Integer.toString(Rank);
									Rank++;								
									Stu_Score[Strong_Number] = temp;
								}
								else {
								Stu_Score[i][6] = Integer.toString(Rank);
								Rank++;
								}
							}		
						}
					}
				}
			}
			if(Stu_Score.length > 2)
				Stu_Score[i-1][6] = Integer.toString(Rank);
			else if(Stu_Score.length == 2);				
			else
				Stu_Score[0][6] = Integer.toString(Rank);
						
			//��� �˰���. �������� ��� �Ǵ�, ������ �� �������� ����������.
			//���� ����(?)
			
			for(i=0; i<Stu_Score.length; i++) {
				
				System.out.printf("�̸� : %s, ���� : %s��, ���� : %s�� , ���� : %s ��, ���� : %s�� , ��� : %s��, ��� : %s��\n", 
					Stu_Score[i][0], Stu_Score[i][1], Stu_Score[i][2], Stu_Score[i][3],
					Stu_Score[i][4], Stu_Score[i][5], Stu_Score[i][6]);
			//������� ������ �ϼ����� ���	
			}
			sc.close(); // scanner���� sc�� ����� �������� �޸� ����� ���̱� ���� �ݴ´�.

	
	}
}
	


