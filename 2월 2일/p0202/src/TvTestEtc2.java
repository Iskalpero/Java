class TvEtc2{
	int number; // ������ȣ
	String name; //Tv�̸�
	String year; // ����⵵
	int price;   // ����
}

class TvTestEtc2 {
	public static void main(String[] args)  {
		/* TvEtc aaa;  aaa = new TvEtc(); */ 
		TvEtc2[] aaa= new TvEtc2[3];
		for(int i=0; i<3;i++) {
			aaa[i]= new TvEtc2();	
		}
		aaa[0].number = 1;aaa[0].name="�ＺUHD TV ����";aaa[0].year="2018"; aaa[0].price=10000;
		aaa[1].number = 2;aaa[1].name="LG ���׸� 3D";	aaa[1].year="2017";	aaa[1].price=15000;
		aaa[2].number = 3;aaa[2].name="��� LED TV";aaa[2].year="2016";aaa[2].price=5000;
		
		for(int i=0; i< aaa.length; i++) {
		System.out.println("������ȣ: "+aaa[i].number+" �Դϴ�.");
		System.out.println("TV�̸�: "+aaa[i].name+" �Դϴ�.");
		System.out.println("TV����⵵: "+aaa[i].year+" �Դϴ�.");
		System.out.println("TV����: "+aaa[i].price+" �Դϴ�.");
		System.out.println();
		}
	}
}







