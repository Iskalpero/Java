import java.util.*;

public class T_0131 {

	public static void main(String[] args) {
		
		/*
		 
		 ����
		 
		 ����1. ������ ����ؼ� �л���� ����,����,���������� ����
		 ����2. �л��� �� 3��
		 ����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
		 ����4. �Ҽ����� �ִ� �Ǽ��� ���
	 
		 
		 ���⼭ ������ �־��
		 ����1���� ����ڰ� �Է¹���
		 ����3���� ��������� ���������� �ϰ�, ���� ������ ���������� ���������� ��� ����(�������� ������)
		 
		 
		 */
		
		// ���� �Է¸����� 3���� ��� �� ����, ���, ������ ��½��Ѻ���.
		
		int Math_S1 = 0, Kor_S1 = 0, Eng_S1 = 0;
		int Math_S2 = 0, Kor_S2 = 0, Eng_S2 = 0;
		int Math_S3 = 0, Kor_S3 = 0, Eng_S3 = 0;
		
		String Stu_1 = null, Stu_2 = null, Stu_3 = null;
		
		float avr_1, avr_2, avr_3;
		int total_1, total_2, total_3;
		int Rank_1 = 1, Rank_2 = 1, Rank_3 = 1;
		// ����� �������� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� 1�� �̸� ? : ");
		Stu_1 = sc.nextLine();
		System.out.println("�л� 2�� �̸� ? : ");
		Stu_2 = sc.nextLine();
		System.out.println("�л� 3�� �̸� ? : ");
		Stu_3 = sc.nextLine();
		//�̸� �ۼ���
		
		System.out.println(Stu_1 +"�� �������� ? : ");
		Math_S1 = sc.nextInt();
		System.out.println(Stu_1 +"�� �������� ? : ");
		Kor_S1 = sc.nextInt();
		System.out.println(Stu_1 +"�� �������� ? : ");
		Eng_S1 = sc.nextInt();
		
		System.out.println(Stu_2 +"�� �������� ? : ");
		Math_S2 = sc.nextInt();
		System.out.println(Stu_2 +"�� �������� ? : ");
		Kor_S2 = sc.nextInt();
		System.out.println(Stu_2 +"�� �������� ? : ");
		Eng_S2 = sc.nextInt();
		
		System.out.println(Stu_3 +"�� �������� ? : ");
		Math_S3 = sc.nextInt();
		System.out.println(Stu_3 +"�� �������� ? : ");
		Kor_S3 = sc.nextInt();
		System.out.println(Stu_3 +"�� �������� ? : ");
		Eng_S3 = sc.nextInt();		
		
		//�����Է�
		
		total_1 = Math_S1 + Kor_S1 + Eng_S1;
		total_2 = Math_S2 + Kor_S2 + Eng_S2;
		total_3 = Math_S3 + Kor_S3 + Eng_S3;
		
		//���� ����
		
		avr_1 = (float)((Math_S1+Kor_S1+Eng_S1)/3.0);
		avr_2 = (float)((Math_S2+Kor_S2+Eng_S2)/3.0);
		avr_3 = (float)((Math_S3+Kor_S3+Eng_S3)/3.0);
		
		//��� ����
		
		if(total_1 > total_2)
			Rank_2++;
		else if(total_1 == total_2) {
			if(Kor_S1 > Kor_S2)
				Rank_2++;
			else;			
		}
		else
			Rank_1++;
		
		if(total_1 > total_3)
			Rank_3++;
		else if(total_1 == total_3) {
			if(Kor_S1 > Kor_S3)
				Rank_3++;
			else;
		}
		else
			Rank_1++;
		
		if(total_2 > total_3)
			Rank_3++;
		else if(total_2 == total_3) {
			if(Kor_S2 > Kor_S3)
				Rank_3++;
			else;
		}
		else
			Rank_2++;
		
		
		//��� ���� 
		// ���� : �� �� ������ ������, ���������� �������� ��������� ���ϰ� ������ ������ ���Խ�Ű�� �ʴ´�.
		// -> ���������� ������ ���� ������ ����
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d��\n", 
								Stu_1, Kor_S1, Eng_S1, Math_S1, total_1, avr_1, Rank_1);
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d��\n", 
				Stu_2, Kor_S2, Eng_S2, Math_S2, total_2, avr_2, Rank_2);
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d�� \n", 
				Stu_3, Kor_S3, Eng_S3, Math_S3, total_3, avr_3, Rank_3);
		
		// ���� �� ������
		
		
		sc.close();

	}

}
