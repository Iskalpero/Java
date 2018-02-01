
public class ArrayEx13 {

	public static void main(String[] args) {
		
		//커맨드라인에서 값을 입력받은 걸 출력
		
		System.out.println("매개변수의 개수 : " + args.length);
		// args -> cmd상에서 스페이스바로 변수를 구분한다.
		// a b c를 입력하면 args.length=3이다
		// 여기서 args[0] = a, args[1] = b, args[2] = c이다.
		for( int i = 0; i < args.length; i++)
			System.out.println("args["+i+"] = \""+ args[i] + "\"");

	}

}
