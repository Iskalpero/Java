import java.util.*;

//using for class scanner

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example an use if ~
		
		int score = 0; // variable for save score;
		char grade = ' '; // reset and blank, variable for save grade;
		char opt = ' ';
		
		System.out.println("점수를 입력. > ");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		// save score an score type int data on screen;
		// suppose 0<= score <=100
		if(score >= 85) {			
			grade = 'A';
			if(score >= 95)
				opt = '+';
			else if(score <= 90 && score >= 85)
				opt = '-';
		} // 85 <= score <= 100 
		else if(score >= 75){
			grade = 'B';
			if(score >= 80)
				opt = '+';
		} // 75 <= score < 85
		else if(score >= 60) {
			grade = 'C';
			if(score >= 70)
				opt = '+';
		} // 60 <= score < 75
		else
			grade = 'D';
		// 0 <= score <60
		// decide a grade to score 
		
		
		System.out.printf("당신의 학점은 %c%c 입니다. \n",grade,opt);
		
		scanner.close();
	}

}
