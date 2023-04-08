package level1;

public class NotEnoughAmt {

// 부족한 금액 계산하기	
		public static void main(String[] args) {
		
			System.out.println(solution(3,20,4));
			System.out.println(solution(7,40,2));
		}
		
		
		// n번째 이용하면 N배*price 
		// 1) 100 2) 200 3)300
		// count번 타게되면 얼마나 모자른지 return, 안부족하면 0
		public static long solution(int price, int money, int count) {
			long answer = 0;
			int need = 0;
			long sum = 0;
			for (int i = 1; i <= count; i++) {
				need = price * i;
				sum += need;
				if ( sum >= money) {
					answer = (long) sum-money;
				}
			}
			return answer;
		}

	}

