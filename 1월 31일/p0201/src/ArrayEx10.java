
public class ArrayEx10 {

	public static void main(String[] args) {
		// Using Bubble Sort
		
		int [] numArr = new int[10];
		
		for (int i = 0; i< numArr.length; i++) {
			System.out.println(numArr[i] = (int)(Math.random()*10));
		}
		// numArr array variables random number 1~10;
		System.out.println();
		
		
		for(int i = 0; i < numArr.length-1; i++) {
			
			boolean changed = false; // �ڸ��ٲ��� �߻��ߴ��� Ȯ��.(?)
			
			//
			
			for(int j = 0; j < numArr.length-1-i; j++) {
				
				if(numArr[j] > numArr[j+1]) {
					
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; // �ڸ��ٲ��� �߻� change = true.
					// �����߻��� ���� ���� boolean���� üũ�ϴ�����.
				}
			} //end for j
			
			if(!changed) break;
			
			for(int k=0 ; k<numArr.length; k++)
				System.out.print(numArr[k]); //���ĵ� ����� ���
			System.out.println();
		} // end for i
			
				
	}
}

