public class Score {

	public static void main(String[] args) {
		
		/*
		 
		 ����
		 
		 ����1. ������ ����ؼ� �л���� ����,����,���������� ����
		 ����2. �л��� �� 3��
		 ����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
		 ����4. �Ҽ����� �ִ� �Ǽ��� ���
		 
		 */
		
		// ���� �Է¸����� 3���� ��� �� ����, ���, ������ ��½��Ѻ���.
				
		int Math_S1 = 90, Kor_S1 = 87, Eng_S1 = 77;		
		int Math_S2 = 22, Kor_S2 = 88, Eng_S2 = 34;
		int Math_S3 = 70, Kor_S3 = 80, Eng_S3 = 90;
		
		String Stu_1 = "ö��", Stu_2 = "����", Stu_3 = "�浿";
		
		float avr_1, avr_2, avr_3;
		int total_1, total_2, total_3;
		int Rank_1 = 1, Rank_2 = 1, Rank_3 = 1;
		// ����� �������� ��
		
		
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
		//��� �˰��� ( 3C2 ) 
		// ���� : �� �� ������ ������, ���������� �������� ��������� ���ϰ� ������ ������ ���Խ�Ű�� �ʴ´�.
		// -> ���������� ������ ���� ������ ����
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d��\n", 
								Stu_1, Kor_S1, Eng_S1, Math_S1, total_1, avr_1, Rank_1);
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d��\n", 
				Stu_2, Kor_S2, Eng_S2, Math_S2, total_2, avr_2, Rank_2);
		
		System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��, ���� : %d�� , ��� : %.2f��, ��� : %d�� \n", 
				Stu_3, Kor_S3, Eng_S3, Math_S3, total_3, avr_3, Rank_3);
		
		// ���� �� ������
		
	

	}

}
