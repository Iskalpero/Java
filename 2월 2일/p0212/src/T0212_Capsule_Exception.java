import java.util.*;

class Student{ //Ŭ���� ���� �� ������ = �ν��Ͻ� ����, �޼ҵ� �� ������ = ���� ����!!
	
	private int math = -1,kor = -1,eng = -1,total;
	private float avr;	// private�� �����ϱ� ���� ����� set�޼ҵ带 Ŭ���� �ȿ� ����� �̿� or ������ ���� ��
//	int math,kor,eng,total;
//	float avr;
	
	private String name = null;
	private int Rank = 1;
	//private �������� ���� set,get�� �������� ���� �����ϰ�� ������ ������ �� ����.
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = this.kor+this.math+this.eng;
		this.avr = (float)(this.total/3.0);
	} // �ν��Ͻ� ����(private) �� ������.
	
	void setRank(int Rank) { this.Rank = Rank;}
	int getTotal() { return total;}
	float getAvr() { return avr;}
	String getName() { return name;}
	int getKor() {return kor;}
	int getMath() {return math;}
	int getEng() {return eng;}
	int getRank() {return Rank;}
	
	// get,set���� ���� �Ϻ� �ް� ����ϰ� (�ν��Ͻ� �޼ҵ�)
	// ������ Student�� ���� Rank�� ������ ��簪�� �ް� avg,total ������ ����
	  
}

/*

����

����1. ������ ����ؼ� �л���� ����,����,���������� ����
����2. �л��� �� 3��
����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
����4. �Ҽ����� �ִ� �Ǽ��� ���

�� 1�� 31�� �ʱ⹮������ �߰����� �Ϸ�����.
(���������� �� . Score.java, �迭�߰����� T_131_Arr.java) 

1. �л��� & �л���, �������� �Է¹޾� ���(�迭��뿡���� String���� ���� ->  2/2�� Ŭ������ �̿�)
2. �˰��� ���� ( �ʱ� if~else(1/31) -> �迭��� �� ��������(2/2�� �̻��·� �Ϸ�)
3. ���� ������ ��� ������ ������, ���� ���� �� ���� ������ ���� ������.
4. ������� 2�� ����(2/2)
5. �޼��带 �̿��� Ÿ���� �� ���� �ٿ���(2/6)
6. �迭�� ���α׷��ֿ��� ���Դ� �������� ������ 3�� �̻��� ���, ��������� ���� �ʴ� �� ����.(2/7)  
7. student���� ���� ����(default->private)����  (2/8)
// private�� ���ڸ� �������϶� or Set�޼��带 ���� �ؾߵǴµ� ������ �� ���� ������ ���� �ʾҴ�.(2/8�ذ�)
// ��ü�������� �� �� get/set���� ������ ���/�����ϴ� �Ϳ� �ͼ�������, Ŭ���� ������ private�ϴ� �� ���� �ͼ���������.

�� ���� �� �������� ����

1. �л� ���� ����/�Ҽ������� �Է� �� �߻��ϴ� ������ ����ó��, ������ �Է� �ÿ��� �ٽ� �Է��� �� �ֵ��� ��. (2/12)
2. �л��� ������ �Է� �� �� 0~100�� �̿��� ���ڳ� ���ڸ� �ۼ� �� ����ó��(0~100�� ���� �̱���) (2/12) 1,2 �Ѵ� ������.
(1,2 �Ѵ� ���� �߻��� Java.~�ڵ带 ����)

�� Ȯ�� �� ������ ���Ѱ�

1. �л� �� �� �����ڷḦ ���� ������� �̿��ؼ� ���� (�л������ ���Ϸ� ���� �� �ְ�, ���� ��ϻ��¸� ���Ϸ� �����ų �� �־����)
2. ������ٰ� + �����߰�( ex ���� 10�ۼ�Ʈ���� : A ���� 10~50 : B , ���� 60~80: C , ������ : D) 1�� �ϸ� �̰� �ؾ���. 
3. �׻� �ϸ鼭 �������� ���� �� �ֵ��� �Ѵ�. // �����
4. MFCó�� ���α׷����� ����.
 
*/

// name, kor , math , eng , total , avr, rank;
public class T0212_Capsule_Exception {

	static ArrayList<Integer> SameNote_Array; 
	public static void main(String[] args) {
		
		try { // ����ó��
			int i,j,rank=1;
			int Student_Number = 0;
			Scanner sc = new Scanner(System.in);
			
			SameNote_Array = new ArrayList<Integer>();
			//������ ó�� ��� -> ArrayList�� �̿��� �ش� �л��� ����� �Ŀ�, �̸� Rank���� �� ������ ������
			// check �� �� �̸� ��������ϰ�, �׸�ŭ ���ܾ���.
			
			
			String name_copy = null;
			Student stu[] = null;
			System.out.printf("�л� ���� ���ڷ� �Է��� �ּ��� : ");
			while(Student_Number <= 0 ) {
				Student_Number = sc.nextInt();
				if(Student_Number <= 0)
					System.out.println("0�̻��� ������ �ٽ� �Է����ּ���.");
			}
			
			//catch(ArrayIndexOutOfBoundsException e){
			//	System.out.println("���� �̿��� 1�̻��� ������ �Է��� �ּ���");
			//}
			
			System.out.printf("�л� ���� %d �� �Դϴ�.\n ", Student_Number);
			stu = new Student[Student_Number];
		
			// Ŭ������ �̿��� ��ü�� �迭������ ���� ����.
			sc.nextLine();
			
			
			
			
			for(i = 0; i < stu.length; i++) {
					
				// stu ���� ���̰��� ���� for���� �ݺ�Ƚ���� �����ȴ�.
				// ���� ���̰��� �������� stu[x].length
				System.out.printf("�л� %d�� �̸� : ",i+1);
				name_copy = sc.nextLine();
				//stu[i].getName(name_copy);
				//���⼭ nextInt() ���� nextLine()�� ����ϸ� ������ �߻��� ���α׷��� ���� ������ ���� �ʴ´�.
				// ������ nextInt()���� Enter�� ĥ �� �߻��ϴ� ���๮�ڸ� ó������ �ʰ� ���ۿ� ���ܿ� �̷� ������ ����ٰ� �Ѵ�.
				
				System.out.println("�������, ����, ����, ���� �����Դϴ�. "
						+ "0~100�� ���� ������ �Է��Ͻð� EnterŰ �� ������ �������ּ��� ");
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
				// ���⼭ ó������ stu[i].name = name_copy ���� �Ϸ� ������
				// Ŭ���������� �̷� ������ ������� �ʾ� ������ ������ �߻��Ѵ�.
				// ���� Ŭ���� ���ο� set�Լ��� ���� �޾ƿ���, get���� ����ϴ� ����� ���ؾ� �Ѵ�.
				
				int input_kor = sc.nextInt();
				int input_math = sc.nextInt();
				int input_eng = sc.nextInt();
				sc.nextLine();
				stu[i] = new Student(name_copy,input_kor,input_math,input_eng);
				// �迭 �� �ߴ� �ź��� ���� �ٿ� �������� ����.
			}
			// �л��̸�, ����, ���, ������ �迭�� ���Խ�Ŵ
		
		
		
		
			if(stu.length <2) {
				stu[0].setRank(rank);			
			}
			if(stu.length == 2) { //���̰� 2�϶�(Student numbers == 2)
			
				if(stu[0].getTotal() < stu[1].getTotal()){ // �� ��° �л��� 
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
				} // ������ �� �� ���� �� ���������� ����
				else {
					rank++;
					stu[1].setRank(rank);
				} // 2���� ���� ������ ���� ... the same code when student below two case;
			}
			else { // ��������. ����(�ְ���) ~ ������(�������)
			
				for(i=0; i < stu.length; i++) {
					SameNote_Array.clear(); // �ʱ�ȭ
					SameNote_Array.add(i); 
					for(j = i+1; j < stu.length; j++) {
						//�� �˰����� ������ �� ���� �Ѱ��� ������� �������� 1:1�񱳸� ����Ͽ� ���� ū���� ������
						//���� ������ ������������ ���ϴ¿����� �ݺ���Ű�� ���̴�.
						
						if(stu[i].getTotal() > stu[j].getTotal()); // i�� j���� ������ Ŭ ���� ����ġ.
						
						else if(stu[i].getTotal() == stu[j].getTotal()) {
							// ������ ������ �� 2���� �������� ���� �Ǻ�
							if(stu[i].getKor() > stu[j].getKor()); // ��������.
							else if(stu[i].getKor() == stu[j].getKor()) {
								SameNote_Array.add(j);
								// ���ϵ�� ó���� �ϱ� ���� �� ��°���� �迭�� ������ ���´�.
							}
							else {
								SameNote_Array.clear(); // �� ū ������ �л��� ã�����Ƿ�, ���� �����͸� ���� �� ����.
								//Winner(stu[i],stu[j]);
								Winner(stu,i,j);
								SameNote_Array.add(i);
							}
							
						}
						else {
							SameNote_Array.clear(); //���� else���� ������.
							//Winner(stu[i],stu[j]);
							Winner(stu,i,j);
							SameNote_Array.add(i);
						}
					}// for�� (j-1)�� ��. //��������� ���� ���� ���� �Ϸ�.
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
						else { // �����ڰ� �Ѹ� or ������ �� ù ��°�� ���.
							stu[SameNote_Array.get(j)].setRank(rank);
						}
					} //for(j-2)�� ��
					rank++; // ������ ó�� �� ���ó�� �� ���� ����ڸ� ����ؾ��ϱ� ������ rank�� ���� 1�ø���.
				} // for(i)�� ��
			} // else�� ��
			
			
			
			
			 for(Student s : stu) { //Student�� �迭�� ����� �̷��������ε� for���� ��� �����ϴ�.
				 //Student �迭 stu�� ó������ ������ Ž���ϴ� Student ��ü s
				System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��,"
						+ " ��� : %.2f�� , ���� : %d��, ��� : %d��\n", 
					s.getName(), s.getKor(), s.getMath(), s.getEng(), 
					s.getAvr(), s.getTotal(), s.getRank());
				//for(i=0; i<stu.length; i++) {
				//System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��,"
					//	+ " ��� : %.2f�� , ���� : %d��, ��� : %d��\n", 
					//stu[i].getName(), stu[i].getKor(), stu[i].getMath(), stu[i].getEng(), 
					//stu[i].getAvr(), stu[i].getTotal(), stu[i].getRank());
				//������� ������ �ϼ����� ���	
			}
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� 0���� �Է��߰ų�, ����,����,�������� �Է��ϼż� �۾��� ��ҵǾ����ϴ�.");
		}
		catch(InputMismatchException e) {
			System.out.println("�л� ���� 0�̻��� ������, ���� �Է��� 0~100�� ���� ������ �Է����ּ���");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("0�̻��� ������ �Է����ּ���.");
		}
		catch(Exception e) {
			System.out.println("���� �߻�");
		}
		finally{};	
	}

	static void Winner(Student[] dent, int swap_i, int swap_j){  
		// �ν��Ͻ� �޼��带 ����ϱ� ���� ������ ��ü�� �־���Ѵ�.(�� ��ü ���� �� ��밡��) ex) Test ��ü = new Test(); ��ü.Winner(~,~)����
		// ������ Winner�� ��쿡�� �ν��Ͻ� �޼����� ���ǿ� �ش����� ���Ѵ�. ���� ��ü ������ ���� Winner��
		// ����ϱ� ���ؼ��� �տ� static�� �־� ���� �޼ҵ����·� ����ؾ� �Ѵ�.
		// ���� Student Ŭ������ set,get���İ� ���ϸ� ������ �� ���� ���̴�.
		//���⼭ ������. 
		//int a =1 ; // ��������.
		Student temp = new Student(dent[swap_i].getName(),dent[swap_i].getKor(),dent[swap_i].getMath(),dent[swap_i].getEng());
		dent[swap_i] = new Student(dent[swap_j].getName(), dent[swap_j].getKor(), dent[swap_j].getMath(), dent[swap_j].getEng());
		dent[swap_j] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
	}
		// ���� �̻��¿����� �ܼ��ϰ� stu[i]�� �ƴ� student a��� �Ÿ� �ǵ帮���־ ������ �ȵȴ�.
//	static void Winner(Student a, Student b){ // ĸ��ȭ�� ���� �ʰ� Winner���� Stu�� �ּҰ��� ������ ���� �����ϴ� ���
//		//���� ĸ��ȭ�� ���� �ʾ� ������ �����ϱ� ��������. 
//		Student temp = new Student(a.name, a.kor, a.math, a.eng);
//		a.name = b.name; b.name = temp.name;
//		a.kor = b.kor;	b.kor = temp.kor;
//		a.math = b.math; b.math = temp.math;
//		a.eng = b.eng; b.eng = temp.eng;
//		a.total = b.total; b.total = temp.total;
//		a.avr = b.avr;	b.avr = temp.avr;
//	}// Winner �޼��� ��
//		//  
	
}

