import java.util.*;

class Student{
	
	int math,kor,eng,total,rank;
	float avr = (float)(math+kor+eng/3.0);
	String name = null;
	
}

/*

문제

조건1. 변수를 사용해서 학생명과 국어,수학,영어점수를 저장
조건2. 학생은 총 3명
조건3. 각 학생들에 대한 총점과 평균값, 등수를 구해 출력
조건4. 소숫점이 있는 실수로 출력

※ 1월 31일 초기문제에 

1. 학생수 & 학생명, 점수들을 입력받아 사용(배열사용에서는 String으로 받음 ->  2/2는 클래스를 이용)
2. 알고리즘 변형 ( 초기 if~else(1/31) -> 배열사용 때 순차정렬 -> 버블 소팅 사용(2/2)
3. 점수 조건은 모두 총점이 높은순, 동일 총점 시 국어 점수가 높은 순으로.


※ 주말에 하면 좋겠다.

1. 배열형 프로그래밍에서 나왔던 문제점인 동점자 3명 이상일 경우, 등수구별이 되지 않는 점 개선.
2. 문제가 나옴 추가함

※ 다음 확장 때 생각할 만한것

1. 학생 수 및 점수자료를 파일 입출력을 이용해서 구현
2. 항상 하면서 가독성을 높일 수 있도록 한다.

*/

// name, kor , math , eng , total , avr, rank;
public class T0202_CL {

	public static void main(String[] args) {
		
		int i,j,Rank = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int Student_Number;
		Student [] stu;
		
		System.out.printf("학생 수를 숫자로 입력해 주세요 : ");
		Student_Number = sc.nextInt();
		System.out.printf("학생 수는 %d 명 입니다.\n ", Student_Number);
		stu = new Student[Student_Number];
		// 클래스를 이용해 객체를 배열형으로 동적 생성.
		
		sc.nextLine();
		
		for(i = 0; i < stu.length; i++) {
			
			// stu 행의 길이값에 따라 for문의 반복횟수가 조정된다.
			// 열의 길이값을 얻으려면 stu[x].length
			System.out.printf("학생 %d의 이름 : ",i+1);
			stu[i].name = sc.nextLine();
			//여기서 nextInt() 다음 nextLine()을 사용하면 오류가 발생해 프로그램이 정상 진행이 되지 않는다.
			// 이유는 nextInt()에서 Enter를 칠 때 발생하는 개행문자를 처리하지 않고 버퍼에 남겨와 이런 문제가 생긴다고 한다.
			
			
			System.out.println("순서대로, 국어, 수학, 영어 점수입니다. 각각 입력하시고 Enter키를 눌러주세요 ");
			System.out.println("숫자를 입력하셔야 합니다.");
			
			stu[i].kor = sc.nextInt();
			stu[i].math = sc.nextInt();
			stu[i].eng = sc.nextInt();
									
			// 배열 때 했던 거보다 좀더 줄여 가독성을 높임.
		}
		// 학생이름, 점수, 평균, 총점을 배열에 대입시킴
		
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
					// 2명일 경우 두번째 것만 비교 대상이므로 바로 임시에 기록.
			}
			else {
				for(j=i+1; j<stu.length; j++) {
						
				}
			}
						
			//등수 알고리즘. 총점으로 등수 판단, 동점수 시 국어점수 높은순으로.
			//순서 정렬(?)
		
		for(i=0; i<stu.length; i++) {
			
			System.out.printf("이름 : %s, 국어 : %s점, 수학 : %s점 , 영어 : %s 점,"
					+ " 총점 : %s점 , 평균 : %s점, 등수 : %s위\n", 
				stu[i].name, stu[i].kor, stu[i].math, stu[i].eng, 
				stu[i].total, stu[i].avr, stu[i].rank);
			//등수까지 종합한 완성본을 출력	
		}
		
		sc.close();
		
		}
	}
}
