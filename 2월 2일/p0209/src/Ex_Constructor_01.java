class Data1{
	int value; 
} // �����ڰ� ���� Ŭ���� Data1
// Data1 what have not constructor in class

class Data2{
	int value;
	
	Data2(int x){
		value = x;
	}
	
}
// �����ڰ� �����ϴ� Data2, �׷��� �⺻�����ڴ� ���� x
// Data2 what have constructor in class, but haven't default class

public class Ex_Constructor_01 {

	public static void main(String[] args) {
		
		
		//Data1 d1 = new Data1(); 
		//Data2 d2 = new Data2(); 
		// D2�� ������ �߻�.
		// D1���� �����ڰ� ���� ������ �߻��ؾ� ������. �����Ϸ������� �����ڰ� ���� ��� �ڵ������� �⺻�����ڸ� ����� �ش�.
		// ������ D2�� ��쿡�� �����ڰ� �̹� �����ϹǷ� �����ڸ� ����� ���� �ʰ�, ���� ������ �������� ���ǿ� ���� �ʾ� ������ ���� �߻�
		
		// Compile error for D2
		// D1 also haven't constructor in class, but compiler create auto default constructor
		// when haven't constructor
		// however, case of D2 already have constructor then compiler not auto create
		// occur compile error
		

	}

}
