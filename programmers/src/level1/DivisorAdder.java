package level1;

public class DivisorAdder {

// 약수의 개수와 덧셈
		public static void main(String[] args) {
		
			System.out.println(solution(13, 17));
			System.out.println(solution(24, 27));
		}
		
		
		// left ~ right 까지의 모든 수 중에서 약수의 개수가 짝수면 더하고 홀수면 빼서 return
		// 약수의 갯수 for문 돌려서 나눠지면 answer에 더해주기
		public static int solution(int left, int right) {
			int answer=0;
			int count = 0;
			for (int i = left; i <= right; i++) {
				for (int j = 1; j <= i; j++) {
					if (i% j == 0) {
						count++;
					} 
				}
					if( count%2 == 0) {
						answer += i;
					} else {
						answer -= i;
					}
					count = 0;
			}
			return answer;
		}

	}

