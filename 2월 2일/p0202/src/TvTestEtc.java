class TvEtc{
	int number; // ������ȣ
	String name; //Tv�̸�
	String year; // ����⵵
	int price;   // ����
}

class TvTestEtc {
	public static void main(String[] args) {
		/* TvEtc aaa;  aaa = new TvEtc(); */ 
		TvEtc aaa= new TvEtc();
		aaa.number = 1;
		aaa.name="�ＺUHD TV ����";
		aaa.year="2018";
		aaa.price=10000;
		
		TvEtc bbb= new TvEtc();
		bbb.number = 2;
		bbb.name="LG ���׸� 3D";
		bbb.year="2017";
		bbb.price=15000;
		
		TvEtc ccc= new TvEtc();
		ccc.number = 3;
		ccc.name="��� LED TV";
		ccc.year="2016";
		ccc.price=5000;
		
		System.out.println("������ȣ: "+aaa.number+" �Դϴ�.");
		System.out.println("TV�̸�: "+aaa.name+" �Դϴ�.");
		System.out.println("TV����⵵: "+aaa.year+" �Դϴ�.");
		System.out.println("TV����: "+aaa.price+" �Դϴ�.");
		System.out.println();
		
		System.out.println("������ȣ: "+bbb.number+" �Դϴ�.");
		System.out.println("TV�̸�: "+bbb.name+" �Դϴ�.");
		System.out.println("TV����⵵: "+bbb.year+" �Դϴ�.");
		System.out.println("TV����: "+bbb.price+" �Դϴ�.");
		System.out.println();
		
		System.out.println("������ȣ: "+ccc.number+" �Դϴ�.");
		System.out.println("TV�̸�: "+ccc.name+" �Դϴ�.");
		System.out.println("TV����⵵: "+ccc.year+" �Դϴ�.");
		System.out.println("TV����: "+ccc.price+" �Դϴ�.");	
	}
}







