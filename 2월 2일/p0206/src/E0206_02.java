
public class E0206_02 {

	public static void main(String[] args) {
		// 
		
		String [] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("","100","200","300"));
		// "" means null;
		
		System.out.println(concatenate("-",strArr));
		//(1)

		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		//(2)
		
		System.out.println("["+concatenate(",", new String[0]) + "]");
		//(3) String[0] == null, C array is not allowed this code(must have value), java can(default value = null)
		
		System.out.println("["+concatenate(",") + "]");
		//(4)
		
		// 
	}

	static String concatenate(String delim, String ...args) {
		//string ...args means can catch string nothing or all
		//string ...args 는 string객체를 0개부터 여러개까지 매개변수로 올수 있도록 해주는 것.
		String result = "";
		//null 
		
		for(String str: args)
			result += str + delim;
		// (3),(4) are not passed this for method because (3),(4) just string , not String[]
		return result;
		
	}
	/*
	 static String concatenate(String ...args){
	 	return concatenate("",args);	 
	 }
	  */
	// this method using overloading, errors occured because
	 // two concatenate method can't judge how use concatenate
	 // ... should not use the overloading method
	
}

