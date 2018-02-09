public class Ex_Super_01 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);
		System.out.println("p3.x = "+p3.x);
		System.out.println("p3.y = "+p3.y);
		System.out.println("p3.z = "+p3.z);
		//Point p1 = new Point();
	}

}

class Point_Su{ // extends Object
	
	int x,y;
	
	Point_Su(int x, int y){ 
		super(); //means Point_Su().... this code effect main code p1 successful
		this.x = x;
		this.y = y;		
	}
	
	String getLocation() {
		return "x : " + x + ", y:" + y;
	}
	
}


class Point3D extends Point_Su{
	
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y); // means Point_Su(int x, int y)
		this.x = x;
		this.y = y;
		this.z = z;

	}
	String getLocation() { // OverRiding
		return "x:" + x + ", y:" +y +"z: " +z;
	}
	
}
