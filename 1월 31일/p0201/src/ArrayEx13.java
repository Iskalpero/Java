
public class ArrayEx13 {

	public static void main(String[] args) {
		
		//Ŀ�ǵ���ο��� ���� �Է¹��� �� ���
		
		System.out.println("�Ű������� ���� : " + args.length);
		// args -> cmd�󿡼� �����̽��ٷ� ������ �����Ѵ�.
		// a b c�� �Է��ϸ� args.length=3�̴�
		// ���⼭ args[0] = a, args[1] = b, args[2] = c�̴�.
		for( int i = 0; i < args.length; i++)
			System.out.println("args["+i+"] = \""+ args[i] + "\"");

	}

}
