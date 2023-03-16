package level1;

public class SumBetweenTwo {

// 두 정수 사이의 합	
		public static void main(String[] args) {
		
			System.out.println(solution(3,5));
			System.out.println(solution(6,5));
			System.out.println(solution(5,5));
		}
		
		
		public static long solution(int a, int b) {
	        long answer = 0;
	        int min = 0, max = 0;
	        if ( a>b) { max = a; min = b; }
	        if ( a<b) { max = b; min = a; }
	        
	        for (int i = min; min<=max; min++) {
	        	answer += min;
			}
        
            if ( a==b) { answer = a; }
        
	        return answer;
	    }
	}

