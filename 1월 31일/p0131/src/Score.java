public class Score {

	public static void main(String[] args) {
		
		/*
		 
		 문제
		 
		 조건1. 변수를 사용해서 학생명과 국어,수학,영어점수를 저장
		 조건2. 학생은 총 3명
		 조건3. 각 학생들에 대한 총점과 평균값, 등수를 구해 출력
		 조건4. 소숫점이 있는 실수로 출력
		 
		 */
		
		// 변수 입력만으로 3명의 등수 및 점수, 평균, 총점을 출력시켜본다.
				
		int Math_S1 = 90, Kor_S1 = 87, Eng_S1 = 77;		
		int Math_S2 = 22, Kor_S2 = 88, Eng_S2 = 34;
		int Math_S3 = 70, Kor_S3 = 80, Eng_S3 = 90;
		
		String Stu_1 = "철수", Stu_2 = "영희", Stu_3 = "길동";
		
		float avr_1, avr_2, avr_3;
		int total_1, total_2, total_3;
		int Rank_1 = 1, Rank_2 = 1, Rank_3 = 1;
		// 등수는 총점으로 평가
		
		
		total_1 = Math_S1 + Kor_S1 + Eng_S1;
		total_2 = Math_S2 + Kor_S2 + Eng_S2;
		total_3 = Math_S3 + Kor_S3 + Eng_S3;
		
		//총점 설정
		
		avr_1 = (float)((Math_S1+Kor_S1+Eng_S1)/3.0);
		avr_2 = (float)((Math_S2+Kor_S2+Eng_S2)/3.0);
		avr_3 = (float)((Math_S3+Kor_S3+Eng_S3)/3.0);
		
		//평균 설정
		
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
		//등수 알고리즘 ( 3C2 ) 
		// 조건 : 둘 다 점수가 같을때, 국어점수가 높은쪽이 등수우위를 점하고 나머지 조건은 포함시키지 않는다.
		// -> 국어점수가 같으면 같은 순위로 판정
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위\n", 
								Stu_1, Kor_S1, Eng_S1, Math_S1, total_1, avr_1, Rank_1);
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위\n", 
				Stu_2, Kor_S2, Eng_S2, Math_S2, total_2, avr_2, Rank_2);
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위 \n", 
				Stu_3, Kor_S3, Eng_S3, Math_S3, total_3, avr_3, Rank_3);
		
		// 점수 및 등수출력
		
	

	}

}
