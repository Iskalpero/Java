import java.util.*;

class Student{
	
	private int math,kor,eng,total,rank;
	private float avr;
	private String name = null;
	//private �������� ���� set,get�� �������� ���� �����ϰ�� ������ ������ �� ����.
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
	
	// get,set���� ���� �Ϻ� �ް� ����ϰ�
	// ������ Student�� ���� Rank�� ������ ��簪�� �ް� avg,total ������ ����
	  
}

/*

����

����1. ������ ����ؼ� �л���� ����,����,���������� ����
����2. �л��� �� 3��
����3. �� �л��鿡 ���� ������ ��հ�, ����� ���� ���
����4. �Ҽ����� �ִ� �Ǽ��� ���

�� 1�� 31�� �ʱ⹮���� 

1. �л��� & �л���, �������� �Է¹޾� ���(�迭��뿡���� String���� ���� ->  2/2�� Ŭ������ �̿�)
2. �˰��� ���� ( �ʱ� if~else(1/31) -> �迭��� �� ��������(2/2�� �̻��·� �Ϸ�)
3. ���� ������ ��� ������ ������, ���� ���� �� ���� ������ ���� ������.
4. ������� 2�� ����

// ��ü�������� �� �� get/set���� ������ ���/�����ϴ� �Ϳ� �ͼ�������, Ŭ���� ������ private�ϴ� �� ���� �ͼ���������.

�� �ָ��� �ϸ� ���ڴ�.

1. �迭�� ���α׷��ֿ��� ���Դ� �������� ������ 3�� �̻��� ���, ��������� ���� �ʴ� �� ����.
2. ������ ���� �������� �ٲ㺸��.
3. ������ ���� �߰���

�� ���� Ȯ�� �� ������ ���Ѱ�

1. �л� �� �� �����ڷḦ ���� ������� �̿��ؼ� ����
2. �׻� �ϸ鼭 �������� ���� �� �ֵ��� �Ѵ�.

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
		
		Student temp;
		
		
		for(i=0; i<stu.length; i++) {
				
			if(stu.length == 2) { //���̰� 2�϶�(Student numbers == 2)
					
				if(stu[0].getTotal() < stu[1].getTotal()){ // �� ��° �л��� 
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
				} // ������ �� �� ���� �� ���������� ����
				else {
					stu[0].setRank(Rank);
					Rank++;
				}
			}
			else {
				for(j=i+1; j<stu.length; j++) {
					if(j+1 <= stu.length-1) {
						// ������ ���� �񱳰� �������� 
							if(stu[j].getTotal() < stu[j+1].getTotal()) {
								// ũ�� �� ū ���� ��ġ�� ����صֶ�.
								Strong_Number = j+1;
							}
							//������ �� �������� ��������.
							else if(stu[j].getTotal() == stu[j+1].getTotal()) {
								if(stu[j].getKor() < stu[j+1].getKor())
									Strong_Number = j+1;
								else;
							}
							else
								Strong_Number = j;
					}
					else {
						//������ �ٵ����� ��� ����
						if(stu[i].getTotal() < stu[Strong_Number].getTotal()){
							//i���� �������� Strong_Number���� ���������� ������.
							temp = stu[i];
							stu[i] = new Student(stu[Strong_Number].getName(), stu[Strong_Number].getKor(), stu[Strong_Number].getMath(),
									stu[Strong_Number].getEng());
							stu[i].setRank(Rank);
							Rank++;
							stu[Strong_Number] = new Student(temp.getName(), temp.getKor(), temp.getMath(), temp.getEng());
						}
						else if(stu[i].getTotal()== stu[Strong_Number].getTotal()) {
							//i���� �������� Strong_Number���� ���������� ���ų� ������
							if(stu[i].getKor() == stu[Strong_Number].getKor()) {
								stu[i].setRank(Rank);
								stu[Strong_Number].setRank(Rank);
								Rank++;
							}
							 // ����� �Ѵ� ���� ������������ ���� ���
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
							} // ����� ���� ���������� stu�迭�� Strong_Number��° ���� ���������� �� Ŭ ���.
							else {
								stu[i].setRank(Rank);
								Rank++;
							}// ����� ���� ���������� i�������� �� ū ���
									
						}
						else {
							stu[i].setRank(Rank);
							Rank++;
						}
					}
				}
			}
		}
			//��� �˰���. �������� ��� �Ǵ�, ������ �� �������� ����������.
			//���� ����(?)
		if(stu.length > 2)
			stu[i-1].setRank(Rank);
		else if(stu.length == 2);				
		else
			stu[0].setRank(Rank);
		
		for(i=0; i<stu.length; i++) {
			
			System.out.printf("�̸� : %s, ���� : %d��, ���� : %d�� , ���� : %d ��,"
					+ " ���� : %d�� , ��� : %.2f��, ��� : %d��\n", 
				stu[i].getName(), stu[i].getKor(), stu[i].getMath(), stu[i].getEng(), 
				stu[i].getAvr(), stu[i].getTotal(), stu[i].getRank());
			//������� ������ �ϼ����� ���	
		}
		
		sc.close();
		
	}
}
