import java.util.*;

class Student{ //클래스 영역 내 변수들 = 인스턴스 변수, 메소드 내 변수들 = 지역 변수!!
	
	private int math = -1,kor = -1,eng = -1,total;
	private float avr;	// private에 접근하기 위한 방법은 set메소드를 클래스 안에 만들고 이용 or 생성자 선언 때
//	int math,kor,eng,total;
//	float avr;
	
	private String name = null;
	private int Rank = 1;
	//private 선언으로 이제 set,get와 생성자일 떄를 제외하고는 변수에 접근할 수 없다.
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = this.kor+this.math+this.eng;
		this.avr = (float)(this.total/3.0);
	} // 인스턴스 변수(private) 및 생성자.
	
	void setRank(int Rank) { this.Rank = Rank;}
	int getTotal() { return total;}
	float getAvr() { return avr;}
	String getName() { return name;}
	int getKor() {return kor;}
	int getMath() {return math;}
	int getEng() {return eng;}
	int getRank() {return Rank;}
	
	// get,set으로 값을 일부 받고 출력하고 (인스턴스 메소드)
	// 생성자 Student를 통해 Rank를 제외한 모든값을 받고 avg,total 연산을 구현
	  
}

/*

문제

조건1. 변수를 사용해서 학생명과 국어,수학,영어점수를 저장
조건2. 학생은 총 3명
조건3. 각 학생들에 대한 총점과 평균값, 등수를 구해 출력
조건4. 소숫점이 있는 실수로 출력

※ 1월 31일 초기문제이후 추가내용 완료한점.
(원래문제의 답 . Score.java, 배열추가한점 T_131_Arr.java) 

1. 학생수 & 학생명, 점수들을 입력받아 사용(배열사용에서는 String으로 받음 ->  2/2는 클래스를 이용)
2. 알고리즘 변형 ( 초기 if~else(1/31) -> 배열사용 때 순차정렬(2/2일 이상태로 완료)
3. 점수 조건은 모두 총점이 높은순, 동일 총점 시 국어 점수가 높은 순으로.
4. 등수문제 2차 수정(2/2)
5. 메서드를 이용해 타이핑 줄 수를 줄여봄(2/6)
6. 배열형 프로그래밍에서 나왔던 문제점인 동점자 3명 이상일 경우, 등수구별이 되지 않는 점 개선.(2/7)  
7. student내의 변수 형식(default->private)변경  (2/8)
// private면 인자를 생성자일때 or Set메서드를 만들어서 해야되는데 본인이 할 때는 적용이 되지 않았다.(2/8해결)
// 객체지향으로 할 때 get/set으로 변수를 출력/저장하는 것에 익숙해지고, 클래스 변수를 private하는 것 또한 익숙해져야함.

※ 버그 및 비정상적 문제

1. 학생 수를 문자/소수점으로 입력 시 발생하는 문제를 예외처리, 음수로 입력 시에는 다시 입력할 수 있도록 함. (2/12)
2. 학생의 점수를 입력 할 때 0~100점 이외의 숫자나 문자를 작성 시 예외처리(0~100은 아직 미구현) (2/12) 1,2 둘다 진행중.
(1,2 둘다 에러 발생시 Java.~코드를 없앰)

※ 확장 때 생각할 만한것

1. 학생 수 및 점수자료를 파일 입출력을 이용해서 구현 (학생목록을 파일로 읽을 수 있고, 현재 목록상태를 파일로 저장시킬 수 있어야함)
2. 등수에다가 + 학점추가( ex 상위 10퍼센트까지 : A 상위 10~50 : B , 상위 60~80: C , 나머지 : D) 1을 하면 이걸 해야함. 
3. 항상 하면서 가독성을 높일 수 있도록 한다. // 상시적
4. MFC처럼 프로그램으로 구현.
 
*/

// name, kor , math , eng , total , avr, rank;
public class T0212_Capsule_Exception {

	static ArrayList<Integer> SameNote_Array; 
	public static void main(String[] args) {
		
		try { // 예외처리
			int i,j,rank=1;
			int Student_Number = 0;
			Scanner sc = new Scanner(System.in);
			
			SameNote_Array = new ArrayList<Integer>();
			//동점자 처리 방법 -> ArrayList를 이용해 해당 학생을 기억한 후에, 이를 Rank적용 때 동점자 유무를
			// check 한 후 이를 공동등수하고, 그만큼 땅겨야함.
			
			
			String name_copy = null;
			Student stu[] = null;
			System.out.printf("학생 수를 숫자로 입력해 주세요 : ");
			while(Student_Number <= 0 ) {
				Student_Number = sc.nextInt();
				if(Student_Number <= 0)
					System.out.println("0이상의 정수로 다시 입력해주세요.");
			}
			
			//catch(ArrayIndexOutOfBoundsException e){
			//	System.out.println("문자 이외의 1이상의 정수만 입력해 주세요");
			//}
			
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
				
				System.out.println("순서대로, 국어, 수학, 영어 점수입니다. "
						+ "0~100점 내의 정수로 입력하시고 Enter키 각 점수를 구분해주세요 ");
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
		
		
		
		
			if(stu.length <2) {
				stu[0].setRank(rank);			
			}
			if(stu.length == 2) { //길이가 2일때(Student numbers == 2)
			
				if(stu[0].getTotal() < stu[1].getTotal()){ // 두 번째 학생의 
					//Winner(stu[0],stu[1]);
					Winner(stu,0,1);
					rank++;
					stu[1].setRank(rank);
					
				}
				else if(stu[0].getTotal() == stu[1].getTotal()){
					if(stu[0].getKor() == stu[1].getKor());
					else if(stu[0].getKor() > stu[1].getKor());
					else {
						//Winner(stu[0],stu[1]);
						Winner(stu,0,1);
						rank++;
						stu[1].setRank(rank);
					}
				} // 총점이 둘 다 같을 때 국어점수로 구별
				else {
					rank++;
					stu[1].setRank(rank);
				} // 2명일 때는 이전과 동일 ... the same code when student below two case;
			}
			else { // 순차정렬. 왼쪽(최고등수) ~ 오른쪽(최저등수)
			
				for(i=0; i < stu.length; i++) {
					SameNote_Array.clear(); // 초기화
					SameNote_Array.add(i); 
					for(j = i+1; j < stu.length; j++) {
						//이 알고리즘의 형식은 맨 왼쪽 한개를 대상으로 나머지와 1:1비교를 모두하여 가장 큰수를 가리고
						//다음 왼쪽을 저런형식으로 비교하는원리로 반복시키는 것이다.
						
						if(stu[i].getTotal() > stu[j].getTotal()); // i가 j보다 총점이 클 때는 노터치.
						
						else if(stu[i].getTotal() == stu[j].getTotal()) {
							// 총점이 동일할 때 2차로 국어점수 우위 판별
							if(stu[i].getKor() > stu[j].getKor()); // 현상유지.
							else if(stu[i].getKor() == stu[j].getKor()) {
								SameNote_Array.add(j);
								// 동일등수 처리를 하기 위해 몇 번째인지 배열에 저장해 놓는다.
							}
							else {
								SameNote_Array.clear(); // 더 큰 총점의 학생을 찾았으므로, 이전 데이터를 제거 후 시작.
								//Winner(stu[i],stu[j]);
								Winner(stu,i,j);
								SameNote_Array.add(i);
							}
							
						}
						else {
							SameNote_Array.clear(); //위의 else문과 동일함.
							//Winner(stu[i],stu[j]);
							Winner(stu,i,j);
							SameNote_Array.add(i);
						}
					}// for문 (j-1)문 끝. //높은사람의 동점 정보 수집 완료.
					for(j=0; j<SameNote_Array.size(); j++) {
						if(j>0) {
							i++;
							if(i==SameNote_Array.get(j)) {
								stu[i].setRank(rank);
							}
							//Winner(stu[i],stu[SameNote_Array.get(j)]);
							Winner(stu,i,SameNote_Array.get(j));
							stu[i].setRank(rank);						
						}
						else { // 동점자가 한명 or 동점자 중 첫 번째일 경우.
							stu[SameNote_Array.get(j)].setRank(rank);
						}
					} //for(j-2)문 끝
					rank++; // 동점수 처리 및 등수처리 후 다음 등수자를 기록해야하기 때문에 rank의 값을 1올린다.
				} // for(i)문 끝
			} // else문 끝
			
			
			
			
			 for(Student s : stu) { //Student를 배열로 사용해 이런형식으로도 for문이 사용 가능하다.
				 //Student 배열 stu를 처음부터 끝까지 탐색하는 Student 객체 s
				System.out.printf("이름 : %s, 국어 : %d점, 수학 : %d점 , 영어 : %d 점,"
						+ " 평균 : %.2f점 , 총점 : %d점, 등수 : %d위\n", 
					s.getName(), s.getKor(), s.getMath(), s.getEng(), 
					s.getAvr(), s.getTotal(), s.getRank());
				//for(i=0; i<stu.length; i++) {
				//System.out.printf("이름 : %s, 국어 : %d점, 수학 : %d점 , 영어 : %d 점,"
					//	+ " 평균 : %.2f점 , 총점 : %d점, 등수 : %d위\n", 
					//stu[i].getName(), stu[i].getKor(), stu[i].getMath(), stu[i].getEng(), 
					//stu[i].getAvr(), stu[i].getTotal(), stu[i].getRank());
				//등수까지 종합한 완성본을 출력	
			}
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("수를 0으로 입력했거나, 문자,음수,유리수를 입력하셔서 작업이 취소되었습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("학생 수는 0이상의 정수로, 점수 입력은 0~100점 내의 정수로 입력해주세요");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("0이상의 정수를 입력해주세요.");
		}
		catch(Exception e) {
			System.out.println("오류 발생");
		}
		finally{};	
	}

	static void Winner(Student[] dent, int swap_i, int swap_j){  
		// 인스턴스 메서드를 사용하기 위한 조건은 객체가 있어야한다.(선 객체 선언 후 사용가능) ex) Test 객체 = new Test(); 객체.Winner(~,~)형식
		// 하지만 Winner의 경우에는 인스턴스 메서드의 조건에 해당하지 못한다. 따라서 객체 선언이 없는 Winner를
		// 사용하기 위해서는 앞에 static를 넣어 정적 메소드형태로 사용해야 한다.
		// 위의 Student 클래스의 set,get형식과 비교하면 이해할 수 있을 것이다.
		//여기서 결과계산. 
		//int a =1 ; // 지역변수.
		Student temp = new Student(dent[swap_i].getName(),dent[swap_i].getKor(),dent[swap_i].getMath(),dent[swap_i].getEng());
		dent[swap_i] = new Student(dent[swap_j].getName(), dent[swap_j].getKor(), dent[swap_j].getMath(), dent[swap_j].getEng());
		dent[swap_j] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
	}
		// 현재 이상태에서는 단순하게 stu[i]가 아닌 student a라는 거만 건드리고있어서 적용이 안된다.
//	static void Winner(Student a, Student b){ // 캡슐화를 하지 않고 Winner에서 Stu에 주소값에 접근해 값을 변경하는 방법
//		//문제 캡슐화를 하지 않아 변수에 접근하기 쉬워진다. 
//		Student temp = new Student(a.name, a.kor, a.math, a.eng);
//		a.name = b.name; b.name = temp.name;
//		a.kor = b.kor;	b.kor = temp.kor;
//		a.math = b.math; b.math = temp.math;
//		a.eng = b.eng; b.eng = temp.eng;
//		a.total = b.total; b.total = temp.total;
//		a.avr = b.avr;	b.avr = temp.avr;
//	}// Winner 메서드 끝
//		//  
	
}

