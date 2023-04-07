package level1;

public class InnerProduct {

// 내적
		public static void main(String[] args) {
		
			System.out.println(solution(new int [] {1,2,3,4}, new int [] {-3,-1,0,2}));
			System.out.println(solution(new int [] {-1,0,1}, new int [] {1,0,-1}));
		}
		
		
		//
		public static int solution(int[] a, int[] b) {
	        int answer = 0;
	        for (int i = 0; i < b.length; i++) {
				answer += a[i] * b[i];
			}
	        return answer;
	    }

	}

