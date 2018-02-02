class TvEtc{
	int number; // 관리번호
	String name; //Tv이름
	String year; // 생산년도
	int price;   // 가격
}

class TvTestEtc {
	public static void main(String[] args) {
		/* TvEtc aaa;  aaa = new TvEtc(); */ 
		TvEtc aaa= new TvEtc();
		aaa.number = 1;
		aaa.name="삼성UHD TV 따봉";
		aaa.year="2018";
		aaa.price=10000;
		
		TvEtc bbb= new TvEtc();
		bbb.number = 2;
		bbb.name="LG 씨네마 3D";
		bbb.year="2017";
		bbb.price=15000;
		
		TvEtc ccc= new TvEtc();
		ccc.number = 3;
		ccc.name="대우 LED TV";
		ccc.year="2016";
		ccc.price=5000;
		
		System.out.println("관리번호: "+aaa.number+" 입니다.");
		System.out.println("TV이름: "+aaa.name+" 입니다.");
		System.out.println("TV생산년도: "+aaa.year+" 입니다.");
		System.out.println("TV가격: "+aaa.price+" 입니다.");
		System.out.println();
		
		System.out.println("관리번호: "+bbb.number+" 입니다.");
		System.out.println("TV이름: "+bbb.name+" 입니다.");
		System.out.println("TV생산년도: "+bbb.year+" 입니다.");
		System.out.println("TV가격: "+bbb.price+" 입니다.");
		System.out.println();
		
		System.out.println("관리번호: "+ccc.number+" 입니다.");
		System.out.println("TV이름: "+ccc.name+" 입니다.");
		System.out.println("TV생산년도: "+ccc.year+" 입니다.");
		System.out.println("TV가격: "+ccc.price+" 입니다.");	
	}
}







