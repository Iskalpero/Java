import java.lang.reflect.Array;
import java.util.*;

class Student{
	
	int math,kor,eng,total;
	float avr;
	String name = null;
	int Rank = 1;
	//private �������� ���� set,get�� �������� ���� �����ϰ�� ������ ������ �� ����.
	Student(String name, int kor, int math, int eng){
		
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = kor+math+eng;
		this.avr = (float)(this.total/3.0);
	}
	
	void setRank(int Rank) { this.Rank = Rank;}
	int getTotal() { return total;}
	float getAvr() { return avr;}
	String getName() { return name;}
	int getKor() {return kor;}
	int getMath() {return math;}
	int getEng() {return eng;}
	int getRank() {return Rank;}
	
	// get,set���� ���� �Ϻ� �ް� ����ϰ�
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

// ��ü�������� �� �� get/set���� ������ ���/�����ϴ� �Ϳ� �ͼ�������, Ŭ���� ������ private�ϴ� �� ���� �ͼ���������.

�� �۾���.

1. ������ ���� �������� �ٲ㺸��. (�ϴ� �ڷι̷�, �������� �˰����� �ϼ����� �ø���)
2. ������ ���� �߰���

�� ���� Ȯ�� �� ������ ���Ѱ�

1. �л� �� �� �����ڷḦ ���� ������� �̿��ؼ� ����
2. ������ٰ� + �����߰�( ex ���� 10�ۼ�Ʈ���� : A ���� 10~50 : B , ���� 60~80: C , ������ : D) 
3. �׻� �ϸ鼭 �������� ���� �� �ֵ��� �Ѵ�.

*/

// name, kor , math , eng , total , avr, rank;
public class T0202_SSAlgorism {

	static ArrayList<Integer> SameNote_Array; 
	public static void main(String[] args) {
		
		int i,j,rank=1;
		int Student_Number;
		Scanner sc = new Scanner(System.in);
		
		SameNote_Array = new ArrayList<Integer>();
		//������ ó�� ��� -> ArrayList�� �̿��� �ش� �л��� ����� �Ŀ�, �̸� Rank���� �� ������ ������
		// check �� �� �̸� ��������ϰ�, �׸�ŭ ���ܾ���.
		
		
		String name_copy = null;
		Student stu[];
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
			name_copy = sc.nextLine();
			//stu[i].getName(name_copy);
			//���⼭ nextInt() ���� nextLine()�� ����ϸ� ������ �߻��� ���α׷��� ���� ������ ���� �ʴ´�.
			// ������ nextInt()���� Enter�� ĥ �� �߻��ϴ� ���๮�ڸ� ó������ �ʰ� ���ۿ� ���ܿ� �̷� ������ ����ٰ� �Ѵ�.
			
			System.out.println("�������, ����, ����, ���� �����Դϴ�. ���� �Է��Ͻð� EnterŰ�� �����ּ��� ");
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
				Winner(stu[0],stu[1]);
				rank++;
				stu[1].setRank(rank);					
			}
			else if(stu[0].getTotal() == stu[1].getTotal()){
				if(stu[0].getKor() == stu[1].getKor());
				else if(stu[0].getKor() > stu[1].getKor());
				else {
					Winner(stu[0],stu[1]);
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
							Winner(stu[i],stu[j]);
							SameNote_Array.add(i);
						}
						
					}
					else {
						SameNote_Array.clear(); //���� else���� ������.
						Winner(stu[i],stu[j]);
						SameNote_Array.add(i);
					}
				}// for�� (j-1)�� ��. //��������� ���� ���� ���� �Ϸ�.
				for(j=0; j<SameNote_Array.size(); j++) {
					if(j>0) {
						i++;
						if(i==SameNote_Array.get(j)) {
							stu[i].setRank(rank);
						}
						Winner(stu[i],stu[SameNote_Array.get(j)]);
						stu[i].setRank(rank);						
					}
					else { // �����ڰ� �Ѹ� or ������ �� ù ��°�� ���.
						stu[SameNote_Array.get(j)].setRank(rank);
					}
				} //for(j-2)�� ��
				rank++;
			} // for(i)�� ��
		} // else�� ��
		
		
		
		for(i=0; i<stu.length; i++) {
			
			System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��,"
					+ " ��� : %.2f�� , ���� : %d��, ��� : %d��\n", 
				stu[i].getName(), stu[i].getKor(), stu[i].getMath(), stu[i].getEng(), 
				stu[i].getAvr(), stu[i].getTotal(), stu[i].getRank());
			//������� ������ �ϼ����� ���	
		}
		sc.close();
		
	}
	static void Winner(Student a, Student b){   
		//swap
		//���⼭ ������. //�� static�� �־���ϴ°�?
		Student temp = new Student(a.name, a.kor, a.math, a.eng);
		
		a.name = b.name; b.name = temp.name;
		a.kor = b.kor;	b.kor = temp.kor;
		a.math = b.math; b.math = temp.math;
		a.eng = b.eng; b.eng = temp.eng;
		a.total = b.total; b.total = temp.total;
		a.avr = b.avr;	b.avr = temp.avr;
		// �޼��忡�� ���������� ����Ϸ��� ������ �̷��������� �����ؾ��Ѵ�. 
	}
}
