class TvEtc2{
	int number; // 관리번호
	String name; //Tv이름
	String year; // 생산년도
	int price;   // 가격
}

class TvTestEtc2 {
	public static void main(String[] args)  {
		/* TvEtc aaa;  aaa = new TvEtc(); */ 
		TvEtc2[] aaa= new TvEtc2[3];
		for(int i=0; i<3;i++) {
			aaa[i]= new TvEtc2();	
		}
		aaa[0].number = 1;aaa[0].name="삼성UHD TV 따봉";aaa[0].year="2018"; aaa[0].price=10000;
		aaa[1].number = 2;aaa[1].name="LG 씨네마 3D";	aaa[1].year="2017";	aaa[1].price=15000;
		aaa[2].number = 3;aaa[2].name="대우 LED TV";aaa[2].year="2016";aaa[2].price=5000;
		
		for(int i=0; i< aaa.length; i++) {
		System.out.println("관리번호: "+aaa[i].number+" 입니다.");
		System.out.println("TV이름: "+aaa[i].name+" 입니다.");
		System.out.println("TV생산년도: "+aaa[i].year+" 입니다.");
		System.out.println("TV가격: "+aaa[i].price+" 입니다.");
		System.out.println();
		}
	}
}







