package level1;

public class SumOfAbs {

// 음양 더하기	
		public static void main(String[] args) {
		
			System.out.println(solution(new int[] { 4,7,12 }, new boolean[] {true, false, true}));
		}
		
		
		// int 배열과 boolean 배열을 하나하나씩 대입하여 음양 판별하여 저장
		// 다 합해주기
		public static int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
			for (int i = 0; i < signs.length; i++) {
				if ( signs[i] == true ) {
					answer += absolutes[i];
				}
				else {
					answer -= absolutes[i];
				}
			}
	        return answer;
	    }
	}

