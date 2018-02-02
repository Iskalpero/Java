import java.util.*;

class Student{
	
	private int math,kor,eng,total,rank;
	private float avr;
	private String name = null;
	//private 선언으로 이제 set,get와 생성자일 떄를 제외하고는 변수에 접근할 수 없다.
	Student(String name, int kor, int math, int eng){
		
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = kor+math+eng;
		this.avr = (float)(this.total/3.0);
		
	}
	void setRank(int rank) { this.rank = rank;}
	int getTotal() { return total;}
	float getAvr() { return avr;}
	String getName() { return name;}
	int getKor() {return kor;}
	int getMath() {return math;}
	int getEng() {return eng;}
	int getRank() {return rank;}
	
	// get,set으로 값을 일부 받고 출력하고
	// 생성자 Student를 통해 Rank를 제외한 모든값을 받고 avg,total 연산을 구현
	  
}

/*

문제

조건1. 변수를 사용해서 학생명과 국어,수학,영어점수를 저장
조건2. 학생은 총 3명
조건3. 각 학생들에 대한 총점과 평균값, 등수를 구해 출력
조건4. 소숫점이 있는 실수로 출력

※ 1월 31일 초기문제에 

1. 학생수 & 학생명, 점수들을 입력받아 사용(배열사용에서는 String으로 받음 ->  2/2는 클래스를 이용)
2. 알고리즘 변형 ( 초기 if~else(1/31) -> 배열사용 때 순차정렬(2/2일 이상태로 완료)
3. 점수 조건은 모두 총점이 높은순, 동일 총점 시 국어 점수가 높은 순으로.
4. 등수문제 2차 수정

// 객체지향으로 할 때 get/set으로 변수를 출력/저장하는 것에 익숙해지고, 클래스 변수를 private하는 것 또한 익숙해져야함.

※ 주말에 하면 좋겠다.

1. 배열형 프로그래밍에서 나왔던 문제점인 동점자 3명 이상일 경우, 등수구별이 되지 않는 점 개선.
2. 문제를 버블 소팅으로 바꿔보기.
3. 문제가 나옴 추가함

※ 다음 확장 때 생각할 만한것

1. 학생 수 및 점수자료를 파일 입출력을 이용해서 구현
2. 항상 하면서 가독성을 높일 수 있도록 한다.

*/

// name, kor , math , eng , total , avr, rank;
public class T0202_CL {

	public static void main(String[] args) {
		
		int i,j,Rank = 1;
		int Student_Number;
		Scanner sc = new Scanner(System.in);
		String name_copy = null;
		Student stu[];
		int Strong_Number = 0;
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
			name_copy = sc.nextLine();
			//stu[i].getName(name_copy);
			//여기서 nextInt() 다음 nextLine()을 사용하면 오류가 발생해 프로그램이 정상 진행이 되지 않는다.
			// 이유는 nextInt()에서 Enter를 칠 때 발생하는 개행문자를 처리하지 않고 버퍼에 남겨와 이런 문제가 생긴다고 한다.
			
			System.out.println("순서대로, 국어, 수학, 영어 점수입니다. 각각 입력하시고 Enter키를 눌러주세요 ");
			System.out.println("숫자를 입력하셔야 합니다.");
			// 여기서 처음에는 stu[i].name = name_copy 으로 하려 했으나
			// 클래스에서는 이런 접근을 허락하지 않아 컴파일 에러가 발생한다.
			// 따라서 클래스 내부에 set함수로 값을 받아오고, get으로 출력하는 방식을 택해야 한다.
			int input_kor = sc.nextInt();
			int input_math = sc.nextInt();
			int input_eng = sc.nextInt();
			sc.nextLine();
			stu[i] = new Student(name_copy,input_kor,input_math,input_eng);
			// 배열 때 했던 거보다 좀더 줄여 가독성을 높임.
		}
		// 학생이름, 점수, 평균, 총점을 배열에 대입시킴
		
		Student temp;
		
		
		for(i=0; i<stu.length; i++) {
				
			if(stu.length == 2) { //길이가 2일때(Student numbers == 2)
					
				if(stu[0].getTotal() < stu[1].getTotal()){ // 두 번째 학생의 
					temp = stu[0];
					stu[0] = new Student(stu[1].getName(), stu[1].getKor(), stu[1].getMath(), stu[1].getEng());
					stu[0].setRank(Rank);
					Rank++;
					stu[1] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
					stu[1].setRank(Rank);
					break;
				}
				else if(stu[0].getTotal() == stu[1].getTotal()){
					if(stu[0].getKor() == stu[1].getKor()) {
						stu[0].setRank(Rank);
						stu[1].setRank(Rank);
					}
					else if(stu[0].getKor() > stu[1].getKor()){
							stu[0].setRank(Rank);
							Rank++;
					}
					else {
						temp = stu[0];
						stu[0] = new Student(stu[1].getName(), stu[1].getKor(), stu[1].getMath(), stu[1].getEng());
						stu[0].setRank(Rank);
						Rank++;
						stu[1] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
						stu[1].setRank(Rank);
						break;					
					}
				} // 총점이 둘 다 같을 때 국어점수로 구별
				else {
					stu[0].setRank(Rank);
					Rank++;
				}
			}
			else {
				for(j=i+1; j<stu.length; j++) {
					if(j+1 <= stu.length-1) {
						// 마지막 까지 비교가 덜됬을때 
							if(stu[j].getTotal() < stu[j+1].getTotal()) {
								// 크면 젤 큰 값과 위치를 기억해둬라.
								Strong_Number = j+1;
							}
							//작으면 별 절차없이 다음으로.
							else if(stu[j].getTotal() == stu[j+1].getTotal()) {
								if(stu[j].getKor() < stu[j+1].getKor())
									Strong_Number = j+1;
								else;
							}
							else
								Strong_Number = j;
					}
					else {
						//끝까지 다돌았을 경우 연산
						if(stu[i].getTotal() < stu[Strong_Number].getTotal()){
							//i행의 총점수가 Strong_Number행의 총점수보다 낮을때.
							temp = stu[i];
							stu[i] = new Student(stu[Strong_Number].getName(), stu[Strong_Number].getKor(), stu[Strong_Number].getMath(),
									stu[Strong_Number].getEng());
							stu[i].setRank(Rank);
							Rank++;
							stu[Strong_Number] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
						}
						else if(stu[i].getTotal()== stu[Strong_Number].getTotal()) {
							//i행의 총점수가 Strong_Number행의 총점수보다 같거나 높을때
							if(stu[i].getKor() == stu[Strong_Number].getKor()) {
								stu[i].setRank(Rank);
								stu[Strong_Number].setRank(Rank);
								Rank++;
							}
							 // 평균이 둘다 같고 국어점수까지 같을 경우
							else if(stu[i].getKor() < stu[Strong_Number].getKor()) {
									stu[i].setRank(Rank);
									Rank++;
									i++;
									temp = stu[i];
									stu[i] = new Student(stu[Strong_Number].getName(), stu[Strong_Number].getKor(), stu[Strong_Number].getMath(),
											stu[Strong_Number].getEng());
									stu[i].setRank(Rank);
									Rank++;								
									stu[Strong_Number] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
							} // 평균이 같고 국어점수가 stu배열의 Strong_Number번째 값의 국어점수가 더 클 경우.
							else {
								stu[i].setRank(Rank);
								Rank++;
							}// 평균이 같고 국어점수가 i번쨰값이 더 큰 경우
									
						}
						else {
							stu[i].setRank(Rank);
							Rank++;
						}
					}
				}
			}
		}
			//등수 알고리즘. 총점으로 등수 판단, 동점수 시 국어점수 높은순으로.
			//순서 정렬(?)
		if(stu.length > 2)
			stu[i-1].setRank(Rank);
		else if(stu.length == 2);				
		else
			stu[0].setRank(Rank);
		
		for(i=0; i<stu.length; i++) {
			
			System.out.printf("이름 : %s, 국어 : %d점, 수학 : %d점 , 영어 : %d 점,"
					+ " 총점 : %d점 , 평균 : %.2f점, 등수 : %d위\n", 
				stu[i].getName(), stu[i].getKor(), stu[i].getMath(), stu[i].getEng(), 
				stu[i].getAvr(), stu[i].getTotal(), stu[i].getRank());
			//등수까지 종합한 완성본을 출력	
		}
		
		sc.close();
		
	}
}
