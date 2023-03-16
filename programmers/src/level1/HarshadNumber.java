package level1;

public class HarshadNumber {

// 하샤드 수	
		public static void main(String[] args) {
		
			System.out.println(solution(18));
			System.out.println(solution(11));
		}
		
		// 18
		// 1+8 = 9
		// 18%9 = 0 == 하샤드 수
		
		// 1
		public static boolean solution(int x) {
	        boolean answer = true;
	        int num = x;
	        int sum = x%10;
	        
	        while ( num != 0) {
	        	num/=10;
	            sum +=(num%10);
	        }	        		
	        return ((x % sum)==0) ? true: false;    

	    }
		
	}

