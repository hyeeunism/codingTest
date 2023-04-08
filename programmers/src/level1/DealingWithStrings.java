package level1;

public class DealingWithStrings {

// 문자열 다루기 기본		
		public static void main(String[] args) {
		
			System.out.println(solution("a234"));
			System.out.println(solution("1234"));
		}
		
		
		// 길이가 4 or 6 + 숫자로만 구성되어있는지
		// "a234" F / "1234" True
		// char로 때서 아스키코드로 비교해봐야겠다
		public static boolean solution(String s) {
	        boolean answer = false;
	        int length = s.length();
	        if ( length == 4 || length == 6) {
	        	char [] cArr = s.toCharArray();
	        	for (int i = 0; i < cArr.length; i++) {
					if ( cArr[i] >=48 && cArr[i] < 58 ) {
						answer = true;
					} else {
						answer = false;
						break;
					}
				}
	        } 
			return answer;
	    }

	}

