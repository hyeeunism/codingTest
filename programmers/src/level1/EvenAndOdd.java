package level1;


// 짝수와 홀수
public class EvenAndOdd {
	
	public static void main(String[] args) {
	
		System.out.println(solutionOne(3));
		System.out.println(solutionTwo(4));

	}
	
	// 1
	 public static String solutionOne(int num) {
	        String answer = "";
	        if ( num%2 == 0) { answer = "Even"; }
	        else { answer = "Odd"; }
	        return answer;
	    }
	 
	 // 2
	 public static String solutionTwo(int num) {
	        String answer = num%2 == 0 ? "Even" : "Odd";
	        return answer;
	    }

}

