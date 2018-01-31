import java.util.*;

//using for class scanner

public class FlowEx24 {

	public static void main(String[] args) {
		
		//use while~
		// how i--/--i affects an result?
		
		int i = 11;
		
		System.out.println("Count Down");
		
		//while(--i!=0) {
		while(i-- != 0) {
			
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000;j++);
			// not mean for 2,000,000,000 cycles;
		}
		
		// using --i, count 10 ~ 1 and GAME OVER
		// using i--, count 10 ~ 0 and GAME OVER
		// --i case, first -- and check i 10 cycles
		// i-- case, first i and use -- 11 cycles
		System.out.println("GAME OVER");
		
	}
}
