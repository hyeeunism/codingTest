package level1;

public class CollatzConjecture {

// 콜라츠 추측	
		public static void main(String[] args) {
		
			System.out.println(solution(6));
			System.out.println(solution(16));
			System.out.println(solution(626331));
		}
		
		
		// num을 long으로 안 바꿔주면 626331 넣어서 -1 나와야하는 코드가 다르게 나옴(488)
		public static int solution(int num) {
		      long n = (long)num;
		        
		    for(int i=0; i<500; i++){
		        if(n==1) return i; 
		      n = (n%2==0) ? n/2 : n*3+1;
		    }

		        return -1;
		    }

	}

