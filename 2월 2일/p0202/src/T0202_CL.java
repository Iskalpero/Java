import java.util.*;

class Student{
	
	int math,kor,eng,total,rank;
	float avr = (float)(math+kor+eng/3.0);
	String name = null;
	
}

/*

����

����1. ������ ����ؼ� �л���� ����,����,���������� ����
����2. �л��� �� 3��
����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
����4. �Ҽ����� �ִ� �Ǽ��� ���

�� 1�� 31�� �ʱ⹮���� 

1. �л��� & �л���, �������� �Է¹޾� ���(�迭��뿡���� String���� ���� ->  2/2�� Ŭ������ �̿�)
2. �˰��� ���� ( �ʱ� if~else(1/31) -> �迭��� �� �������� -> ���� ���� ���(2/2)
3. ���� ������ ��� ������ ������, ���� ���� �� ���� ������ ���� ������.


�� �ָ��� �ϸ� ���ڴ�.

1. �迭�� ���α׷��ֿ��� ���Դ� �������� ������ 3�� �̻��� ���, ��������� ���� �ʴ� �� ����.
2. ������ ���� �߰���

�� ���� Ȯ�� �� ������ ���Ѱ�

1. �л� �� �� �����ڷḦ ���� ������� �̿��ؼ� ����
2. �׻� �ϸ鼭 �������� ���� �� �ֵ��� �Ѵ�.

*/

// name, kor , math , eng , total , avr, rank;
public class T0202_CL {

	public static void main(String[] args) {
		
		int i,j,Rank = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int Student_Number;
		Student [] stu;
		
		System.out.printf("�л� ���� ���ڷ� �Է��� �ּ��� : ");
		Student_Number = sc.nextInt();
		System.out.printf("�л� ���� %d �� �Դϴ�.\n ", Student_Number);
		stu = new Student[Student_Number];
		// Ŭ������ �̿��� ��ü�� �迭������ ���� ����.
		
		sc.nextLine();
		
		for(i = 0; i < stu.length; i++) {
			
			// stu ���� ���̰��� ���� for���� �ݺ�Ƚ���� �����ȴ�.
			// ���� ���̰��� �������� stu[x].length
			System.out.printf("�л� %d�� �̸� : ",i+1);
			stu[i].name = sc.nextLine();
			//���⼭ nextInt() ���� nextLine()�� ����ϸ� ������ �߻��� ���α׷��� ���� ������ ���� �ʴ´�.
			// ������ nextInt()���� Enter�� ĥ �� �߻��ϴ� ���๮�ڸ� ó������ �ʰ� ���ۿ� ���ܿ� �̷� ������ ����ٰ� �Ѵ�.
			
			
			System.out.println("�������, ����, ����, ���� �����Դϴ�. ���� �Է��Ͻð� EnterŰ�� �����ּ��� ");
			System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			
			stu[i].kor = sc.nextInt();
			stu[i].math = sc.nextInt();
			stu[i].eng = sc.nextInt();
									
			// �迭 �� �ߴ� �ź��� ���� �ٿ� �������� ����.
		}
		// �л��̸�, ����, ���, ������ �迭�� ���Խ�Ŵ
		
		Student temp;
		int Strong_Number = 1;
		
		
		for(i=0; i<stu.length; i++) {
				
			if(stu.length == 2) {
					
				if(stu[0].avr < stu[1].avr){
					temp = stu[0];
					stu[0] = stu[1];
					stu[0].rank = Rank;
					Rank++;
					stu[1] = temp;
					stu[1].rank = Rank;
					break;
				}
				else {
					if(stu[0].kor == stu[1].kor
						&& stu[0].total == stu[1].total) {
						stu[0].rank = Rank;
						stu[1].rank = Rank;
					 	}
					}
					// 2���� ��� �ι�° �͸� �� ����̹Ƿ� �ٷ� �ӽÿ� ���.
			}
			else {
				for(j=i+1; j<stu.length; j++) {
						
				}
			}
						
			//��� �˰���. �������� ��� �Ǵ�, ������ �� �������� ����������.
			//���� ����(?)
		
		for(i=0; i<stu.length; i++) {
			
			System.out.printf("�̸� : %s, ���� : %s��, ���� : %s�� , ���� : %s ��,"
					+ " ���� : %s�� , ��� : %s��, ��� : %s��\n", 
				stu[i].name, stu[i].kor, stu[i].math, stu[i].eng, 
				stu[i].total, stu[i].avr, stu[i].rank);
			//������� ������ �ϼ����� ���	
		}
		
		sc.close();
		
		}
	}
}
