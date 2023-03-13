package level1;

public class PerfectSquareChecker {

	// 정수 제곱근 판별		
			public static void main(String[] args) {
			
				System.out.println(solution(121));
				System.out.println(solution(120));
			}
			// 제곱근? 어떤 수 x를 제곱하여 a가 되었을 때, x를 a의 제곱근이라고 한다.
			// 거듭제곱? 같은 수를 여러번 곱한 것
			
			// 1
			public static long solution(long n) {
		        long answer = 0;
		        double x = Math.sqrt(n);
		        if ( Math.pow((int)x, 2) == n) { answer = (long) Math.pow(x+1, 2); }
		        else { answer = -1; }
		        
		        
		        return answer;
		    }

}