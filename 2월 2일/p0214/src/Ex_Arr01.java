
public class Ex_Arr01 {

	public static void main(String[] args) {
		
		//System.arraycopy 를 사용한 예제
		//System 클래스에 포함되어 있는 메소드로, 
		//arraycopy(obj src,int srcpos ,obj dest, int destpos ,int size)형식으로 사용된다.
		//(복사할 대상,대상의 위치, 붙일 대상, 붙일 대상의 위치, 길이) 이고, 1차원 배열에 사용된다.
		
		char[] abc = { 'A','B','C','D' };
		char[] num = { '0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length+num.length]; // abc의 길이 4, num의 길이 10을 합해 14크기
		System.arraycopy(abc, 0, result, 0, abc.length); //result = {'A','B','C','D', null...};
		System.arraycopy(num, 0, result, abc.length, num.length); // result = {...,'D','0','1','2','3'...'9'};
		System.out.println(result);
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		// '0','1','2',3',...에서 'A','B','C','D',...로 바뀐다.
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		// num[6]인 '6'에서 '8'까지가
		// 'A','B','C'로 바뀐다.
		
		//char배열은 for없이 println, print로 출력 가능하다.

	}

}
