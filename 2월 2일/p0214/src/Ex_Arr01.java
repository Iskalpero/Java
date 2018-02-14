
public class Ex_Arr01 {

	public static void main(String[] args) {
		
		//System.arraycopy �� ����� ����
		//System Ŭ������ ���ԵǾ� �ִ� �޼ҵ��, 
		//arraycopy(obj src,int srcpos ,obj dest, int destpos ,int size)�������� ���ȴ�.
		//(������ ���,����� ��ġ, ���� ���, ���� ����� ��ġ, ����) �̰�, 1���� �迭�� ���ȴ�.
		
		char[] abc = { 'A','B','C','D' };
		char[] num = { '0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length+num.length]; // abc�� ���� 4, num�� ���� 10�� ���� 14ũ��
		System.arraycopy(abc, 0, result, 0, abc.length); //result = {'A','B','C','D', null...};
		System.arraycopy(num, 0, result, abc.length, num.length); // result = {...,'D','0','1','2','3'...'9'};
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		// '0','1','2',3',...���� 'A','B','C','D',...�� �ٲ��.
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		// num[6]�� '6'���� '8'������
		// 'A','B','C'�� �ٲ��.
		
		//char�迭�� for���� println, print�� ��� �����ϴ�.

	}

}
