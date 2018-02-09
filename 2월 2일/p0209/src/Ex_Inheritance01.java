
/*
 
  �⺻��(default value)
  
  boolean = false
  char = '\u0000'
  byte, short, int = 0
  long = 0L
  float = 0.0f
  double = 0.0d or 0.0
   ������ ���� = null  
  
 */

public class Ex_Inheritance01 {
	
	//��� ���� ( Example an Inheritance )
	public static void main(String[] args) {
		
		Point[] p = { 	new Point(100,100),
						new Point(140, 50),
						new Point(200,100)
					};
		// Point p = new P[3]
		Triangle t = new Triangle(p); // instance t(of Triangle),c(of Circle)
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw();
		c.draw();		
	}

}


class Shape { // this code not comment, maintain extends Object
			// Shape���� �̹� object�� ��ӹް� �ִ� (������Ʈ�� ��� Ŭ������ �����̴�.)
	String color = "black";
	void draw() {
		System.out.printf("[color =%s]%n",color);
	}
}


class Point{
	int x,y;
	
	//two type of Constructor - default, two factors(x,y)
	Point(int x, int y){
		this.x = x; this.y = y;
	}
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "(" +x+"," +y +")";
	}
}


class Circle extends Shape{ // Inheritance(���)... Shape�� color�� ����� �� �ִ�.(using color of Shape in factor) 
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point center, int r){
		this.center = center; this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color = %s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{ // Inheritance(���)... Shape�� color�� ����� �� �ִ�.(using color of Shape in factor) 
	
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
	
}

