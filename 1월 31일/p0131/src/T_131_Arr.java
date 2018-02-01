import java.util.*;


public class T_131_Arr {
	
	
	public static void main(String[] args) {
		
		/*
	
		 문제
		 
		 조건1. 변수를 사용해서 학생명과 국어,수학,영어점수를 저장
		 조건2. 학생은 총 3명
		 조건3. 각 학생들에 대한 총점과 평균값, 등수를 구해 출력
		 조건4. 소숫점이 있는 실수로 출력
	 
		
		추가점
		
		1. 학생수를 동적으로 입력받아 동적 2차원 배열을 사용
		2. 이전 문제와 똑같은 추가점.
		3. 등수구별을 순차정렬로 완성.
			
		앞으로 할 점
		
		1. 파일 입출력(.txt파일) 로 학생수와 데이터를 입력받아 이를 출력.
		2. 문장을 좀더 줄여서 가독성을 높일 수 있으면 최대한 해본다.
		3. 3명 이상의 총점 동점자가 나올 경우 이를 등수로 구분시켜야됨.(토,일)
			- 순차정렬때 총점 동점자가 몇 명인지 체크한 후, 3명 이상일 때 이들을 국어점수 순으로 분류시켜야함.
		오류
		
		1. 총점이 같은 사람이 3명 이상일 경우, 국어점수가 높은순으로 배열되지 않을 때가 있다.(주말에 수정)
		*/		
		
		// 위의 문제를 배열로
		// 변수 입력만으로 3명의 등수 및 점수, 평균, 총점을 출력시켜본다.
		//이름,국어,영어,수학,평균,총점,등수
		// 
<<<<<<< HEAD
			String[][] Stu_Score = null;
			
			Scanner sc = new Scanner(System.in);
			
			int Student_Number;
			
			System.out.printf("학생 수를 숫자로 입력해 주세요 : ");
			Student_Number = sc.nextInt();
			System.out.printf("학생 수는 %d 명 입니다.\n ", Student_Number);
			Stu_Score = new String[Student_Number][7];
			
			int i,j;
			int total,Rank=1;
			double avr_origin,avr;
			
			//for(i=0; i<3; i++) {
			// 위에 선언된 행의 길이가 3이므로 3번 고정적으로 반복되게함.
			sc.nextLine();
			
			for(i = 0; i < Stu_Score.length; i++) {
				
				// Stu_Score의 행의 길이값에 따라 for문의 반복횟수가 조정된다.
				// 열의 길이값을 얻으려면 Stu_Score[x].length
				System.out.printf("학생 %d의 이름 : ",i+1);
				Stu_Score[i][0] = sc.nextLine();
				//여기서 nextInt() 다음 nextLine()을 사용하면 오류가 발생해 프로그램이 정상 진행이 되지 않는다.
				// 이유는 nextInt()에서 Enter를 칠 때 발생하는 개행문자를 처리하지 않고 버퍼에 남겨와 이런 문제가 생긴다고 한다.
				// (http://egloos.zum.com/shardent/v/2442363)에서 찾음.
				
				
				System.out.println("순서대로, 국어, 수학, 영어 점수입니다. 각각 입력하시고 Enter키를 눌러주세요 ");
				System.out.println("숫자를 입력하셔야 합니다.");
				
				for(j=1; j< 4; j++) {
					Stu_Score[i][j] = sc.nextLine();
				}
				
				total = Integer.parseInt(Stu_Score[i][1])
						+ Integer.parseInt(Stu_Score[i][2])
						+ Integer.parseInt(Stu_Score[i][3]);
				
				Stu_Score[i][4] = Integer.toString(total);
				
				avr_origin = (float)(total)/3.0;
				//평균값.
				
				avr = Double.parseDouble(String.format("%.2f", avr_origin));
				//avr_origin의 값을 그대로 출력하면 소수점이 매우 길게나온다
				//이를 줄이는 방법은 Double.parseDouble(String.format())문을
				//이용해서 소수점을 줄여줄 수 있다.
				
				
				Stu_Score[i][5] = Double.toString(avr);
				// 문자열로 변환해서 넣음.
				
				Stu_Score[i][6] = "1";
				//초기값은 1로함.
			}
			// 학생이름, 점수, 평균, 총점을 배열에 대입시킴
			
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
					}
					else {
						if(Integer.parseInt(Stu_Score[0][1]) == Integer.parseInt(Stu_Score[1][1])
								&& Integer.parseInt(Stu_Score[0][4]) == Integer.parseInt(Stu_Score[1][4])) {
							Stu_Score[0][6] = Integer.toString(Rank);
							Stu_Score[1][6] = Integer.toString(Rank);
						}
					}
					// 2명일 경우 두번째 것만 비교 대상이므로 바로 임시에 기록.
				}
				else {
					for(j=i+1; j<Stu_Score.length; j++) {
						
						if(j+1 <= Stu_Score.length-1) {
						// 마지막 까지 비교가 덜됬을때 
							if(Integer.parseInt(Stu_Score[j][4]) < Integer.parseInt(Stu_Score[j+1][4])) {
								// 크면 젤 큰 값과 위치를 기억해둬라.
								Strong_Number = j+1;
							}
							//작으면 별 절차없이 다음으로.
						}
						else {
							//끝까지 다돌았을 경우 연산
							if(Integer.parseInt(Stu_Score[i][4]) < Integer.parseInt(Stu_Score[Strong_Number][4])){
								//i행의 총점수가 Strong_Number행의 총점수보다 낮을때.
								temp = Stu_Score[i];
								Stu_Score[i] = Stu_Score[Strong_Number];
								Stu_Score[i][6] = Integer.toString(Rank);
								Rank++;
								Stu_Score[Strong_Number] = temp;								
							}
							else {
								//i행의 총점수가 Strong_Number행의 총점수보다 같거나 높을때
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
			Stu_Score[i-1][6] = Integer.toString(Rank);
						
			//등수 알고리즘. 총점으로 등수 판단, 동점수 시 국어점수 높은순으로.
			//순서 정렬(?)
			
			for(i=0; i<Stu_Score.length; i++) {
				
				System.out.printf("이름 : %s, 국어 : %s점, 수학 : %s점 , 영어 : %s 점, 총점 : %s점 , 평균 : %s점, 등수 : %s위\n", 
					Stu_Score[i][0], Stu_Score[i][1], Stu_Score[i][2], Stu_Score[i][3],
					Stu_Score[i][4], Stu_Score[i][5], Stu_Score[i][6]);
			//등수까지 종합한 완성본을 출력	
			}
			sc.close(); // scanner변수 sc를 사용이 끝났으니 메모리 사용을 줄이기 위해 닫는다.
=======
		String[][] Stu_Score = new String[3][7];
		
		Scanner sc = new Scanner(System.in);
		
		
		int i,j;
		int total;
		double avr;
		
		for(i = 0; i < 3; i++) {
			
			System.out.print("학생 i의 이름 : ");
			Stu_Score[i][0] = sc.nextLine();
			System.out.println("순서대로, 국어, 수학, 영어 점수입니다. 각각 입력하시고 Enter키를 눌러주세요 ");
			System.out.println("숫자를 입력하셔야 합니다.");
			
			for(j=1; j< 4; j++) {
				Stu_Score[i][j] = sc.nextLine();
			}
			
			total = Integer.parseInt(Stu_Score[i][1])
					+ Integer.parseInt(Stu_Score[i][2])
					+ Integer.parseInt(Stu_Score[i][3]);
			
			Stu_Score[i][4] = Integer.toString(total);
			
			avr = (float)(total)/3.0;
			
			Stu_Score[i][5] = Double.toString(avr);
			Stu_Score[i][6] = "1";
			//초기값은 1로함.
		}
		
		
		
		
		/*
		int Math_S1 = 0, Kor_S1 = 0, Eng_S1 = 0;
		int Math_S2 = 0, Kor_S2 = 0, Eng_S2 = 0;
		int Math_S3 = 0, Kor_S3 = 0, Eng_S3 = 0;
		
		String Stu_1 = null, Stu_2 = null, Stu_3 = null;
		
		float avr_1, avr_2, avr_3;
		int total_1, total_2, total_3;
		int Rank_1 = 1, Rank_2 = 1, Rank_3 = 1;
		// 등수는 총점으로 평가
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 1의 이름 ? : ");
		Stu_1 = sc.nextLine();
		System.out.print("학생 2의 이름 ? : ");
		Stu_2 = sc.nextLine();
		System.out.print("학생 3의 이름 ? : ");
		Stu_3 = sc.nextLine();
		//이름 작성끝
		
		System.out.print(Stu_1 +"의 수학점수 ? : ");
		Math_S1 = sc.nextInt();
		System.out.print(Stu_1 +"의 국어점수 ? : ");
		Kor_S1 = sc.nextInt();
		System.out.print(Stu_1 +"의 영어점수 ? : ");
		Eng_S1 = sc.nextInt();
		
		System.out.print(Stu_2 +"의 수학점수 ? : ");
		Math_S2 = sc.nextInt();
		System.out.print(Stu_2 +"의 국어점수 ? : ");
		Kor_S2 = sc.nextInt();
		System.out.print(Stu_2 +"의 영어점수 ? : ");
		Eng_S2 = sc.nextInt();
		
		System.out.print(Stu_3 +"의 수학점수 ? : ");
		Math_S3 = sc.nextInt();
		System.out.print(Stu_3 +"의 국어점수 ? : ");
		Kor_S3 = sc.nextInt();
		System.out.print(Stu_3 +"의 영어점수 ? : ");
		Eng_S3 = sc.nextInt();		
		
		//점수입력
		
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
		
		
		//등수 설정 
		// 조건 : 둘 다 점수가 같을때, 국어점수가 높은쪽이 등수우위를 점하고 나머지 조건은 포함시키지 않는다.
		// -> 국어점수가 같으면 같은 순위로 판정
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위\n", 
								Stu_1, Kor_S1, Eng_S1, Math_S1, total_1, avr_1, Rank_1);
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위\n", 
				Stu_2, Kor_S2, Eng_S2, Math_S2, total_2, avr_2, Rank_2);
		
		System.out.printf("이름 : %s, 국어 : %d점, 영어 : %d점 , 수학 : %d 점, 총점 : %d점 , 평균 : %.2f점, 등수 : %d위 \n", 
				Stu_3, Kor_S3, Eng_S3, Math_S3, total_3, avr_3, Rank_3);
		
		// 점수 및 등수출력
		
		
		sc.close();
		*/
>>>>>>> e3bb1225cb2de4f4c77c0b26783d585b1e6af7fe
	}
}
	


